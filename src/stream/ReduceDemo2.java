package stream;

import java.util.DoubleSummaryStatistics;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class ReduceDemo2 {
    public static void main(String[] args) {
        Stream<Nation> nations1 = Nation.nations.stream();
        nations1.reduce((n1, n2) ->
                        n1.getPopulation() > n2.getPopulation() ? n1 : n2)
                .ifPresent(Util::printWithParenthesis);

        Stream<Nation> nations2 = Nation.nations.stream();
        double reduce = nations2.filter(n -> n.getGdpRank() <= 20)
                .mapToDouble(n -> n.getPopulation())
                .reduce(0.0, (p1, p2) -> p1 + p2);
        System.out.println("\n 리스트에서 GDP 가 20위 이내인 나라의 인구 총합은 " + reduce + " 입니다.");

        Stream<Nation> nations3 = Nation.nations.stream();
        DoubleStream doubleStream = nations3.mapToDouble(Nation::getPopulation);
        DoubleSummaryStatistics dss = doubleStream.summaryStatistics();
        System.out.println(dss);
    }
}

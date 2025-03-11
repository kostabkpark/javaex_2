package stream;

import java.util.Objects;
import java.util.stream.Stream;

public class DistinctDemo2 {
    public static void main(String[] args) {
        Stream<Circle> cs = Stream.of(new Circle(3), new Circle(5), new Circle(3));
        cs.distinct().forEach(circle -> System.out.println(circle));
    }
}

class Circle {
    int r;
    public Circle(int r){
        this.r = r;
    }

    @Override
    public String toString() {
        return "반지름 " + r + "인 원";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return hashCode() == circle.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(r);
    }
}
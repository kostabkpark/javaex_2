package exercise.chapter7;

public class Ex3_1 {
    public static void main(String[] args) {
        Line l1 = new Line(20);
        //Line l2 = new Line(10);
        Concrete l2 = new Concrete(100,50);
        if(l1.compareTo(l2) == -999){
            System.out.println("비교할 수 없습니다.");
        } else {
            if(l1.compareTo(l2) == 0) {
                System.out.println("두 라인의 길이가 같습니다.");
            } else if(l1.compareTo(l2) > 0) {
                System.out.println("l1 라인이 l2 라인보다 깁니다.");
            } else if(l1.compareTo(l2) < 0) {
                System.out.println("l2 라인이 l1 라인보다 깁니다.");
            }
        }
    }
}

class Line implements Comparable {
    int length ;

    public Line(int length) {
        this.length = length;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Line) {
            Line l = (Line)o;
            if(this.length - l.length == 0){
                return 0;
            } else if (this.length - l.length > 0) {
                return 1;
            } else {
                return -1;
            }
        }
        return -999;
    }
}



package exercise.chapter7;

import java.util.Arrays;

public class Ex3_2 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(10,5);
        Triangle t2 = new Triangle(5,10);
        // 결과가 넓이가 같다.
        if(t1.compareTo(t2) == -888) {
            System.out.println("비교할 수 없습니다.");
        } else {
            if(t1.compareTo(t2) > 0) {
                System.out.println(t1 + " 이 " + t2 + "보다 더 큽니다.");
            } else if(t1.compareTo(t2) < 0) {
                System.out.println(t2 + " 이 " + t1 + "보다 더 큽니다.");
            } else {
                System.out.println(t1 + " 과 " + t2 + " 두 삼각형의 넓이가 같습니다.");
            }
        }
        // 배열에 담아서 정렬전, 정렬, 정렬후 로 확인해보기
        Triangle[] triangles = {
                new Triangle(10,20),
                new Triangle(10,10),
                new Triangle(10,5),
                new Triangle(7,8)
        };
        System.out.println(Arrays.toString(triangles));
        Arrays.sort(triangles);
        System.out.println(Arrays.toString(triangles));
    }
}

class Triangle implements Comparable{
    int height;
    int width;

    public Triangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public int compareTo(Object o) {
        int result = -888;
        if(o instanceof Triangle t) {
            if(this.getArea() > t.getArea()) result = 1;
            else if(this.getArea() < t.getArea()) result = -1;
            else result = 0;
        }
        return result;
    }

    private double getArea() {
        return (height * width) / (double)2 ;
    }

    @Override
    public String toString() {
        return "삼각형[" +
                "width = " + width +
                ", height = " + height +
                ", 넓이 = " + getArea() +
                ']';
    }
}

package exercise.chapter8;

import java.util.Objects;

public class Ex1_1 {
    public static void main(String[] args) {
        Circle c1 = new Circle(3, "빨강");
        Circle c2 = new Circle(3, "빨강");

        if(c1.equals(c2)) {
            System.out.println("c1 과 c2 는 같다.");
        } else {
            System.out.println("c1 과 c2 는 다르다.");
        }
    }
}

class Circle {
    int radius;
    String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return this.hashCode() == circle.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, color);
    }
}
package exercise.chapter7;

public class Ex3_4 {
    public static void main(String[] args) {
        Person p1 = new Person("박지성", 40, 175, 68);
        Person p2 = new Person("손흥민", 20, 180, 70);
        //Line p2 = new Line(10);
        if(p1.compareTo(p2) == -999) {
            System.out.println("나이를 비교할 수 없습니다.");
        } else {
            if (p1.compareTo(p2) > 0) {
                System.out.println(p1.name + "이 나이가 더 많습니다.");
            } else if(p1.compareTo(p2) < 0) {
                System.out.println(p2.name + "이 나이가 더 많습니다.");
            } else {
                System.out.println(p1.name + "과 " + p2.name + "은 나이가 같습니다.");
            }
        }
    }
}

class Person implements Comparable {
    String name;
    int age; // 기준
    int height;
    int weight;

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Object o) {
        int result = -999;
        if(o instanceof Person p) {
            if(this.age > p.age) result = 1;
            else if(this.age < p.age) result = -1;
            else result = 0;
        }
        return result;
    }
}
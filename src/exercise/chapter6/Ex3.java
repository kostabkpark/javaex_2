package exercise.chapter6;

public class Ex3 {
  public static void main(String[] args) {
    Person[] persons = new Person[3];
    persons[0] = new Person("길동이", 22);
    persons[1] = new Student("황진이", 23, 100);
    persons[2] = new ForeignStudent("Amy", 30, 200, "U.S.A");

    for(Person person : persons) {
      person.show();
    }
  }
}

class Person {
  private String name;
  private int age;
  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  void show(){
    System.out.printf("사람[이름 : %s , 나이 : %d] \n" ,name,age);
  }
}

class Student extends Person {
  private int studentNumber;

  public int getStudentNumber() {
    return studentNumber;
  }

  public void setStudentNumber(int studentNumber) {
    this.studentNumber = studentNumber;
  }

  public Student(String name, int age, int studentNumber) {
    super(name, age);
    this.studentNumber = studentNumber;
  }

  @Override
  void show(){
    System.out.printf("사람[이름 : %s , 나이 : %d , 학번 : %d] \n" ,super.getName(),super.getAge(), studentNumber);
  }
}

class ForeignStudent extends Student {
  private String nationality;

  public String getNationality() {
    return nationality;
  }

  public ForeignStudent(String name, int age, int studentNumber, String nationality) {
    super(name, age, studentNumber);
    this.nationality = nationality;
  }

  @Override
  void show() {
    System.out.printf("사람[이름 : %s , 나이 : %d , 학번 : %d, 국적 : %s] \n" ,
        super.getName(),super.getAge(), super.getStudentNumber(), nationality);
  }
}
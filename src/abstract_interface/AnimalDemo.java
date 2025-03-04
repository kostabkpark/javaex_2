package abstract_interface;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal[] animals = {
          new Dog(),
          new Cuckcoo()
        };
        for(Animal animal:animals){
            animal.sound();
        }
        System.out.println("=============");
        Dog dog = new Dog();
        makeSound(dog); // 강아지가 소리를 낸다.
        Cuckcoo cuckcoo = new Cuckcoo();
        makeSound(cuckcoo); // 뻐꾸기가 소리를 낸다.
    }

    static void makeSound(Animal animal){
        animal.sound();
    }
}

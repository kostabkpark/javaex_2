package default_package;

public class ObjectDemo {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard("키보드");

        Class c =keyboard.getClass();
        System.out.println(c.getName());

        Keyboard keyboard1 = new Keyboard("키보드");
        Mouse mouse = new Mouse("마우스");
        Mouse mouse1 = new Mouse("마우스");

        System.out.println(keyboard);
        System.out.println(mouse);

        System.out.println("keyboard == keyboard1 : " + (keyboard == keyboard1));
        System.out.println("keyboard.equals(keyboard1) : " + keyboard.equals(keyboard1));

        System.out.println("mouse.equals(mouse1) : " + mouse.equals(mouse1));
    }
}

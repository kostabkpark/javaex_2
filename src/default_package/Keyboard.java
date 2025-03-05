package default_package;

class Keyboard {
    String name;

    public Keyboard(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Keyboard[" +
                "name='" + name + '\'' +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Keyboard){
            Keyboard keyboard = (Keyboard) o;
            if(name.equals(keyboard.name)) {
                return true;
            }
        }
        return false;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hashCode(name);
//    }
}

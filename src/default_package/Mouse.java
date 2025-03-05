package default_package;

class Mouse {
    String name;

    public Mouse(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Mouse[" +
                "name='" + name + '\'' +
                ']';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Mouse) {
            Mouse mouse = (Mouse)obj;
            if(name.equals(mouse.name)){
                return true;
            }
        }
        return false;
    }
}

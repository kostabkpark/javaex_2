package exercise.chapter9;

public class Ex1 {
    public static void main(String[] args) {
        Box<Integer> i = new Box<>();
        i.set(Integer.valueOf(100));
        System.out.println(i.get());

        Box<String> s = new Box<>();
        s.set("만능이네");
        System.out.println(s.get());
    }
}

class Box<T> {
    private T data;

    public T get(){
        return data;
    }

    public void set(T data) {
        this.data = data;
        return ; // 반환값이 없이 return 만 하는 함수
    }
}

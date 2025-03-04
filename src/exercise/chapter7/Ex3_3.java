package exercise.chapter7;

public class Ex3_3 {
    public static void main(String[] args) {
        Book b1 = new Book(15000);
        Book b2 = new Book(5000);
        int res = b1.compareTo(b2);
        // Book[15000] 이 Book[5000] 보다 비쌉니다.
        if(res == -999) {
            System.out.println("비교할 수 없습니다.");
        } else {
            if(res > 0) {
                System.out.println(b1 + "이 " + b2 + "보다 비쌉니다.");
            }
        }
    }
}

class Book implements Comparable {
    int price;

    public Book(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Book b) {
            if(this.price > b.price) {
                return 1;
            } else if(this.price < b.price) {
                return -1;
            } else {
                return 0;
            }
        }
        return -999;
    }

    @Override
    public String toString() {
        return "Book[" +
                "price=" + price +
                ']';
    }
}

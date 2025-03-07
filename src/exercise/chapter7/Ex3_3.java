package exercise.chapter7;

import java.util.Arrays;

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
            } else if (res < 0) {
                System.out.println(b2 + "이 " + b1 + "보다 비쌉니다.");
            } else {
                System.out.println(b1 + "과 " + b2 + "는 가격이 같습니다.");
            }
        }

        // 3개의 Book 객체로 구성된 Book 배열을 사용해 가격 순서대로(오름차순) 정렬한 후 출력하라
        Book[] books = {
                new Book(15000),
                new Book(50000),
                new Book(20000)
        };
        System.out.println("정렬전");
        for (Book book : books) {
            System.out.println(book);
        }
        Arrays.sort(books);
        System.out.println("정렬후");
        for (Book book : books) {
            System.out.println(book);
        }

        // 내림차순으로 정렬하는 방법 - 함수형 인터페이스와 람다식을 활용하여 !!
        Arrays.sort(books, (o1, o2)->o2.compareTo(o1));
        System.out.println(Arrays.toString(books));
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

class Book {
    String title;
    int price;
    int num = 0;

    Book() { // 디폴트 생성자
        // 원래 생성자는 아무 기능이 없음
        title = "자바 프로그래밍";
        price = 30000;
    }

    Book(String t, int p) { // 생성자의 오버로딩
        // 매개변수가 있는 생성자를 만듦, 매개변수 값을 받아 매개변수 초기화
        title = t;
        price = p;
    }

    void print() {
        System.out.println("제목: " + title);
        System.out.println("가격: " + price);
        System.out.println("주문수량: " + num);
        System.out.println("합계금액: " + price * num);
    }
}

public class consturctorUse {
    public static void main(String[] args) {
        Book book1 = new Book(); // Book()은 폴트 생성자, 객체 생성할 때 호출하는 특수한 메서드
        book1.print();

        Book book2 = new Book("자바 디자인패턴", 35000);
        book2.num = 10;
        book2.print();

        // 주의!! 매개변수가 있는 생성자를 오버로딩해서 만들면 디폴트 생성자를 명시적으로 만들어 줘야함
        // 오버로딩: 하나의 클래스 내에 매개변수 개수나 자료형은 다르지만 메서드명은 같은 메서드를 여러개 정의하는 것
    }
}
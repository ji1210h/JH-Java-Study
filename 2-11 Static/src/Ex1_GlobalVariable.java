class Cat {
    static int a = 5; // 전역변수
    int num = 3;

    void printValue(int num) {
        this.num = num;
        System.out.println("num: " + this.num);
        System.out.println("a: " + a);
    }
}

public class Ex1_GlobalVariable {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 2;
        System.out.println(num1 + "," + num2);

        Cat cat1 = new Cat();
        cat1.num = 1;
        cat1.a = 10; // 전역변수에 직접 접근
        cat1.printValue(20); // 함수 호출 -> num:20, a:10
        System.out.println(cat1.num); // 20
        System.out.println(cat1.a); // 10

        Cat cat2 = new Cat();
        cat2.num = 2;
        cat2.a = 11;
        cat2.printValue(10); // 함수 호출 -> num:10, a:11
        System.out.println(cat2.num); // 10
        System.out.println(cat2.a); // 11
        System.out.println(cat1.a); // 11(cat2 객체의 a변수를 바꿨는데 cat1의 a도 바뀜)
    }
}

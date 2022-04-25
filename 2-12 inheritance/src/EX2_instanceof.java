public class EX2_instanceof {
    public static void main(String[] args) {
        Cry test1 = new Cat();
        if (test1 instanceof Cat) { // 객체가 지정한 클래스형의 객체인지 조사하는 연산자
            test1.cry();
        }
        if (test1 instanceof Dog) {
            System.out.println("고양이가 아닙니다");
        }
    }
}

interface Cry {
    void cry();
}

class Cat implements Cry {
    public void cry() {
        System.out.println("야옹");
    }
}

class Dog implements Cry {
    public void cry() {
        System.out.println("멍멍");
    }
}
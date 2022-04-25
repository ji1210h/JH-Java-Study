public class MyStarCraft {

}

abstract class Unit { // 부모 클래스
    abstract void doMove(); // 추상 클래스
}

class Marine { // 자식클래스
    void doMove() { // 추상 클래스 구현
        System.out.println("이동");
    }
}

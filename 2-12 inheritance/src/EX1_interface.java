public class EX1_interface {
    public static void main(String[] args) {
        Morning A = new Morning();
        A.greet();
        A.talk();
    }
}

interface Greet {
    void greet(); // 추상 메서드
}

interface Talk {
    void talk(); // 추상 메서드
}

class Morning implements Greet, Talk {
    public void greet() {
        // implements 예약어 사용 시 추상메서드를 구상메서드로 오버라이딩해서 구현해야 함
        System.out.println("안녕하세요.");
    }

    public void talk() {
        System.out.println("날씨 좋네요.");
    }
}

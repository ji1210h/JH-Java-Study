public class GuGu {

    public void dan(int n) {
        for (int i = 0; i < 10; i++) {
            System.out.println(n * i);
        }
    }

    public static void main(String[] args) {
        int n = 2; // 정수형 변수 선언
        System.out.println(n * 2);
        // 1. 이렇게 연산자로 계산해 출력할 수 있다.
        // 2. main 메소드가 복잡해지므로 새로운 dan 메소드를 만들어본다.
        GuGu gugu = new GuGu(); // 객체(=새로 생성된 자료형)를 만들 때 new키워드를 사용한다.
        gugu.dan(5);
    }

}

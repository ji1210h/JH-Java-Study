import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in); // 입력 처리 객체
            showMenu();

            int num = sc.nextInt();

            if (num == 0) {
                break;
            } else if (num > 5) {
                System.out.println("잘못 선택했습니다.");
                continue;
            }

            System.out.print("첫 번째 숫자는 ");
            int a = sc.nextInt();
            System.out.print("두 번째 숫자는 ");
            int b = sc.nextInt();

            if (num == 1) {
                int total = plus(a, b); // 변수에 반환값을 넣어주고 출력해야함
                System.out.println(total + "\n");
            }
            if (num == 2) {
                int total = minus(a, b); // 변수에 반환값을 넣어주고 출력해야함
                System.out.println(total + "\n");
            }
            if (num == 3) {
                int total = mul(a, b); // 변수에 반환값을 넣어주고 출력해야함
                System.out.println(total + "\n");
            }
            if (num == 4) {
                int total = div(a, b); // 변수에 반환값을 넣어주고 출력해야함
                System.out.println(total + "\n");
            }
        }

    }

    public static void showMenu() {
        System.out.println("----메뉴를 선택하세요----");
        System.out.println("1. 더하기");
        System.out.println("2. 빼기");
        System.out.println("3. 곱하기");
        System.out.println("4. 나누기");
        System.out.println("0. 끝내기");
    }

    public static int plus(int a, int b) { // 반환값이 있도록 만듦
        int dap = a + b;
        return dap; // int형 반환값
    }

    public static int minus(int a, int b) { // 반환값이 있도록 만듦
        int dap = a - b;
        return dap; // int형 반환값
    }

    public static int mul(int a, int b) { // 반환값이 있도록 만듦
        int dap = a * b;
        return dap; // int형 반환값
    }

    public static int div(int a, int b) { // 반환값이 있도록 만듦
        int dap = a / b;
        return dap; // int형 반환값
    }

}

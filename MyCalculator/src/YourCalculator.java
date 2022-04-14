import java.util.Scanner;

public class YourCalculator {
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
                plus(a, b);
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

    public static void plus(int a, int b) {
        int dap = a + b;
        System.out.println(dap + "\n");
    }

}

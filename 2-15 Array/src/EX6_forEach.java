public class EX6_forEach {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        for (int e : arr) { // 배열의 요소를 하나씩 꺼내주면서 반복 실행
            System.out.println(e + " ");
        }
    }
}

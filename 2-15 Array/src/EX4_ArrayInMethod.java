public class EX4_ArrayInMethod {
    public static void main(String[] args) {
        int[] arr = makeInArray(5);
        int sum = sumOfArray(arr);
        System.out.println(sum);

    }

    public static int[] makeInArray(int len) { // 반환형이 배열형
        int[] arr = new int[len]; // int[] arr = new int[]; 배열 선언 생성
        for (int i = 0; i < len; i++) {
            arr[i] = i; // int형 배열에 정수 저장
            // arr[0]=0
            // arr[1]=1 ...
        }
        return arr;
    }

    public static int sumOfArray(int[] arr) { // 매개변수가 배열형
        int sum = 0;
        for (int i = 0; i < arr.length; i++) { // 배열의 요소 개수만큼 반복문 실행
            sum = sum + arr[i];
        }
        return sum;
    }
}

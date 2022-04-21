public class EX1_IntArray {
    public static void main(String[] args) {
        // int num = 0; 정수형 하나를 저장하는 변수
        int[] iArr = new int[10]; // 배열형 선언과 대입
        int[] iArr1; // 배열형 선언 후
        iArr1 = new int[10]; // 대입 가능
        iArr[0] = 1; // iArr의 0번방에 1저장

        System.out.println("iArr길이: " + iArr.length);
        System.out.println("iArr[0]: " + iArr[0]);
    }
}

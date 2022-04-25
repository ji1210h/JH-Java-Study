public class EX1_Compare {
    public static void main(String[] args) {
        String str1 = new String("자바프로그래밍");
        String str2 = new String("자바프로그래밍");
        String str3 = "자바프로그래밍";
        String str4 = "자바프로그래밍";
        // 1,2번은 new 연산자를 이용해 객체를 힙에 만들고 값을 변수에 대입하고 있음
        // 3,4번은 문자 리터럴을 직접 대입, 내부적으로 new String 호출
        if (str1 == str2)
            System.out.println("동일 객체 참조");
        else
            System.out.println("다른 객체 참조");
            
        if (str3 == str4)
            System.out.println("동일 객체 참조");
        else
            System.out.println("다른 객체 참조");
    }
}

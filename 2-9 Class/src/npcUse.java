class npc { // 클래스 정의
    String name; // 필드
    int hp;

    void say() // 매서드
    {
        System.out.println("안녕하세요.");
    }
    // 필드 & 매서드는 클래스의 멤버이다.
    // 클래스는 추상화하여 기술해놓은 설계도, 객체는 설계도를 기초로 실체화된 것

}

public class npcUse {
    public static void main(String args[]) {
        npc saram1 = new npc(); // 클래스를 이용해 객체 생성 (new를 통해 생성)

        saram1.name = "지희"; // 멤버변수(필드)에 직접 접근
        saram1.hp = 100;
        System.out.println(saram1.name + ":" + saram1.hp);
        saram1.say(); // 매서드 호출
    }
}

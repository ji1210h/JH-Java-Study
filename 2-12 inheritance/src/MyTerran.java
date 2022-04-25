class Unit {
    String name;
    int hp;

    void doMove() { // 부모 메서드
        System.out.println("이동속도 10으로 이동");
    }
}

class Marine extends Unit // 자식 클래스
{
    int attack;

    void doMove() { // 부모 메서드와 같은 이름의 자식 메서드 1
        super.doMove(); // super예약어로 부모 메서드를 구분함
        System.out.println(attack + " 공격");
        // 부모의 메서드를 호출하고 자체 기능을 추가함
    }
}

class Medic extends Unit {
    int heal;

    void doMove() { // 부모 메서드와 같은 이름의 자식 메서드 2
        System.out.println("이동속도 8으로 이동");
        System.out.println(heal + " 치유");
        // 부모 메서드를 호출하지 않고 자체 구현 기능만 사용
    }
}

public class MyTerran {
    public static void main(String[] args) {
        Marine unit1 = new Marine();
        unit1.name = "마린";
        unit1.hp = 100;
        unit1.attack = 20;

        Medic unit2 = new Medic();
        unit2.name = "메딕";
        unit2.hp = 120;
        unit2.heal = 10;

        unit1.doMove();
        System.out.println();
        unit2.doMove();
    }
}

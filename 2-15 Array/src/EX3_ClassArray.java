public class EX3_ClassArray {
    public static void main(String[] args) {
        Box[] CArr = new Box[5];
        CArr[0] = new Box("이지희");
        CArr[1] = new Box("홍길동");
    }
}

class Box {
    String name;

    Box(String n) { // 클래스의 생성자 오버로딩
        this.name = n;
        System.out.println(name + "!");
    }
}

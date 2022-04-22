public class EX7_forEachObject {
    public static void main(String[] args) {
        House[] arr = new House[5]; // 클래스형 객체

        arr[0] = new House(101, "이지희");
        arr[1] = new House(102, "홍길동");

        for (House e : arr) { // 배열의 요소를 하나씩 꺼내주면서 반복 실행
            System.out.println(e.getHouseNum() + " " + e.getName());
        }
    }
}

class House {
    private int houseNum;
    private String name;

    House(int houseNum, String name) {
        this.houseNum = houseNum;
        this.name = name;
    }

    public int getHouseNum() {
        return houseNum;
    }

    public String getName() {
        return name;
    }
}
public class privateUse {
    public static void main(String[] args) {
        Student1 st1 = new Student1();
        st1.name1 = "홍길동"; // 직접 접근 가능
        st1.age1 = 20;
        System.out.printf("%s %d\n", st1.name1, st1.age1);

        Student2 st2 = new Student2("이지희", 21);
        // System.out.printf(st2.name2, age2);
        st2.name2 = "이땡땡";
        // st2.age2=22; 접근 불가!!
        st2.setAge(22);
        int age2 = st2.getAge(); // age2에 return age2를 저장함
        System.out.printf("%s %d", st2.name2, age2); // 출력할 때 age2를 출력해야 함
    }
}

class Student1 {
    String name1;
    int age1;
    // 멤버 변수의 접근 제한자가 정해져있지 않기 때문에 default 상태
    // 같은 폴더 안의 클래스에서 언제든지 변수에 접근할 수 있음
}

class Student2 {
    public String name2;
    private int age2;
    // private, 다른 클래스에서 접근 불가하므로 getAge() 메서드를 제공하여 접근 가능하게 함

    public Student2(String name, int age) {
        this.name2 = name;
        this.age2 = age;
        // 여기서 this를 쓴 이유? 멤버변수와 매개변수명이 겹치면 this를 써서 멤버변수임을 구분해줌
        // (원래는 name이었는데 name2로 구분지어줌)
    }

    public int getAge() { // 다른 클래스에서 가져갈 수 있게 getAge()제공
        return age2;
    }

    public void setAge(int age) { // 값을 대입하는 setAge()제공
        this.age2 = age;
    }
    // 게터, 세터를 지정하여 변수에 접근하는 이유는 부적절한 값의 대입을 막기 위함!!
}
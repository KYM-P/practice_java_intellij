package practice_space;

public class student_class_test {
    int ID;
    String Name;
    int grade;
    String address;

    public static int Numb = 0; // 모든 인스턴스가 공유하는 변수

    public student_class_test() {
        // this(ID내용, Name내용, grade내용, address내용); 으로 다른 생성자를 호출할 수 있다.
    } // 디폴트 생성자

    public student_class_test(int pID, String pname, int pgrade, String paddress) { // 생성자 - 인스턴스를 만들 때 한번에 내용을 넣을 수 있으며 디폴트 생성자를 추가로 만들어야 한다.
        ID = pID;
        Name = pname;
        grade = pgrade;
        address = paddress;
    }
    public void showStudentInfo(){
        System.out.println(Name + "," + address);
    }
    public void showThis() {
        System.out.println(this); // 패키지명.클래스명@주소
        this.showStudentInfo(); // this 예약어 사용 -> 생성된 인스턴스인 자신을 가리킨다.
    }
    public static int Numbup() {
        student_class_test.Numb += 1;
        System.out.println(student_class_test.Numb);
        return 0;
    }

}

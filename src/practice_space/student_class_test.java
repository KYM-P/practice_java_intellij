package practice_space;

public class student_class_test {
    int ID;
    String Name;
    int grade;
    String address;

    public static int Numb = 0; // ��� �ν��Ͻ��� �����ϴ� ����

    public student_class_test() {
        // this(ID����, Name����, grade����, address����); ���� �ٸ� �����ڸ� ȣ���� �� �ִ�.
    } // ����Ʈ ������

    public student_class_test(int pID, String pname, int pgrade, String paddress) { // ������ - �ν��Ͻ��� ���� �� �ѹ��� ������ ���� �� ������ ����Ʈ �����ڸ� �߰��� ������ �Ѵ�.
        ID = pID;
        Name = pname;
        grade = pgrade;
        address = paddress;
    }
    public void showStudentInfo(){
        System.out.println(Name + "," + address);
    }
    public void showThis() {
        System.out.println(this); // ��Ű����.Ŭ������@�ּ�
        this.showStudentInfo(); // this ����� ��� -> ������ �ν��Ͻ��� �ڽ��� ����Ų��.
    }
    public static int Numbup() {
        student_class_test.Numb += 1;
        System.out.println(student_class_test.Numb);
        return 0;
    }

}

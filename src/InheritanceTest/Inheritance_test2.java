package InheritanceTest;

public class Inheritance_test2 extends Inheritance_test1 {
    int A2 = 60;

    public Inheritance_test2() { } // ����Ʈ ������

    public Inheritance_test2(int input) {
        super( input ); // ���� Ŭ������ ������ ȣ��
        A2 = input;
    }

    public void ShowInfo() { // ���� Ŭ������ ShowInfo �� �ƴ� �ش� ShowInfo ����� ���� ������
        System.out.println(this + " A2 = " + A2);
    }

    public void SuperShowInfo() {
        super.ShowInfo();
    }
}

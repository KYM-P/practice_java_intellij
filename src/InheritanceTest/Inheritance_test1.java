package InheritanceTest;

import java.util.ArrayList;

public class Inheritance_test1 {
    protected  int A1 = 50; // protected -> ��ӹ��� �ν��Ͻ��� ��� ����

    public Inheritance_test1() {} // ����Ʈ ������

    public Inheritance_test1(int input) { // �Ű����� ������
        A1 = input;
    }

    public void ShowInfo() {
        System.out.println(this + "A1 = " + A1);
    }

    public void PrintOut () {
        System.out.println("Test");
    }

    public static void main(String[] args) {
        ArrayList<Inheritance_test1> InheritanceList = new ArrayList<>(); // Inheritance_test1 ���� �迭 ����

        for (int i = 0; i < InheritanceList.size(); i++) { // �迭�� ��� �߰�.
            InheritanceList.add(new Inheritance_test2(70 + i));
        }

        for  (Inheritance_test1 Obj : InheritanceList){ // ���� for ��
            Obj.ShowInfo();
            System.out.println(Obj.A1);
            //System.out.println(Obj.A2); Obj �� Inheritance_test1 �̹Ƿ� ���� �ڷ����� Inheritance_test2 ���� ��� �Ұ���
        }

        for (int i = 0; i < InheritanceList.size(); i++) {
            Inheritance_test1 DownCasting = InheritanceList.get(i);
            if (DownCasting instanceof Inheritance_test2) { // DownCasting �� ���� �ڷ����� Inheritance_test2 ���
                Inheritance_test2 DC_test = (Inheritance_test2)DownCasting; // �ٿ� ĳ����
                System.out.println("T.A2 " + i + " = " + DC_test.A2); // �ٿ�ĳ�������� Inheritance_test2 �ڷ������� �ٲ�� A2 ��� ����
            }
            else {
                System.out.println("�������� �ʽ��ϴ�.");
            }
        }
    }
}

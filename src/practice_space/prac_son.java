package practice_space;

public class prac_son extends prac_mother { // prac_mther ���� ��ӹ���

    int A2 = 60;

    // super(); ���� Ŭ������ �޾ƿ��� ����� super / ������ ���� ���� ���� Ŭ������ ����Ʈ ������ ����

    public prac_son(int a, int b) {
        super(3, 4); // ���� Ŭ������ ������ �� �ڵ����� ���� Ŭ������ �����ϹǷ� ���� Ŭ������ �����ڿ� �ʷ��� �Ű������� super �� ���� ����
        System.out.printf(super.B2);
    }

    public void ppp () {
        // B1 = "B2";   ��� �� Ŭ������ B1�� private ����� �� ��ӹ��� Ŭ�������� ����� �� ����.
        B2 = "B3"; //   protected ������ ������ ������ ��ӹ޾��� �� ����� �� �ִ�.
    }

    public void pp () { // ���� Ŭ������ pp �żҵ带 ������
        prac_mother Test1 = new prac_son(4, 5); // ���� Ŭ���� prac_son �� ���� Ŭ���� prac_mother �� �ڷ������� ���� ���� / �� ����� prac_mother ������ ��� ����
        /*
        if (A instanceof B) {   A�� ���� �ڷ����� B�� �ڷ������� Ȯ�� / [�ƹ� �ڷ���] A = new B(); ���� Ȯ���ϴ� ����
            [���ο� �ڷ���] [���ο� �̸�] = (���ο� �ڷ���)A;    �ٿ� ĳ����
        }
         */
    }

}

package InnerClass;

public class InnerClass_test1 {
    private int k = 0; // ���� ����(���Ұ�), �ν��Ͻ�(��밡��)
    private static int kk = 0; //���� ����(��밡��), �ν��Ͻ�(��밡��)
    public static void main (String[] arg) {
        Class1 c1 = new Class1();
        int a = c1.mValue2; // ���� ����
        int b = c1.mValue1;
    }
    // ���� ���� Ŭ���� ( �ܺ� Ŭ������ ���� ������ ��� ����)
    static class Class1 { // static class �� �ƴϸ� static void main ���� ��� �Ұ�
        private int mValue1; // �ܺ� Ŭ���� ���� ���� ����
        int mValue2;

        Class1() { // ������
            mValue1 = 0;
            mValue2 = 0;
        }
        Class1(int a, int b) {
            mValue1 = a;
            mValue2 = b;
        }
        public int getValueOne() {
            return mValue1;
        }
    }
    // �ν��Ͻ� ���� Ŭ���� ( �ܺ� Ŭ���� �ν��Ͻ�, �������� ��� ���� )
    class Class2 {
        int aa = k;
    }
}

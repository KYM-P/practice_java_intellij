package List;

public class List_basic {
    public static void main (String[] args){
        int[] IntArray1 = new int[] {1,2}; // 1,2 ��Ҹ� ���� ũ�� 2�� int �� �迭 ����
        float floatArray[] = new float[3]; // 3���� ũ�⸦ ���� float �� �迭 ���� (int[] a �� int a[] �� ���̴� ����)
        String[][] StringArray1 = new String[][] {{"1","2"},{"3","4"}}; // 2x2 �� String �迭 ����

        int[] IntArray2 = new int[3];
        System.arraycopy(IntArray1, 0, IntArray2, 0, 2); // (������ ���� �迭, ���� �迭���� ������ ó�� ��ġ��, �����ؼ� ������ �迭, ���簪�� ������ ó�� ��ġ��, ������ ��� ����)
        System.out.println("�迭����"); // �迭�� �ν��Ͻ��� �ƴ� �⺻ ���̶�� �������� �ٲ�� ����
        IntArray1[1] = 3;
        System.out.println(IntArray2[1]);
        IntArray2[1] = 4;
        System.out.println(IntArray2[1]);
        IntArray1[1] = 2;
        System.out.println(IntArray2[1]);

        // ���� for ��
        System.out.println("���� for ��");
        for (int a : IntArray2) { // ���� for �� IntArray1�� ��Ұ��� �տ������� a �� �����ϸ� �ݺ�
            System.out.println(a);
        }
    }
}

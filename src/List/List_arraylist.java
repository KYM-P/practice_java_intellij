package List;

import java.util.ArrayList;

public class List_arraylist {

    int Num = 50;

    public static void main(String[] args) {

        // ArrayList Ŭ���� ���� �迭
        ArrayList<List_arraylist> ListArray1 = new ArrayList<List_arraylist>(); // ArrayList<E> ���� E�� ���׸� �ڷ���
        ArrayList<List_arraylist> ListArray2 = new ArrayList<List_arraylist>(2);
        ArrayList<Integer> IntArray1 = new ArrayList<Integer>();
        ArrayList ListArray3 = new ArrayList();

        // ArrayList 2 ���� �迭 1
        ArrayList<Integer>[] IntArray2 = new ArrayList[10];
        for (int i = 0; i < 10; i++) {
            IntArray2[i] = new ArrayList<Integer>();
        }

        // ArrayList 2 ���� �迭 2
        ArrayList<ArrayList<Integer>> IntArray3 = new ArrayList<>();
        IntArray3.add(new ArrayList<Integer>());
        IntArray3.get(0).add(30);
        IntArray3.add(new ArrayList<Integer>());
        IntArray3.get(1).add(40);
        System.out.println(IntArray3.toString());

        /* ArrayList (�������� �迭�� ����� �� ����)
         * ArrayList<���׸� �ڷ���> �迭�̸� = new ArrayList<���׸� �ڷ���>(��� ����); * <���׸� �ڷ���> �����ϰ� ���� ����
         * ArrayList.add(E e) ��� �߰� * add(int index, E e) �ش� �ε����� �� �߰�, ���� ���� �и�
         * .size() �迭 ũ�� ��ȯ
         * .get(int index) �ش� ��ġ�� ��Ұ� ��ȯ
         * .set(int index, E e) �ش� ��ġ�� ��Ұ� ��ü
         * .indexOf(value) �ش� ���� �ִ� index�� ��ȯ
         * .contains(value) �ش� ���� �ִ��� ��/���� �� ��ȯ
         * .clear() ��Ҹ� ���� ���
         * .addAll(ArrayList arraylist) �ش� ����Ʈ�� �� ��� �߰�
         * .remove(int index) �ش� ��ġ�� ��Ұ� ��ȯ �� ����
         * .isEmpty() �迭�� ����ִ��� Ȯ��
         */
        ListArray1.add(new List_arraylist());
        ListArray1.add(new List_arraylist());
        ListArray1.set(1, new List_arraylist());
        ListArray2.addAll(ListArray1);

        System.out.println("�迭 ����");
        System.out.println("���� ���� �� ������ = "+ ListArray2.get(0).Num);
        ListArray1.get(0).Num = 70;
        System.out.println("���� ���� �� ������ = "+ ListArray2.get(0).Num); // ��ü �迭�� �������� �����Ű�� ������ �迭�� ����ȴ�. (�ּҸ� �̿��ϱ� ����)
    }
}
package Vector;

import java.util.Vector;

public class Vector_basic {

    public static void main (String[] args) {
        Vector<Integer> v = new Vector<>(); // var v = new Vector<Integer>(); var�� �޺κ��� �ڷ����� ���� �����Ͽ� ����

        v.add(5);
        v.add(4);
        v.add(-1);
        System.out.println("���� ���: " + v);
        System.out.println("���� ��� ����: " + v.size());
        System.out.println("���� ���� �뷮: " + v.capacity());
        System.out.println("���� 0��° ���: " + v.get(0));

        v.add(2, 3); // 2�� �ڸ��� 3 �߰� (���� 2�� ������ ���� �з���)
        System.out.println("index 2���� 3 �߰� �� ���� ���: " + v);
        v.remove(0);
        System.out.println("index 0�� ���� �� ���� ���: " + v);
        v.removeAllElements(); // v.clear �� ����
        System.out.println("��ü ���� �� ���� ���: " + v);

        /* Vector  (������ ���� ���� �״�� ��½� ��� ��� ���)
         * Vector<E> �̸� = new Vector<E>();
         * .add(input) input ���� ���� �������� �߰�
         * .add(index, input) input ���� ���� index ��ġ�� �߰� �� ���������� �ڷ� �и�
         * .remove(index) index ���� ���Ϳ��� ����
         * .removeAllElements() ������ ��� ��� ����
         * .clear() ������ ��� ��� ����
         */
    }
}

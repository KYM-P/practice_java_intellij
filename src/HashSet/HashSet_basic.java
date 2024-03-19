package HashSet;

import java.util.HashSet;

public class HashSet_basic {
    static HashSet<Integer> i = new HashSet<>();

    public static void main ( String[] args) {
        i.add(10);
        i.add(20);
        i.add(30);
        System.out.println(i);
        System.out.println("i �� 10�̶�� ��Ұ� �ִ°�? : " + i.contains(10));
        i.remove(10);
        System.out.println("i ���� ��� 10�� ���� �Ŀ��� 10�� ���� �ϴ°�? : " + i.contains(10));
        i.clear();
        System.out.println(i);

    }
    /* HashSet (*������ ������ �ʴ´� => index ����)
     * HashSet<E> hs = new HashSet<E>();
     * -HashSet<Integer> hs2 = new HashSet<E>(10);
     * -�ʱⰪ�� ������ ����
     * --HashSet<Integer> hs3 = new HashSet<E>(hs2)
     * --hs2 �� ��Ҹ� �״�� ������ ���� (array ���� �ڷ����� ���� ����)
     *
     * .add(value) value ���� ������ ��� �߰� (�̹� ����? false : true)
     * .contains(value) value ���� ������ ��Ұ� �����ϴ��� Ȯ�� (����? true : false)
     * .size() HashSet �� ũ�� ��ȯ (���� ����� ��)
     * .remove(value) �ش� value ���� ���� ��Ҹ� ���� (���� ����? true : false)
     * .clear() ��� ��� ����
     */
}

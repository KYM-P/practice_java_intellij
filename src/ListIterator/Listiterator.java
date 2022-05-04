package ListIterator;

import java.util.ListIterator;
import java.util.ArrayList;

public class Listiterator {
    public static void main (String[] args) {
        ArrayList<String> arraylist = new ArrayList<>();
        arraylist.add("abc");
        arraylist.add("def");


        ListIterator<String> iterator = arraylist.listIterator(arraylist.size());

        System.out.println("������ ���");
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println("������ ���");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("index ��ġ cursor ����");
        System.out.println("���� �ε���: " + iterator.previousIndex());
        System.out.println("���� �ε���: " + iterator.nextIndex());
        System.out.println("add �Լ��� ghi �߰�");
        iterator.add("ghi");
        System.out.println("index ��ġ cursor ����");
        System.out.println("���� �ε���: " + iterator.previousIndex());
        System.out.println("���� �ε���: " + iterator.nextIndex());
        System.out.println("remove �Լ��� ghi ����");
        System.out.println(iterator.previous());
        iterator.remove();

        /* Listiterator (�ݺ��� / ������, ������ Ž��) cursor system ���� (�� �ڷ� ���̸� ��Ÿ���� Ŀ��)
         * .hasPrevious() Ŀ�� �������� �����ϴ��� Ȯ��
         * .hasNext() Ŀ�� �������� �����ϴ��� Ȯ��
         * .next() Ŀ�� ������ ��ȯ
         * .previous() Ŀ�� ������ ��ȯ
         * .previousIndex() Ŀ�� ���� index ��ȯ
         * .nextIndex() Ŀ�� ���� index ��ȯ
         * .add(E e) �ش� �����͸� Ŀ�� ���ʿ� (.previousIndex() + 1 �� index ������) �߰� * ������ �Ǵ� ����Ʈ���� �Ȱ��� ��ġ�� ���� �߰�
         * .remove() .next() �� .previous() �� ��ȯ�� ������ ���� ���� * ������ �Ǵ� ����Ʈ���� �Ȱ��� ����
         */
    }
}

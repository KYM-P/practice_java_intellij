package ListIterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;

public class iterator {
    public static void main (String[] args) {
        // str
        System.out.println("str ���ڿ� �迭");
        String[] str = {"abc","def"};
        Iterator<String> iterator = Arrays.stream(str).iterator(); // Arrays.stream(str) * str �� array �ڷ������� ��ȯ
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //iterator.remove();    Arrays.stream(str) �� ���� ����Ǿ��ִ� ���� �ƴϹǷ� remove �� �����Ϸ��ϸ� ������ �߻��Ѵ�.

        // ArrayList
        System.out.println("ArrayList");
        ArrayList<String> array = new ArrayList<>();
        array.add("abc");
        array.add("def");
        iterator = array.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // remove + ArrayList
        System.out.println("remove ���� (ArrayList)");
        iterator.remove();
        iterator = array.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        /* iterator (�ݺ��� / ������ Ž��)
         * .hasNext() �������� �����ϴ��� Ȯ��
         * .next() ������ ��ȯ �� iterator ��Ͽ��� ����
         * .remove() �̹� ��ȯ�� ������(.next())�� ���� ����Ʈ ��Ͽ��� ���� (������ .next() ���� ���) * ���� �迭�� ����Ǿ����� �ʴٸ� ���� �߻�
         */
    }
}

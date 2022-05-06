package Deque;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class queue { // Stack �� �ݴ��� ���� ���� ���� �Է��� ���� ���� ���/����
    public static void main (String[] args) {
        Queue queue =  new LinkedList();
        Queue<Integer> integerQueue1 =  new LinkedList<Integer>();
        Queue<Integer> integerQueue2 =  new LinkedList<Integer>(Arrays.asList(1,2,3));

        integerQueue1.add(1);
        integerQueue1.add(2);
        integerQueue1.add(3);
        integerQueue1.add(4);
        integerQueue1.add(5);
        System.out.println("poll �� Queue");
        System.out.println(integerQueue1.poll());
        System.out.println(integerQueue1);
        System.out.println("remove �� Queue"); // ���� ���� �Է��� �� ��ȯ �� ����
        System.out.println(integerQueue1);
        integerQueue1.remove(); // ���� ���� �Է��� �� ����
        System.out.println("remove �� Queue");
        System.out.println(integerQueue1);
        System.out.println("peek �� Queue");
        System.out.println(integerQueue1.peek()); // ���� ���� �Է��� �� ��ȯ
        System.out.println(integerQueue1);
        integerQueue1.clear(); // ��� �� ����
        System.out.println("clear �� Queue");
        System.out.println(integerQueue1);
        System.out.println(integerQueue1.offer(5));

        /* Queue
         * .poll() ���� ���� �Է��� �� ��ȯ �� ����
         * .peek() ���� ���� �Է��� �� ��ȯ
         * .add(input) input ���� Queue �� �߰�
         * .remove() ���� ���� �Է��� �� ����
         * .remove(input) input �� Queue ���� ����
         * .clear() ��� �� ����
         */
    }
}

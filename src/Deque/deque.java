package Deque;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class deque { // Stack �� Queue �ѿ��� ��ӹ��� Deque
    public static void main (String[] args) {
        Deque deque = new ArrayDeque();
        Deque<Integer> integerDeque1 = new ArrayDeque<>();
        Deque<Integer> integerDeque2 = new ArrayDeque<>(Arrays.asList(1,2,3));
        integerDeque1.addFirst(1); // ù ��° ��ҷ� �߰�
        integerDeque1.add(2); // ��� �߰�
        integerDeque1.addLast(3); // ������ ��ҷ� �߰�
        integerDeque1.add(4);
        integerDeque1.add(5);
        System.out.println("Deque: " + integerDeque1);
        System.out.println("pop: " + integerDeque1.pop()); // ù ��° �� ��ȯ �� ����
        System.out.println("remove: " + integerDeque1.remove()); // ù ��° �� ��ȯ �� ����
        System.out.println("peek: " + integerDeque1.peek()); // ù ��° �� ��ȯ
        System.out.println("poll: " + integerDeque1.poll());// ù ��° �� ��ȯ �� ����
        System.out.println("Deque: " + integerDeque1);
        System.out.println("push: 6, offer: 7 �� Deque");
        integerDeque1.push(6); // ù ��° ��ҷ� �߰�
        integerDeque1.offer(7); // ������ ��ҷ� �߰�
        System.out.println("Deque: " + integerDeque1);
        System.out.println("removeLast: " + integerDeque1.removeLast()); // ������ �� ��ȯ �� ����
        System.out.println("peekLast: " + integerDeque1.peekLast()); // ������ �� ��ȯ
        System.out.println("pollLast: " + integerDeque1.pollLast()); // ������ �� ��ȯ �� ����
        System.out.println("Deque: " + integerDeque1);

        /* Deque (Stack �� Queue �� ������ ����)
         * Deque<E e> deque = new ArrayDeque<E e>(); Deque ���� ArrayDeque �� ���� ���� (LinkedList �� ��� ����)
         * .addFirst(input) ù ��° ��ҷ� �߰�
         * .addLast(input) ������ ��ҷ� �߰�
         * .add(input) ��� �߰�
         * .push(input) ù ��° ��ҷ� �߰�
         * .offer(input) ������ ��ҷ� �߰�
         * .pop() ù ��° �� ��ȯ �� ����
         * .remove() ù ��° �� ��ȯ �� ���� (.removeFirst())
         * .removeLast() ������ �� ��ȯ �� ����
         * .peek() ù ��° �� ��ȯ (.peekFirst())
         * .peekLast() ������ �� ��ȯ
         * .poll() ù ��° �� ��ȯ �� ���� (.pollFirst())
         * .pollLast() ������ �� ��ȯ �� ����
         */
    }
}

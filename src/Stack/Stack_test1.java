package Stack;

import java.util.Stack;

public class Stack_test1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(4);
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        /* Stack (������ �����Ͱ� ���̴� ���� - ���� �ʰ� ���� �����Ͱ� ���� ���� ���´�.)
         * Stack<���׸� �ڷ���> �̸� = new Stack<���׸� �ڷ���>(��� ����); * <���׸� �ڷ���> �����ϰ� ���� ����
         * Stack.push(E e) ������  �߰�
         * .peek() �� ���� ������ ��ȯ
         * .pop() �� ���� �����͸� �����ϸ鼭 ��ȯ
         * .size() �迭 ũ�� ��ȯ
         * .isEmpty() �迭�� ����ִ��� Ȯ��
         */
    }
}

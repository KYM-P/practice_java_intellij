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

        /* Stack (스택은 데이터가 쌓이는 구조 - 가장 늦게 넣은 데이터가 가장 먼저 나온다.)
         * Stack<제네릭 자료형> 이름 = new Stack<제네릭 자료형>(요소 개수); * <제네릭 자료형> 생략하고 생성 가능
         * Stack.push(E e) 데이터  추가
         * .peek() 맨 위의 데이터 반환
         * .pop() 맨 위의 데이터를 제거하면서 반환
         * .size() 배열 크기 반환
         * .isEmpty() 배열이 비어있는지 확인
         */
    }
}

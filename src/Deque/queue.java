package Deque;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class queue { // Stack 과 반대의 느낌 가장 먼저 입력한 값을 먼저 출력/삭제
    public static void main (String[] args) {
        Queue queue =  new LinkedList();
        Queue<Integer> integerQueue1 =  new LinkedList<Integer>();
        Queue<Integer> integerQueue2 =  new LinkedList<Integer>(Arrays.asList(1,2,3));

        integerQueue1.add(1);
        integerQueue1.add(2);
        integerQueue1.add(3);
        integerQueue1.add(4);
        integerQueue1.add(5);
        System.out.println("poll 후 Queue");
        System.out.println(integerQueue1.poll());
        System.out.println(integerQueue1);
        System.out.println("remove 전 Queue"); // 가장 먼저 입력한 값 반환 후 제거
        System.out.println(integerQueue1);
        integerQueue1.remove(); // 가장 먼저 입력한 값 제거
        System.out.println("remove 후 Queue");
        System.out.println(integerQueue1);
        System.out.println("peek 후 Queue");
        System.out.println(integerQueue1.peek()); // 가장 먼저 입력한 값 반환
        System.out.println(integerQueue1);
        integerQueue1.clear(); // 모든 값 제거
        System.out.println("clear 후 Queue");
        System.out.println(integerQueue1);
        System.out.println(integerQueue1.offer(5));

        /* Queue
         * .poll() 가장 먼저 입력한 값 반환 후 제거
         * .peek() 가장 먼저 입력한 값 반환
         * .add(input) input 값을 Queue 에 추가
         * .remove() 가장 먼저 입력한 값 제거
         * .remove(input) input 값 Queue 에서 제거
         * .clear() 모든 값 제거
         */
    }
}

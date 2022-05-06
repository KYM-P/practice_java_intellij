package Deque;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class deque { // Stack 과 Queue 둘에게 상속받은 Deque
    public static void main (String[] args) {
        Deque deque = new ArrayDeque();
        Deque<Integer> integerDeque1 = new ArrayDeque<>();
        Deque<Integer> integerDeque2 = new ArrayDeque<>(Arrays.asList(1,2,3));
        integerDeque1.addFirst(1); // 첫 번째 요소로 추가
        integerDeque1.add(2); // 요소 추가
        integerDeque1.addLast(3); // 마지막 요소로 추가
        integerDeque1.add(4);
        integerDeque1.add(5);
        System.out.println("Deque: " + integerDeque1);
        System.out.println("pop: " + integerDeque1.pop()); // 첫 번째 값 반환 후 제거
        System.out.println("remove: " + integerDeque1.remove()); // 첫 번째 값 반환 후 제거
        System.out.println("peek: " + integerDeque1.peek()); // 첫 번째 값 반환
        System.out.println("poll: " + integerDeque1.poll());// 첫 번째 값 반환 후 제거
        System.out.println("Deque: " + integerDeque1);
        System.out.println("push: 6, offer: 7 후 Deque");
        integerDeque1.push(6); // 첫 번째 요소로 추가
        integerDeque1.offer(7); // 마지막 요소로 추가
        System.out.println("Deque: " + integerDeque1);
        System.out.println("removeLast: " + integerDeque1.removeLast()); // 마지막 값 반환 후 제거
        System.out.println("peekLast: " + integerDeque1.peekLast()); // 마지막 값 반환
        System.out.println("pollLast: " + integerDeque1.pollLast()); // 마지막 값 반환 후 제거
        System.out.println("Deque: " + integerDeque1);

        /* Deque (Stack 과 Queue 가 합쳐진 형태)
         * Deque<E e> deque = new ArrayDeque<E e>(); Deque 만의 ArrayDeque 로 생성 가능 (LinkedList 도 사용 가능)
         * .addFirst(input) 첫 번째 요소로 추가
         * .addLast(input) 마지막 요소로 추가
         * .add(input) 요소 추가
         * .push(input) 첫 번째 요소로 추가
         * .offer(input) 마지막 요소로 추가
         * .pop() 첫 번째 값 반환 후 제거
         * .remove() 첫 번째 값 반환 후 제거 (.removeFirst())
         * .removeLast() 마지막 값 반환 후 제거
         * .peek() 첫 번째 값 반환 (.peekFirst())
         * .peekLast() 마지막 값 반환
         * .poll() 첫 번째 값 반환 후 제거 (.pollFirst())
         * .pollLast() 마지막 값 반환 후 제거
         */
    }
}

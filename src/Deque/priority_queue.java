package Deque;

import java.util.Collections;
import java.util.PriorityQueue;

public class priority_queue { // 요소는 Array 사용 [2진 트리 형 Heap 구조]
    public static void main(String[] args) {
        PriorityQueue<Integer> pq_up = new PriorityQueue<>(); // 오름차순 정렬
        PriorityQueue<Integer> pq_down = new PriorityQueue<>(Collections.reverseOrder()); // 내림차순 정렬
        pq_up.offer(1);
        pq_up.offer(3);
        pq_up.offer(5);
        System.out.println(pq_up);
        pq_down.offer(1);
        pq_down.offer(3);
        pq_down.offer(5);
        System.out.println(pq_down); // 이진 트리 구조 유의
        System.out.println(pq_down.poll());
        System.out.println(pq_down);
    }

}

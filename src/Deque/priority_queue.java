package Deque;

import java.util.Collections;
import java.util.Objects;
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
        pq_down.offer(5);
        pq_down.offer(3);
        System.out.println(pq_down); // 이진 트리 구조 유의
        System.out.println(pq_down.poll());
        System.out.println(pq_down);
        /* offer(i) / poll(i) */
    }

    public static class obj implements Comparable<obj>{ // implements Comparable<객체명> 으로 상속
        int x, y, count;
        public obj(int y, int x, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
        public int getx() {
            return this.x;
        }
        @Override
        public int compareTo(obj o) { // 부모 안 compareTo 함수 Override
            return this.count - o.count; // 양수가 나오면 우선순위 밀림 -> 오름차순
        }


    }
    // A<T extends Objects & Comparable<? super T>> / A<e> 에서 e 는 compareTo가 구현된 e 만 받음
    static class A<T extends Objects & Comparable<? super T>>{
    }
}

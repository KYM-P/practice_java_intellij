package Deque;

import java.util.Collections;
import java.util.PriorityQueue;

public class priority_queue { // ��Ҵ� Array ��� [2�� Ʈ�� �� Heap ����]
    public static void main(String[] args) {
        PriorityQueue<Integer> pq_up = new PriorityQueue<>(); // �������� ����
        PriorityQueue<Integer> pq_down = new PriorityQueue<>(Collections.reverseOrder()); // �������� ����
        pq_up.offer(1);
        pq_up.offer(3);
        pq_up.offer(5);
        System.out.println(pq_up);
        pq_down.offer(1);
        pq_down.offer(3);
        pq_down.offer(5);
        System.out.println(pq_down); // ���� Ʈ�� ���� ����
        System.out.println(pq_down.poll());
        System.out.println(pq_down);
    }

}

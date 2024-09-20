package Deque;

import java.util.Collections;
import java.util.Objects;
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
        pq_down.offer(5);
        pq_down.offer(3);
        System.out.println(pq_down); // ���� Ʈ�� ���� ����
        System.out.println(pq_down.poll());
        System.out.println(pq_down);
        /* offer(i) / poll(i) */
    }

    public static class obj implements Comparable<obj>{ // implements Comparable<��ü��> ���� ���
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
        public int compareTo(obj o) { // �θ� �� compareTo �Լ� Override
            return this.count - o.count; // ����� ������ �켱���� �и� -> ��������
        }


    }
    // A<T extends Objects & Comparable<? super T>> / A<e> ���� e �� compareTo�� ������ e �� ����
    static class A<T extends Objects & Comparable<? super T>>{
    }
}

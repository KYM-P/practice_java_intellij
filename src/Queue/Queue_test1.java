package Queue;

import java.util.Arrays;
import java.util.Iterator;

public class Queue_test1<T> implements Iterable<T> {
    // QueueIterator /
    private class QueueIterator implements Iterator<T> {
        int curr = 0;

        @Override
        public boolean hasNext() {
            return curr <= top-1;
        }

        @Override
        public T next() {
            return items[curr++];
        }

    }
    // Queue 내부 구조
    private int capacity = 0; // 용량
    private int top = 0; // 크기
    private T[] items = null; // 배열
    public Queue_test1() {this(10);} // 기본 생성자 : 용량 10

    // 단일 매개변수 생성자
    @SuppressWarnings("unchecked")
    public Queue_test1(int capacity) {
        if(capacity <= 0)
            throw new IllegalArgumentException("Queue(int): capacity <= 0");
        this.capacity = capacity;
        items = (T[]) new Object[capacity];
    }
    // 다중 매개변수 생성자
    @SafeVarargs
    public Queue_test1(T... initList) {
        capacity = top = initList.length;
        items = initList.clone();
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int size() {
        return top;
    }

    public void clear() {
        top = 0;
    }

    public T peek() {
        if(isEmpty()) throw new IllegalStateException("peek: queue is empty");
        return items[0];
    }

    public T pop() {
        if(isEmpty()) throw new IllegalStateException("pop: queue is empty");
        T ret = items[0];
        for (int i = 0; i < top-1; i++) {
            items[i] = items[i + 1];
        }
        items[--top] = null;
        return ret;
    }

    public void push(T item) {
        if(top == capacity) increaseCapacity();
        items[top] = item;
        ++top;
    }

    private void increaseCapacity() {
        capacity *= 2;
        items = Arrays.copyOf(items, capacity);
    }

    // clone() 함수
    @SuppressWarnings("unchecked")
    @Override public Queue_test1<T> clone() {
        Queue_test1<T> cloned = null;
        try {
            cloned = (Queue_test1<T>)super.clone();
            cloned.items = items.clone();
        }
        catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloned;
    }

    // 반복자
    @Override
    public Iterator<T> iterator() {
        return new QueueIterator();
    }
}

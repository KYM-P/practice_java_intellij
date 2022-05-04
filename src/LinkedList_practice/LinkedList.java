package LinkedList_practice;

public class LinkedList { // 단방향(next 값만 가짐), 양방향(before 값도 가짐) 으로 다른 데이터와 연결해 리스트를 만들며 중간중간의 데이터 삭제와 생성이 빠르다.
    private Node head; // 첫 번째 Node
    private Node tail; // 마지막 Node
    private int size = 0; // 리스트 크기

    private class Node{
        private Object data; // Node 내부 저장값
        private Node next; // 다음 Node 위치값

        public Node(Object input) { // Node 생성자
            this.data = input;
            this.next = null;
        }
        public String toString() {
            return String.valueOf(this.data);
        }
    }
    public void addFirst(Object input) { // 첫 번째 Node 생성
        Node newNode = new Node(input);
        newNode.next = head; // 새로운 Node 의 다음 위치를  기존 head 값으로 설정
        head = newNode; // 새로운 Node 를 head 로 설정
        size++;
        if(head.next == null) { // 새로운 Node(head) 다음 위치가 없다면 tail 값으로 설정
            tail = head;
        }
    }
    public void addLast(Object input) { // 마지막 Node 생성
        Node newNode = new Node(input);
        if (size == 0) { // 아무 Node 도 없다면
            addFirst(input);
        }
        else {
            tail.next = newNode; // 기존 tail 의 다음 위치를 새로운 Node 값으로 설정
            tail = newNode; // 새로운 Node 를 tail 값으로 설정
            size++;
        }
    }
    Node node(int index) { // index 위치의 Node 탐색
        Node x = head;
        for(int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }
    public void add(int k, Object input) { // index 가 k 인 위치에 생성
        if (size == 0) {
            addFirst(input);
        }
        else {
            Node temp1 = node(k - 1); // 추가할 자료의 바로 앞에 위치한 Node
            Node temp2 = temp1.next; // 추가할 자료의 바로 앞에 위치한 Node 의 다음 Node 위치값
            Node newNode = new Node(input);
            temp1.next = newNode; // 추가할 자료의 바로 앞에 위치한 Node 의 다음 값을 새로운 Node 로 지정
            newNode.next = temp2; // 새로운 Node 의 다음값은 바로 앞 Node 의 다음 위치값으로 지정
            size++;
            if (newNode.next == null){
                tail = newNode;
            }
        }
    }
    public String toString() { // 리스트 출력
        if (head == null){
            return "[]";
        }
        Node temp = head;
        String str = "[";
        while(temp.next != null) {
            str += temp.data + ", ";
            temp = temp.next;
        }
        str += temp.data;
        return str + "]";
    }
}

package LinkedList_practice;

public class LinkedList { // �ܹ���(next ���� ����), �����(before ���� ����) ���� �ٸ� �����Ϳ� ������ ����Ʈ�� ����� �߰��߰��� ������ ������ ������ ������.
    private Node head; // ù ��° Node
    private Node tail; // ������ Node
    private int size = 0; // ����Ʈ ũ��

    private class Node{
        private Object data; // Node ���� ���尪
        private Node next; // ���� Node ��ġ��

        public Node(Object input) { // Node ������
            this.data = input;
            this.next = null;
        }
        public String toString() {
            return String.valueOf(this.data);
        }
    }
    public void addFirst(Object input) { // ù ��° Node ����
        Node newNode = new Node(input);
        newNode.next = head; // ���ο� Node �� ���� ��ġ��  ���� head ������ ����
        head = newNode; // ���ο� Node �� head �� ����
        size++;
        if(head.next == null) { // ���ο� Node(head) ���� ��ġ�� ���ٸ� tail ������ ����
            tail = head;
        }
    }
    public void addLast(Object input) { // ������ Node ����
        Node newNode = new Node(input);
        if (size == 0) { // �ƹ� Node �� ���ٸ�
            addFirst(input);
        }
        else {
            tail.next = newNode; // ���� tail �� ���� ��ġ�� ���ο� Node ������ ����
            tail = newNode; // ���ο� Node �� tail ������ ����
            size++;
        }
    }
    Node node(int index) { // index ��ġ�� Node Ž��
        Node x = head;
        for(int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }
    public void add(int k, Object input) { // index �� k �� ��ġ�� ����
        if (size == 0) {
            addFirst(input);
        }
        else {
            Node temp1 = node(k - 1); // �߰��� �ڷ��� �ٷ� �տ� ��ġ�� Node
            Node temp2 = temp1.next; // �߰��� �ڷ��� �ٷ� �տ� ��ġ�� Node �� ���� Node ��ġ��
            Node newNode = new Node(input);
            temp1.next = newNode; // �߰��� �ڷ��� �ٷ� �տ� ��ġ�� Node �� ���� ���� ���ο� Node �� ����
            newNode.next = temp2; // ���ο� Node �� �������� �ٷ� �� Node �� ���� ��ġ������ ����
            size++;
            if (newNode.next == null){
                tail = newNode;
            }
        }
    }
    public String toString() { // ����Ʈ ���
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

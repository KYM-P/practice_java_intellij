package HashMap;

import java.util.HashMap;

public class HashMap_basic {
    public static void main (String[] args) {
        HashMap<String,String> hm = new HashMap<>(); // HashMap<Key,Value>
        hm.put("apple","���");
        hm.put("peach","������");
        hm.put("melon","���");

        System.out.println("apple �̶�� key���� �����°�?: " + hm.containsKey("apple"));
        System.out.println("������ �̶�� value���� �����°�?: " + hm.containsValue("������"));
        System.out.println("key���� melon�� value: " + hm.get("melon"));
        System.out.println("HashMap�� ũ��: " + hm.size());
        hm.remove("apple");
        System.out.println( hm.keySet() );
        // ����
        for (String i : hm.keySet()) { // Set<Key E> ���·� ��ȯ / �� hm�� �ڷ� ������ Set ���� �ݿ���
            System.out.println( i );
        }
        hm.clear();
        /* HashMap
         * HashMap<K,V> hm = new HashMap<K,V>();
         * .put(key, value) key ���� �ش� key �� value ���� ������ ��� �߰�
         * .containsKey(key) �ش� key ���� �������ִ��� boolean ���� ��ȯ
         * .containsValue(value) �ش� value ���� �������ִ��� boolean ���� ��ȯ
         * .remove(key) �ش� key ���� ���� ��� ���� .remove(key, value) �� ����
         * .clear() ��� ��� ����
         */
    }

}

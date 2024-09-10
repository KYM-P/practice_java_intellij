package HashMap;

import java.util.HashMap;

public class HashMap_basic {
    public static void main (String[] args) {
        HashMap<String,String> hm = new HashMap<>(); // HashMap<Key,Value>
        hm.put("apple","사과");
        hm.put("peach","복숭아");
        hm.put("melon","멜론");

        System.out.println("apple 이라는 key값을 가졌는가?: " + hm.containsKey("apple"));
        System.out.println("복숭아 이라는 value값을 가졌는가?: " + hm.containsValue("복숭아"));
        System.out.println("key값이 melon인 value: " + hm.get("melon"));
        System.out.println("HashMap의 크기: " + hm.size());
        hm.remove("apple");
        System.out.println( hm.keySet() );
        // 응용
        for (String i : hm.keySet()) { // Set<Key E> 형태로 반환 / 단 hm의 자료 삭제시 Set 에도 반영됨
            System.out.println( i );
        }
        hm.clear();
        /* HashMap
         * HashMap<K,V> hm = new HashMap<K,V>();
         * .put(key, value) key 값과 해당 key 의 value 값을 가지는 요소 추가
         * .containsKey(key) 해당 key 값을 가지고있는지 boolean 으로 반환
         * .containsValue(value) 해당 value 값을 가지고있는지 boolean 으로 반환
         * .remove(key) 해당 key 값을 가진 요소 제거 .remove(key, value) 도 가능
         * .clear() 모든 요소 제거
         */
    }

}

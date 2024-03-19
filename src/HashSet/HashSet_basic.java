package HashSet;

import java.util.HashSet;

public class HashSet_basic {
    static HashSet<Integer> i = new HashSet<>();

    public static void main ( String[] args) {
        i.add(10);
        i.add(20);
        i.add(30);
        System.out.println(i);
        System.out.println("i 에 10이라는 요소가 있는가? : " + i.contains(10));
        i.remove(10);
        System.out.println("i 에서 요소 10을 제거 후에도 10이 존재 하는가? : " + i.contains(10));
        i.clear();
        System.out.println(i);

    }
    /* HashSet (*순서를 가지지 않는다 => index 없음)
     * HashSet<E> hs = new HashSet<E>();
     * -HashSet<Integer> hs2 = new HashSet<E>(10);
     * -초기값을 가지고 생성
     * --HashSet<Integer> hs3 = new HashSet<E>(hs2)
     * --hs2 의 요소를 그대로 가지고 생성 (array 등의 자료형도 적용 가능)
     *
     * .add(value) value 값을 가지는 요소 추가 (이미 존재? false : true)
     * .contains(value) value 값을 가지는 요소가 존재하는지 확인 (존재? true : false)
     * .size() HashSet 의 크기 반환 (현재 요소의 수)
     * .remove(value) 해당 value 값과 같은 요소를 제거 (제거 성공? true : false)
     * .clear() 모든 요소 제거
     */
}

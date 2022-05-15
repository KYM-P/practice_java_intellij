package Vector;

import java.util.Vector;

public class Vector_basic {

    public static void main (String[] args) {
        Vector<Integer> v = new Vector<>(); // var v = new Vector<Integer>(); var은 뒷부분의 자료형을 보고 유추하여 생성

        v.add(5);
        v.add(4);
        v.add(-1);
        System.out.println("백터 요소: " + v);
        System.out.println("백터 요소 개수: " + v.size());
        System.out.println("현재 백터 용량: " + v.capacity());
        System.out.println("백터 0번째 요소: " + v.get(0));

        v.add(2, 3); // 2번 자리에 3 추가 (기존 2번 이후의 값은 밀려남)
        System.out.println("index 2번에 3 추가 후 백터 요소: " + v);
        v.remove(0);
        System.out.println("index 0번 제거 후 백터 요소: " + v);
        v.removeAllElements(); // v.clear 과 동일
        System.out.println("전체 제거 후 백터 요소: " + v);

        /* Vector  (선언한 벡터 명을 그대로 출력시 모든 요소 출력)
         * Vector<E> 이름 = new Vector<E>();
         * .add(input) input 값을 벡터 마지막에 추가
         * .add(index, input) input 값을 벡터 index 위치에 추가 후 기존값들은 뒤로 밀림
         * .remove(index) index 값을 벡터에서 제거
         * .removeAllElements() 벡터의 모든 요소 삭제
         * .clear() 벡터의 모든 요소 삭제
         */
    }
}

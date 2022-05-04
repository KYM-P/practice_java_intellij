package ListIterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;

public class iterator {
    public static void main (String[] args) {
        // str
        System.out.println("str 문자열 배열");
        String[] str = {"abc","def"};
        Iterator<String> iterator = Arrays.stream(str).iterator(); // Arrays.stream(str) * str 을 array 자료형으로 반환
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //iterator.remove();    Arrays.stream(str) 는 따로 저장되어있는 것이 아니므로 remove 로 제거하려하면 오류가 발생한다.

        // ArrayList
        System.out.println("ArrayList");
        ArrayList<String> array = new ArrayList<>();
        array.add("abc");
        array.add("def");
        iterator = array.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // remove + ArrayList
        System.out.println("remove 실험 (ArrayList)");
        iterator.remove();
        iterator = array.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        /* iterator (반복자 / 순방향 탐색)
         * .hasNext() 다음값이 존재하는지 확인
         * .next() 다음값 반환 후 iterator 목록에서 제거
         * .remove() 이미 반환한 다음값(.next())을 원본 리스트 목록에서 제거 (무조건 .next() 이후 사용) * 원본 배열이 저장되어있지 않다면 오류 발생
         */
    }
}

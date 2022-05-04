package ListIterator;

import java.util.ListIterator;
import java.util.ArrayList;

public class Listiterator {
    public static void main (String[] args) {
        ArrayList<String> arraylist = new ArrayList<>();
        arraylist.add("abc");
        arraylist.add("def");


        ListIterator<String> iterator = arraylist.listIterator(arraylist.size());

        System.out.println("역방향 출력");
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println("순방향 출력");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("index 위치 cursor 기준");
        System.out.println("이전 인덱스: " + iterator.previousIndex());
        System.out.println("이후 인덱스: " + iterator.nextIndex());
        System.out.println("add 함수로 ghi 추가");
        iterator.add("ghi");
        System.out.println("index 위치 cursor 기준");
        System.out.println("이전 인덱스: " + iterator.previousIndex());
        System.out.println("이후 인덱스: " + iterator.nextIndex());
        System.out.println("remove 함수로 ghi 제거");
        System.out.println(iterator.previous());
        iterator.remove();

        /* Listiterator (반복자 / 순방향, 역방향 탐색) cursor system 존재 (각 자료 사이를 나타내는 커서)
         * .hasPrevious() 커서 이전값이 존재하는지 확인
         * .hasNext() 커서 다음값이 존재하는지 확인
         * .next() 커서 다음값 반환
         * .previous() 커서 이전값 반환
         * .previousIndex() 커서 이전 index 반환
         * .nextIndex() 커서 다음 index 반환
         * .add(E e) 해당 데이터를 커서 왼쪽에 (.previousIndex() + 1 의 index 값으로) 추가 * 원본이 되는 리스트에도 똑같은 위치게 값을 추가
         * .remove() .next() 나 .previous() 로 반환한 마지막 값을 제거 * 원본이 되는 리스트에도 똑같이 제거
         */
    }
}

package List;

import java.util.ArrayList;

public class List_arraylist {

    int Num = 50;

    public static void main(String[] args) {

        // ArrayList 클래스 제공 배열
        ArrayList<List_arraylist> ListArray1 = new ArrayList<List_arraylist>(); // ArrayList<E> 에서 E는 제네릭 자료형
        ArrayList<List_arraylist> ListArray2 = new ArrayList<List_arraylist>(2);
        ArrayList<Integer> IntArray1 = new ArrayList<Integer>();
        ArrayList ListArray3 = new ArrayList();

        // ArrayList 2 차원 배열 1
        ArrayList<Integer>[] IntArray2 = new ArrayList[10];
        for (int i = 0; i < 10; i++) {
            IntArray2[i] = new ArrayList<Integer>();
        }

        // ArrayList 2 차원 배열 2
        ArrayList<ArrayList<Integer>> IntArray3 = new ArrayList<>();
        IntArray3.add(new ArrayList<Integer>());
        IntArray3.get(0).add(30);
        IntArray3.add(new ArrayList<Integer>());
        IntArray3.get(1).add(40);
        System.out.println(IntArray3.toString());

        /* ArrayList (변동적인 배열을 사용할 때 좋음)
         * ArrayList<제네릭 자료형> 배열이름 = new ArrayList<제네릭 자료형>(요소 개수); * <제네릭 자료형> 생략하고 생성 가능
         * ArrayList.add(E e) 요소 추가 * add(int index, E e) 해당 인덱스에 값 추가, 뒤쪽 값은 밀림
         * .size() 배열 크기 반환
         * .get(int index) 해당 위치의 요소값 반환
         * .set(int index, E e) 해당 위치의 요소값 교체
         * .indexOf(value) 해당 값이 있는 index값 반환
         * .contains(value) 해당 값이 있는지 참/거짓 값 반환
         * .clear() 요소를 전부 비움
         * .addAll(ArrayList arraylist) 해당 리스트의 값 모두 추가
         * .remove(int index) 해당 위치의 요소값 반환 후 제거
         * .isEmpty() 배열이 비어있는지 확인
         */
        ListArray1.add(new List_arraylist());
        ListArray1.add(new List_arraylist());
        ListArray1.set(1, new List_arraylist());
        ListArray2.addAll(ListArray1);

        System.out.println("배열 복사");
        System.out.println("원본 변경 전 복제값 = "+ ListArray2.get(0).Num);
        ListArray1.get(0).Num = 70;
        System.out.println("원본 변경 후 복제값 = "+ ListArray2.get(0).Num); // 객체 배열은 원본값을 변경시키면 복사한 배열도 변경된다. (주소를 이용하기 때문)
    }
}
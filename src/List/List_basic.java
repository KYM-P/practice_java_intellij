package List;

public class List_basic {
    public static void main (String[] args){
        int[] IntArray1 = new int[] {1,2}; // 1,2 요소를 가진 크기 2의 int 형 배열 생성
        float floatArray[] = new float[3]; // 3개의 크기를 가진 float 형 배열 생성 (int[] a 나 int a[] 나 차이는 없다)
        String[][] StringArray1 = new String[][] {{"1","2"},{"3","4"}}; // 2x2 의 String 배열 생성

        int[] IntArray2 = new int[3];
        System.arraycopy(IntArray1, 0, IntArray2, 0, 2); // (복사할 원본 배열, 원본 배열에서 복사할 처음 위치값, 복사해서 저장할 배열, 복사값을 저장할 처음 위치값, 복사할 요소 개수)
        System.out.println("배열복사"); // 배열이 인스턴스가 아닌 기본 값이라면 원본값이 바뀌여도 무관
        IntArray1[1] = 3;
        System.out.println(IntArray2[1]);
        IntArray2[1] = 4;
        System.out.println(IntArray2[1]);
        IntArray1[1] = 2;
        System.out.println(IntArray2[1]);

        // 향상된 for 문
        System.out.println("향상된 for 문");
        for (int a : IntArray2) { // 향상된 for 문 IntArray1의 요소값을 앞에서부터 a 에 저장하며 반복
            System.out.println(a);
        }
    }
}

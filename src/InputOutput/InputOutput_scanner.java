package InputOutput;

import java.util.Scanner;

public class InputOutput_scanner {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String str;
        System.out.print("입력: ");
        str = sc.nextLine(); // 버퍼에 줄바꿈 문자 전까지 입력받음
        System.out.println(str);
        sc.close(); // bufferedRead 같은 경우도 사용이 불가능하게 된다
        /*
		 * scanner 메소드
		 * close() scanner 닫기
		 * hasNext() 내용이 입력되었는지 판단 (true,false 형태 반환)(입력된 데이터를 내보냈다면 입력 안한것으로 간주)
		 * next() 다음 토큰 전까지의 내용 반환
		 * next 자료형() 해당되는 자료형의 데이터 반환 ex nextint = int형 데이터 반환
		 * reset() 현 scanner 초기화
		 * toString() 현 입력된 내용을 String 으로 변환
		 * useDelimiter(String pattern) pattern 에 해당하는 패턴을 구분자로 사용.

		 예제 구문
		public static void main(String[] args) {
			String str = "3.14.15.92";
			Scanner sc = new Scanner(str).useDelimiter("\\.");
			while(sc.hasNext()) { System.out.println(sc.nextInt()); }
			sc.close();
		}
		*
		* 출처: https://eskeptor.tistory.com/68 [Hello World]
		 */
    }
}

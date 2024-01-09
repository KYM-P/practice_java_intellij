package String;

public class stringbuffer { // String 보다 공간 낭비가 적고 속도가 빠름, 멀티쓰레드에 안전하게 동기화 되어있음
    public static void main (String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        /*
        .append(String) 해당 문자열의 마지막에 추가
        .capacity() 현재 용량 반환 (int)
        .delete(index, index) 해당 인덱스 부분의 문자열을 제거
        .deleteCharAt(index) 해당 인덱스 부분의 문자를 제거
        .insert(index, char) 해당 index 값에 해당 문자를 끼워넣음
        .reverse() 역순으로 재배열
        .toString() String 값으로 반환
         */
    }
}

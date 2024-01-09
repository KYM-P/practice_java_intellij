package String;

public class stringbuilder {
    public static void main (String[] args) { // buffer과 다르게 동기화 되어있지 않음
        StringBuilder sb = new StringBuilder("abc");
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

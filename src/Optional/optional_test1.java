package Optional;

import java.util.Optional;

public class optional_test1 {
    public static void main(String[] args) {
        Optional<String> opt1 = Optional.ofNullable(strReturn());
        String name = opt1.orElse("anonymous"); // null 이면 해당 문자열 반환
        // orElseGet() {} / null 일 때만 실행 / 람다식 내부 동작
    }
    public static String strReturn(){ return null; }

}

package Optional;

import java.util.Optional;

public class optional_test1 {
    public static void main(String[] args) {
        Optional<String> opt1 = Optional.ofNullable(strReturn());
        String name = opt1.orElse("anonymous"); // null �̸� �ش� ���ڿ� ��ȯ
        // orElseGet() {} / null �� ���� ���� / ���ٽ� ���� ����
    }
    public static String strReturn(){ return null; }

}

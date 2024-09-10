package InnerClass;

public class InnerClass_test1 {
    private int k = 0; // 정적 내부(사용불가), 인스턴스(사용가능)
    private static int kk = 0; //정적 내부(사용가능), 인스턴스(사용가능)
    public static void main (String[] arg) {
        Class1 c1 = new Class1();
        int a = c1.mValue2; // 접근 가능
        int b = c1.mValue1;
    }
    // 정적 내부 클래스 ( 외부 클래스의 전역 변수만 사용 가능)
    static class Class1 { // static class 가 아니면 static void main 에서 사용 불가
        private int mValue1; // 외부 클래스 에서 접근 가능
        int mValue2;

        Class1() { // 생성자
            mValue1 = 0;
            mValue2 = 0;
        }
        Class1(int a, int b) {
            mValue1 = a;
            mValue2 = b;
        }
        public int getValueOne() {
            return mValue1;
        }
    }
    // 인스턴스 내부 클래스 ( 외부 클래스 인스턴스, 전역변수 사용 가능 )
    class Class2 {
        int aa = k;
    }
}

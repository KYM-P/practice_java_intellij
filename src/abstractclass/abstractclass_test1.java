package abstractclass;

public abstract class abstractclass_test1 { // 추상 메서드를 사용하기 위해 추상 클래스로 선언 (abstract)

    public abstract int add (int x, int y); // 추상 메서드 사용
    /* 추상 메서드
     * 상위 클래스에서 하위 클래스에 공통으로 사용할 메서드를 구현하는데 자주 사용. 단 메소드 내용이 각자 다를때의 상황.
     * 추상 클래스는 상속받는 클래스에 책임을 위임한다.
     */

    public static void main(String[] args){
        // abstractclass_test1 A = new abstractclass_test1(); 추상 클래스는 생성 불가능 (상속만을 위한 클래스)
        System.out.println("추상 메서드");
    }
}

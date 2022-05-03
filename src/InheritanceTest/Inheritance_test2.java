package InheritanceTest;

public class Inheritance_test2 extends Inheritance_test1 {
    int A2 = 60;

    public Inheritance_test2() { } // 디폴트 생성자

    public Inheritance_test2(int input) {
        super( input ); // 상위 클래스의 생성자 호출
        A2 = input;
    }

    public void ShowInfo() { // 상위 클래스의 ShowInfo 가 아닌 해당 ShowInfo 사용을 위한 재정의
        System.out.println(this + " A2 = " + A2);
    }

    public void SuperShowInfo() {
        super.ShowInfo();
    }
}

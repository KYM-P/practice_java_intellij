package InheritanceTest;

import java.util.ArrayList;

public class Inheritance_test1 {
    protected  int A1 = 50; // protected -> 상속받은 인스턴스만 사용 가능

    public Inheritance_test1() {} // 디폴트 생성자

    public Inheritance_test1(int input) { // 매개변수 생성자
        A1 = input;
    }

    public void ShowInfo() {
        System.out.println(this + "A1 = " + A1);
    }

    public void PrintOut () {
        System.out.println("Test");
    }

    public static void main(String[] args) {
        ArrayList<Inheritance_test1> InheritanceList = new ArrayList<>(); // Inheritance_test1 형식 배열 생성

        for (int i = 0; i < InheritanceList.size(); i++) { // 배열에 요소 추가.
            InheritanceList.add(new Inheritance_test2(70 + i));
        }

        for  (Inheritance_test1 Obj : InheritanceList){ // 향상된 for 문
            Obj.ShowInfo();
            System.out.println(Obj.A1);
            //System.out.println(Obj.A2); Obj 는 Inheritance_test1 이므로 본래 자료형이 Inheritance_test2 여도 사용 불가능
        }

        for (int i = 0; i < InheritanceList.size(); i++) {
            Inheritance_test1 DownCasting = InheritanceList.get(i);
            if (DownCasting instanceof Inheritance_test2) { // DownCasting 의 본래 자료형이 Inheritance_test2 라면
                Inheritance_test2 DC_test = (Inheritance_test2)DownCasting; // 다운 캐스팅
                System.out.println("T.A2 " + i + " = " + DC_test.A2); // 다운캐스팅으로 Inheritance_test2 자료형으로 바뀌어 A2 사용 가능
            }
            else {
                System.out.println("지원되지 않습니다.");
            }
        }
    }
}

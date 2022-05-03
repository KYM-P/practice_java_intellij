package practice_space;

public class prac_mother {

    private  String B1 = "B1";
    protected String B2 = "B2"; // protected 예약어는 상속받은 하위 클래서에서만 사용이 가능하다.

    int A1 = 50;

    public prac_mother() {

    }

    public prac_mother(int a, int b) {

    }

    public void pp () { System.out.println("A1 = " + A1); }
}

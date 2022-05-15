package practice_space;

//한 줄 주석

/*
여러 줄 주석
여러 줄 주석
*/

import java.util.InputMismatchException;

public class prac1 { // class 생성

    public static int Numb1 = 0; // 전역변수 static
    /* (전역 변수)
     * 해당 클래스에 종속되어있는 모든 인스턴스가 공유하는 값으로 사용할 수 있다.
     * 학번, 차량 번호등에 사용할 수 있다.
     */

    int Numb2 = 0;
    /* (멤버 변수)
     * 해당 클래스로 만든 인스턴스들이 공유하지 않고 개별적으로 가지는 값.
     * 인스턴스를 만들 때 자동으로 생성
     */


    private class prac1_1 { // private class로 외부 클래스에서 접근할 수 없다.
    }

    public static int add (int num1, int num2) { // add 함수(메소드) 생성 (클래스 함수)
        int result;
        result = num1 + num2;
        return result;
    }

    public static void main (String[] args){ // main 함수(메소드) 생성

        // 매인함수 전용 변수
        int level1 = 10;
        char level2 = 'L';
        float level3 = 3.14F; // (float)3.14
        double level4 = 3.14;
        String level5 = "level5";
        boolean t = true;
        boolean f = (level2 == level1); // (== equal), (&& and), (|| or
        char level6 = (level1 > 10) ? 'U' : 'D'; // level1 의 값이 10 이상이면 'U' 아니면 'D' 저장


        // 매인함수 전용 변수 사용
        System.out.println(level1);
        System.out.println(level2);
        System.out.println(level3);
        System.out.println(level4);
        System.out.println(level5);
        System.out.println(t + " " + f);
        System.out.println(level6);

        // if 문
        if(level1 > 5) {
            System.out.println("level1 은 5 보다 큽니다.");
        }
        else if (level1 == 5) {
            System.out.println("level1 은 5 입니다.");
        }
        else {
            System.out.println("level1 은 5 보다 작습니다.");
        }

        // switch 문
        switch(level1) { // 괄호 안은 int 값만을 받는다.
            case 10 :
                System.out.println("level1 은 10 입니다."); // break 이 없으면 뒤의 case 도 실행한다.
                break;
            case 5: // 하나의 실행에 여러 case 를 두고싶으면 ' case 1: case2: case 3: 실행문 ' 형식으로 적을 수 있다.
                System.out.println("level1 은 5 입니다.");
                break;
        }

        // while 문
        while(level1 < 20) { // 값이 거짓일 때 까지 반복
            level1++;
            System.out.print(level1 + ", ");
        }
        System.out.print("\n");

        // for 문
        for(int i = 0; i < 5; i++) { // i 가0 부터 4 까지 1 씩증가하며 반복
            if(i == 3) { // i 가 3이면 이후의 실행문을 실행하지 않고 다음 반복으로 넘어간다.
                continue;
            }
            System.out.print(i);
        }
        System.out.print("\n");

        // 외부 함수 사용
        System.out.println(add(level1, (int)level3));

        try { // 예외가 발생할 수 있는 실행문

        } catch (InputMismatchException e) { // catch(예외 타입) { 실행문 }

        }
        finally { // 예외 발생 여부와 상관없이 실행 (생략 가능)

        }
    }

}

package practice_space;

//�� �� �ּ�

/*
���� �� �ּ�
���� �� �ּ�
*/

import java.util.InputMismatchException;

public class prac1 { // class ����

    public static int Numb1 = 0; // �������� static
    /* (���� ����)
     * �ش� Ŭ������ ���ӵǾ��ִ� ��� �ν��Ͻ��� �����ϴ� ������ ����� �� �ִ�.
     * �й�, ���� ��ȣ� ����� �� �ִ�.
     */

    int Numb2 = 0;
    /* (��� ����)
     * �ش� Ŭ������ ���� �ν��Ͻ����� �������� �ʰ� ���������� ������ ��.
     * �ν��Ͻ��� ���� �� �ڵ����� ����
     */


    private class prac1_1 { // private class�� �ܺ� Ŭ�������� ������ �� ����.
    }

    public static int add (int num1, int num2) { // add �Լ�(�޼ҵ�) ���� (Ŭ���� �Լ�)
        int result;
        result = num1 + num2;
        return result;
    }

    public static void main (String[] args){ // main �Լ�(�޼ҵ�) ����

        // �����Լ� ���� ����
        int level1 = 10;
        char level2 = 'L';
        float level3 = 3.14F; // (float)3.14
        double level4 = 3.14;
        String level5 = "level5";
        boolean t = true;
        boolean f = (level2 == level1); // (== equal), (&& and), (|| or
        char level6 = (level1 > 10) ? 'U' : 'D'; // level1 �� ���� 10 �̻��̸� 'U' �ƴϸ� 'D' ����


        // �����Լ� ���� ���� ���
        System.out.println(level1);
        System.out.println(level2);
        System.out.println(level3);
        System.out.println(level4);
        System.out.println(level5);
        System.out.println(t + " " + f);
        System.out.println(level6);

        // if ��
        if(level1 > 5) {
            System.out.println("level1 �� 5 ���� Ů�ϴ�.");
        }
        else if (level1 == 5) {
            System.out.println("level1 �� 5 �Դϴ�.");
        }
        else {
            System.out.println("level1 �� 5 ���� �۽��ϴ�.");
        }

        // switch ��
        switch(level1) { // ��ȣ ���� int ������ �޴´�.
            case 10 :
                System.out.println("level1 �� 10 �Դϴ�."); // break �� ������ ���� case �� �����Ѵ�.
                break;
            case 5: // �ϳ��� ���࿡ ���� case �� �ΰ������ ' case 1: case2: case 3: ���๮ ' �������� ���� �� �ִ�.
                System.out.println("level1 �� 5 �Դϴ�.");
                break;
        }

        // while ��
        while(level1 < 20) { // ���� ������ �� ���� �ݺ�
            level1++;
            System.out.print(level1 + ", ");
        }
        System.out.print("\n");

        // for ��
        for(int i = 0; i < 5; i++) { // i ��0 ���� 4 ���� 1 �������ϸ� �ݺ�
            if(i == 3) { // i �� 3�̸� ������ ���๮�� �������� �ʰ� ���� �ݺ����� �Ѿ��.
                continue;
            }
            System.out.print(i);
        }
        System.out.print("\n");

        // �ܺ� �Լ� ���
        System.out.println(add(level1, (int)level3));

        try { // ���ܰ� �߻��� �� �ִ� ���๮

        } catch (InputMismatchException e) { // catch(���� Ÿ��) { ���๮ }

        }
        finally { // ���� �߻� ���ο� ������� ���� (���� ����)

        }
    }

}

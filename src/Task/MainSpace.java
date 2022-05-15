package Task;

import java.util.*;

public class MainSpace {

    static int How_Many_Student;
    static double average;


    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Sinsang> S_Sinsang = new Vector<>();
        ArrayList<JavaScore> S_Score = new ArrayList<>();
        HashMap<Sinsang, JavaScore> Student = new HashMap<>();

        // �л� �� �Է�
        try {
            System.out.print("�л� �� �Է�: ");
            How_Many_Student = sc.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("�߸��� ���� �ԷµǾ����ϴ�.");
            return;
        }
        sc.nextLine(); // ���� �ʱ�ȭ
        // �л� ���� �Է� �� ����
        for (int i = 0; i < How_Many_Student; i++) {
            // Sinsang
            System.out.print(i+1 + "��° �л� �а�: ");
            String department = sc.nextLine();
            System.out.print(i+1 + "��° �л� �й�: ");
            String number = sc.nextLine();
            System.out.print(i+1 + "��° �л� �̸�: ");
            String name = sc.nextLine();
            // JavaScore
            double score = 0;
            try {
                System.out.print(i+1 + "��° �л� ����: ");
                score = sc.nextDouble();
            }catch (InputMismatchException e) {
                System.out.print("�Է°��� �԰ݿ� ���� �ʽ��ϴ�. �ٽ� �Է��� �ּ���: ");
                score = sc.nextDouble();
            }
            finally {
                sc.nextLine(); // ���� �ʱ�ȭ
            }
            // vector, arraylist, hashmap input
            S_Sinsang.add(new Sinsang(department,number,name));
            S_Score.add(new JavaScore(score));
            Student.put(S_Sinsang.get(i), S_Score.get(i));
        }

        // ��հ� ���� + ���� ����
        GetAverage(S_Score);
        SetRanking(S_Score);

        // ���
        for (int i = 0; i < How_Many_Student; i++) {
            System.out.print("[" + (i+1) + "]");
            Sinsang s = S_Sinsang.get(i);
            System.out.print(" " + s.GetDepartment());
            System.out.print(" " + s.GetStudentNumber());
            System.out.print(" " + s.GetStudentName());
            JavaScore js = Student.get(s);
            System.out.print(" " + js.GetScore());
            System.out.print("(" + js.GetRank() + ")");
            System.out.print(" ����");
            System.out.print(" �����");
            if (js.Setretake(average)){
                System.out.print("-���");
            }
            else {
                System.out.print("-�̴��");
            }
            System.out.print("\n");
        }
    }
    public static double GetAverage (ArrayList<JavaScore> Score_list) {
        // ��� ����
        Iterator<JavaScore> it = Score_list.iterator();
        double sum = 0;
        int size = 0;
        while(it.hasNext()){
            sum += it.next().GetScore();
            size++;
        }
        average = sum / size;
        return average;
    }

    public static void SetRanking(ArrayList<JavaScore> Score_list) {
        // rank �迭 �߰� (rank �迭�� index �� ������ index ��ġ�� ��Ұ��� ���� �迭�� index(��ġ) ��)
        ArrayList<Integer> rank = new ArrayList<>();
        // rank �� ����
        rank.add(0);
        for (int i = 1; i < Score_list.size(); i++) {
            int index = i;
            for (int j = 0; j < i; j++) {
                if(Score_list.get(i).GetScore() > Score_list.get(rank.get(j)).GetScore()){
                    index = j;
                    break;
                }
            }
            rank.add(index, i);
        }
        // rank ���� ���� JavaScore �� ����
        for (int i = 0; i < rank.size(); i++) {
            Score_list.get(rank.get(i)).InputRank(i+1);
        }
    }

}

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

        // 학생 수 입력
        try {
            System.out.print("학생 수 입력: ");
            How_Many_Student = sc.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("잘못된 값이 입력되었습니다.");
            return;
        }
        sc.nextLine(); // 버퍼 초기화
        // 학생 정보 입력 후 저장
        for (int i = 0; i < How_Many_Student; i++) {
            // Sinsang
            System.out.print(i+1 + "번째 학생 학과: ");
            String department = sc.nextLine();
            System.out.print(i+1 + "번째 학생 학번: ");
            String number = sc.nextLine();
            System.out.print(i+1 + "번째 학생 이름: ");
            String name = sc.nextLine();
            // JavaScore
            double score = 0;
            try {
                System.out.print(i+1 + "번째 학생 점수: ");
                score = sc.nextDouble();
            }catch (InputMismatchException e) {
                System.out.print("입력값이 규격에 맞지 않습니다. 다시 입력해 주세요: ");
                score = sc.nextDouble();
            }
            finally {
                sc.nextLine(); // 버퍼 초기화
            }
            // vector, arraylist, hashmap input
            S_Sinsang.add(new Sinsang(department,number,name));
            S_Score.add(new JavaScore(score));
            Student.put(S_Sinsang.get(i), S_Score.get(i));
        }

        // 평균값 설정 + 순위 결정
        GetAverage(S_Score);
        SetRanking(S_Score);

        // 출력
        for (int i = 0; i < How_Many_Student; i++) {
            System.out.print("[" + (i+1) + "]");
            Sinsang s = S_Sinsang.get(i);
            System.out.print(" " + s.GetDepartment());
            System.out.print(" " + s.GetStudentNumber());
            System.out.print(" " + s.GetStudentName());
            JavaScore js = Student.get(s);
            System.out.print(" " + js.GetScore());
            System.out.print("(" + js.GetRank() + ")");
            System.out.print(" 평점");
            System.out.print(" 재수강");
            if (js.Setretake(average)){
                System.out.print("-대상");
            }
            else {
                System.out.print("-미대상");
            }
            System.out.print("\n");
        }
    }
    public static double GetAverage (ArrayList<JavaScore> Score_list) {
        // 평균 산출
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
        // rank 배열 추가 (rank 배열의 index 는 순위값 index 위치의 요소값은 원본 배열의 index(위치) 값)
        ArrayList<Integer> rank = new ArrayList<>();
        // rank 값 설정
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
        // rank 값을 각각 JavaScore 에 적용
        for (int i = 0; i < rank.size(); i++) {
            Score_list.get(rank.get(i)).InputRank(i+1);
        }
    }

}

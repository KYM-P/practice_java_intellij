package InputOutput;

import java.io.*;
import java.util.StringTokenizer;

public class InputOutput_bufferRW {
    public static void main (String[] args) throws IOException { // BufferedWriter,Reader 사용중 발생하는 IOE 예외를 떠넘긴다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), "구분할 문자나 공백(구분자)");

        String str;
        bw.write("입력: "); // .write() 는 줄바꿈 문자를 자동으로 반환하지 않음
        bw.flush(); // 버퍼 내부내용 출력 후 비우기
        str = br.readLine(); // 버퍼에 줄바꿈 문자 전까지 입력받아 저장
        bw.write("\n숫자 입력: ");
        bw.flush();
        int n = Integer.parseInt(br.readLine()); // int 형 문자만 입력받아 저장
        bw.write(n + "\n");

        bw.write("\n숫자 입력: ");
        bw.flush();
        int a = br.read();
        bw.write(a + "\n");
        bw.close(); // 버퍼 닫기 * scanner 또한 버퍼를 사용해서 scanner 또한 사용이 불가능하다
        System.out.println(a);
    }
}

package InputOutput;

import java.io.*;
import java.util.StringTokenizer;

public class InputOutput_bufferRW {
    public static void main (String[] args) throws IOException { // BufferedWriter,Reader ����� �߻��ϴ� IOE ���ܸ� ���ѱ��.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), "������ ���ڳ� ����(������)");


        String str;
        bw.write("�Է�: "); // .write() �� �ٹٲ� ���ڸ� �ڵ����� ��ȯ���� ����
        bw.flush(); // ���� ���γ��� ��� �� ����
        str = br.readLine(); // ���ۿ� �ٹٲ� ���� ������ �Է¹޾� ����

        bw.close(); // ���� �ݱ� * scanner ���� ���۸� ����ؼ� scanner ���� ����� �Ұ����ϴ�
    }
}

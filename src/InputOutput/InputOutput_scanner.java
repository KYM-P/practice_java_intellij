package InputOutput;

import java.util.Scanner;

public class InputOutput_scanner {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String str;
        System.out.print("�Է�: ");
        str = sc.nextLine(); // ���ۿ� �ٹٲ� ���� ������ �Է¹���
        System.out.println(str);
        sc.close(); // bufferedRead ���� ��쵵 ����� �Ұ����ϰ� �ȴ�
        /*
		 * scanner �޼ҵ�
		 * close() scanner �ݱ�
		 * hasNext() ������ �ԷµǾ����� �Ǵ� (true,false ���� ��ȯ)(�Էµ� �����͸� �����´ٸ� �Է� ���Ѱ����� ����)
		 * next() ���� ��ū �������� ���� ��ȯ
		 * next �ڷ���() �ش�Ǵ� �ڷ����� ������ ��ȯ ex nextint = int�� ������ ��ȯ
		 * reset() �� scanner �ʱ�ȭ
		 * toString() �� �Էµ� ������ String ���� ��ȯ
		 * useDelimiter(String pattern) pattern �� �ش��ϴ� ������ �����ڷ� ���.

		 ���� ����
		public static void main(String[] args) {
			String str = "3.14.15.92";
			Scanner sc = new Scanner(str).useDelimiter("\\.");
			while(sc.hasNext()) { System.out.println(sc.nextInt()); }
			sc.close();
		}
		*
		* ��ó: https://eskeptor.tistory.com/68 [Hello World]
		 */
    }
}

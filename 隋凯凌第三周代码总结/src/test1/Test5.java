//�������֤�ţ���֤�Ƿ�Ϸ������ҽ�ȡ���֤�еĳ���������Ϣ��
package test1;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("���������֤��:");
			String ss = input.next();
			if (ss.length() != 18) {
				System.out.println("����������������룺");
				continue;
			} else {
				String s1 = ss.substring(6, 10);
				String s2 = ss.substring(10, 14);
				System.out.println("�������:" + s1 + "\t��������:" + s2);
				break;
			}
		}
	}
}

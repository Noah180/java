//�ϴ��ļ�����֤�ļ���չ���Ƿ���ȷ�Ƿ���.jpg��
package test1;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("�������ļ���:");
			String s1 = input.next();
			if (s1.isEmpty()) {
				System.out.println("�����ַ�������Ϊ�գ�����������");
				continue;
			}
			int num = s1.lastIndexOf(".");
			if (num <= 0) {
				System.out.println("������.��ͷ����û���ҵ�.,����������");
				continue;
			}
			String s2 = s1.substring(num);
			if (s2.equals(".jpg") || s2.equals(".gif")) {
				System.out.println("����ɹ�");
				break;
			} else {
				System.out.println("����ʧ�ܣ�����������");
			}
		}
	}
}

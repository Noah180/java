//ѭ����ʯͷ��������Ϸ
package test1;

import java.util.Scanner;

public class Playgame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for (int i = 1; i < 50; i++) {
			System.out.println("�����������ʯͷ������");
			int str1 = input.nextInt();
			int str2 = (int) (Math.random() * 3 + 1);
			System.out.println(str2);
			if (str1 == 1 || str1 == 2 || str1 == 3) {
				if (str1 == str2) {
					System.out.println("ƽ��");
				} else if (((str1 == 1) && (str2 == 3)) || ((str1 == 2) && (str2 == 1))
						|| ((str1 == 3)) && (str2 == 2)) {
					System.out.println("��ϲ��Ӯ��");
				} else {
					System.out.println("������");
				}
			} else {
				System.out.println("������������");
				continue;
			}
			System.out.println("����no�˳���Ϸ");
			String str3 = input.next();
			if (str3.equals("no")) {
				System.out.println("�Ѿ��˳���Ϸ");
				System.exit(0);
			}
		}
	}
}

//����һ���������������������
package test1;

import java.util.Scanner;

public class Guess {
	public static void main(String[] args) {
		int num1 = (int) (Math.random() * 100 + 1);
		System.out.println(num1);
		Scanner input = new Scanner(System.in);
		System.out.println("������²�����");
		int i = 1;
		do {
			int num2 = input.nextInt();
			if (num2 > num1) {
				System.out.println("�²�������ˣ������²²�");
			} else if (num1 > num2) {
				System.out.println("�²����С�������²²�");
			} else {
				System.out.println("��ϲ��¶���");
				break;
			}
			i++;
		} while (true);
		System.out.println("������" + i + "��");
	}
}

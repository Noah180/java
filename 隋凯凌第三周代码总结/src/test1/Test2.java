/*�ж�һ����������û�����������
��ע�ⲻ���ж�һ�ؾ����һ��δ�ҵ��������*/
package test1;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		int a[] = { 12, 43, 56, 45, 87, 67 };
		Scanner input = new Scanner(System.in);
		System.out.println("������һ����");
		int ss = input.nextInt();
		boolean ret = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == ss) {
				System.out.println("�������������");
				ret = true;
				break;
			}
		}
		if (ret == false) {
			System.out.println("û�������");
		}
	}
}

//�����鸳ֵ�������������������ѧ���ɼ��ļ����ʡ�
//ȥ��һ�����ֵ��ȥ��һ����Сֵ�����������ֵ�ĺ�
package test1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���������鳤��");
		int num = input.nextInt();
		int a[] = new int[num];
		for (int i = 0; i < a.length; i++) {
			System.out.println("����������Ԫ��");
			a[i] = input.nextInt();
		}
		Arrays.sort(a);
		int i = 0;
		for (; i < a.length; i++) {
			if (a[i] >= 60) {
				break;
			}
		}
		int sum = 0;
		for (int j = 1; j < a.length - 1; j++) {
			sum = sum + a[j];
		}
		System.out.println("ȥ�������Сֵ���Ϊ:" + sum);
		double xy = (double) (num - i) / num;
		System.out.println("������Ϊ:" + xy * 100 + "%");
	}
}

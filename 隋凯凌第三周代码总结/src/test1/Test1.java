//��������ܳɼ���ƽ��ֵ�������Сֵ
package test1;

import java.util.Scanner;

public class Test1 {
	int nn = sui();
	int a[] = new int[nn];

	// ����༶����
	public int sui() {
		Scanner input = new Scanner(System.in);
		System.out.println("������༶����");
		int num = input.nextInt();
		return num;
	}

	public void kai() {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < nn; i++) {
			System.out.println("������ɼ�:");
			a[i] = input.nextInt();
			if (a[i] > 100 || a[i] < 0) {
				i--;
				System.out.println("�����������������:");
				continue;
			}

		}
	}

	public int sum() {
		int sum = 0;
		for (int i = 0; i < nn; i++) {
			sum = sum + a[i];
		}
		return sum;
	}

	public double avg() {

		return sum() / nn;
	}

	public void maxMin() {
		int max = a[0];
		int min = a[0];
		for (int i = 1; i < nn; i++) {
			if (max < a[i]) {
				max = a[i];
			}
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("��߳ɼ���:" + max);
		System.out.println("��ͳɼ���:" + min);
	}

	public static void main(String[] args) {
		Test1 skl = new Test1();
		skl.kai();
		System.out.println("�ܳɼ�Ϊ:" + skl.sum());
		System.out.println("ƽ��ֵΪ:" + skl.avg());
		skl.maxMin();
	}
}

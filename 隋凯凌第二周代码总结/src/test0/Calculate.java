//��8���β����÷�������Ӽ��˳�
package test0;

import java.util.Scanner;

public class Calculate {

	public double sui(double a, double b) {
		Scanner input = new Scanner(System.in);
		double num = 0;

		System.out.println("������Ҫ��������:");
		String x = input.next();
		if (x.equals("+")) {
			num = a + b;
		} else if (x.equals("-")) {
			num = a - b;
		} else if (x.equals("*")) {
			num = a * b;
		} else if (x.equals("/")) {
			num = a / b;
		} else {
			System.out.println("���������������");
		}
		return num;

	}

	public static void main(String[] args) {
		Calculate skl = new Calculate();
		Scanner input = new Scanner(System.in);
		System.out.println("������2����");
		double a = input.nextDouble();
		double b = input.nextDouble();
		System.out.println(skl.sui(a, b));
	}
}

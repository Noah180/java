//����ɼ�������ABC�ȡ�
package test0;

import java.util.Scanner;

public class ScoreGrade {

	public String sui(double num) {
		String a = "";
		if (num > 100 || num < 0) {
			a = "�������";
		} else if (num >= 90) {
			a = "A";
		} else if (num > 60) {
			a = "C";
		} else {
			a = "E";
		}
		return a;
	}

	public static void main(String[] args) {
		ScoreGrade skl = new ScoreGrade();
		Scanner input = new Scanner(System.in);
		System.out.println("������ɼ�");
		double num = input.nextDouble();
		System.out.println(skl.sui(num));
	}
}

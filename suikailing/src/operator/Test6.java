//��6������һ�������꣬��һ����ƽ�ꣿ
package operator;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		System.out.println("��������ݣ�");
		Scanner input=new Scanner(System.in);
		int year=input.nextInt();
		if(((year%4==0)&&(year%100!=0))||(year%400==0)){
			System.out.println("����������ꡣ");
		}else{
			System.out.println("�������ƽ�ꡣ");
		}
	}
}

//��1����ϰ������2�����֣���һ����������ʵ�ּӼ��˳���
package judge;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Test1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("�������һ������");
		int num1=input.nextInt();
		System.out.println("������ڶ�����:");
		int num2=input.nextInt();
		System.out.println("������Ҫ���е����㣺1.+,2.-,3.*,4./:");
		int yunsuan=input.nextInt();
		int calculate=0;
		if(yunsuan==1){
			calculate=num1+num2;
		}else if(yunsuan==2){
			calculate=num1-num2;
		}else if(yunsuan==3){
			calculate=num1*num2;
		}else if(yunsuan==4){
			calculate=num1/num2;
		}
		System.out.println(calculate);
	}
}

//��4����ϰ���ӿ���̨���2���ַ����ж��Ƿ���ȣ���ȴ�ӡ1�����ȴ�ӡ0.
package operator;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("�������һ���ַ���");
		int str1=input.nextInt();
		System.out.println("������ڶ����ַ�:");
		int str2=input.nextInt();
		int ret=(str1==str2)?1:0;
		System.out.println("�������ǣ�"+ret);
		
	}
}

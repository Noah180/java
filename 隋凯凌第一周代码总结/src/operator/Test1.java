//��1����ϰ������һ����λ�������λʮλ��λ�ֱ�Ϊ���٣�

package operator;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("������һ����λ����");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int hundred=num/100;
		int shiwei=num/10%10;
		int gewei=num%10;
		System.out.println("��λ���ǣ�"+hundred);
		System.out.println("ʮλ���ǣ�"+shiwei);
		System.out.println("��λ���ǣ�"+gewei);
				
	}
}

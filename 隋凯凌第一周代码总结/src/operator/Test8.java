/*��8��   ��7����Ϸ����7��7�ı���������14,17
�ӿ���̨��������һ�����������Ҫ�ã�����ʾ���á�.�����������С��100*/
package operator;

import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {
		System.out.println("������һ����λ����");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		if((num%7==0)||(num%10==7)){
			System.out.println("��");
		}else{
			System.out.println(num);
		}
	}
}

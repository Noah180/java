//��7��ˮ�ɻ���12321������λ=��λ��ʮλ=ǧλ��
//    �ӿ���̨��������һ����λ�����ж��Ƿ���ˮ�ɻ�����
package operator;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		System.out.println("������һ����λ��:");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int wanwei=num/10000;
		int qianwei=num/1000%10;
		int shiwei=num/10%10;
		int gewei=num%10;
		if((wanwei==gewei)&&(shiwei==qianwei)){
			System.out.println(num+"��һ��ˮ�ɻ�����");
		}else{
			System.out.println(num+"����һ��ˮ�ɻ�����");
		}
	}
}

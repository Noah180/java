package skl;

import java.util.Scanner;

public class Runnian {
	public static void main(String[] args) {
		System.out.println("��������ݣ�");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		if((a<0)||(a>9999)){
			System.out.println("������Ч");
			System.exit(0);//�˳���ǰ����
		}
		if(((a%4==0)&&(a%100!=0))||(a%400==0)){
			System.out.println("����");
		}else{
			System.out.println("ƽ��");
		}
	}
}

//��7�����ĳ��1��1�տ�ʼ����ĳ��ĳ��ĳ��Ϊֹ��һ���ж����죿
package cycle;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year=input.nextInt();
		System.out.println("�������·�:");
		int month=input.nextInt();
		System.out.println("����������:");
		int day=input.nextInt();
		int monthday=0,sum=0;
		for(int i=1;i<month;i++){
			switch(i){
			case 4:
			case 6:
			case 9:
			case 11:
				monthday=30;
				break;
			case 2:
				if(((year%4==0)&&(year%100!=0))||(year%400==0)){
					monthday=29;
				}else{
					monthday=28;
				}
				break;
			default:
				monthday=31;
			}
			sum=sum+monthday;
		}
		System.out.println("������Ϊ��"+(sum+day));
	}
}

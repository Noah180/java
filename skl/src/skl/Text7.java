package skl;

import java.util.Scanner;

public class Text7 {
	public static void main(String[] args) {
		//��������·�
		Scanner input=new Scanner(System.in);
		System.out.println("��������������·ݣ�");
		int year=input.nextInt();
		int month=input.nextInt();
		//��֤���������Ч��
		if((year>10000)||(year<=0)){
			System.out.println("�������");
			System.exit(0);
		}
		//��֤�����·���Ч��
		if((month>12)||(month<=0)){
			System.out.println("�������");
			System.exit(0);
		}
		switch(month){
			case 2:
				if(((year%4==0)&&(year%100!=0))||(year%400==0)){
					System.out.println("������29��");
				}else{
					System.out.println("������28��");
				}
				break;
			case 4:
			case 6:		
			case 9:
			case 11:
				System.out.println("������30��");
				break;
			default:
				System.out.println("������31��");
				break;
		}
	}
}

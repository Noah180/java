package xunhuan;

import java.util.Scanner;

public class Lianxi3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("���������");
		int year=input.nextInt();
		
		if((year>9999)||(year<0)){
			System.out.println("���������ݣ��������룺");
			System.exit(0);
		}
//      ��֤��ݵ���Ч��		
		System.out.println("�������·�");
		int month=input.nextInt();
//      ��֤�·ݵ���Ч��			
		if((month>12)||(month<=0)){
			System.out.println("��������·ݣ��������룺");
			System.exit(0);
		}
		System.out.println("����������");
		int day=input.nextInt();
//       ��֤���ڵ���Ч��	�������⡣2�·�Ҳ������30��
		if((day>31)||(day<=0)){
			System.out.println("����������ڣ��������룺");
			System.exit(0);
		}
		int days=0;
		int x=0;
//       �����·ݣ�����������·�С���·ݵ�����
		for(int i=1;i<month;i++){
			switch(i){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days=31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days=30;
				break;
			case 2:
				if(((year%4==0)&&(year%100!=0))||(year%400==0)){
					days=29;
					break;
				}else{
					days=28;
					break;
				}	
			}
//       ��֤��1�µ�����month�·ݵ��м�ÿ���¶��ж����죬������͡�
			x=x+days;
		}
		System.out.println(year+"��1��1�յ�"+month+"��"+day+"��һ����"+(x+day)+"��");

	}
}

//��8����֪2018��1��1��Ϊ����1���������·�������
package cycle;

import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year=input.nextInt();
		System.out.println("�������·ݣ�");
		int month=input.nextInt();
		int days=0,sum=0;
		for(int i=1;i<=month;i++){
			switch(i){
			case 4:
			case 6:
			case 9:
			case 11:
				days=30;
				break;
			case 2:
				if(((year%4==0)&&(year%100!=0))||(year%400==0)){
					days=29;
				}else{
					days=28;
				}
				break;
			default:
				days=31;
				break;
			}
			sum=sum+days;
		}
		int y=(sum-days)%7;
		System.out.println(y);
		int num=0;
		System.out.println("һ\t��\t��\t��\t��\t��\t��");
		for(int j=1;j<=(days+y);j++){
			if(j<=y){
				System.out.print("\t");
				num++;
			}else{
				if(num<7){
					num++;
					System.out.print((j-y)+"\t");

				}else{
					System.out.println();
					num=0;
					System.out.print((j-y)+"\t");
					num++;
				}
			}
		}
	}
}

package xunhuan;

import java.util.Scanner;

public class Rili {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("���������");
		int year=input.nextInt();
		System.out.println("�������·�");
		int month=input.nextInt();
		int days=0;
		int x=0;
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
		x=x+days;
		}
		int num=0;
		int y=x%7;
		System.out.println(x);
		System.out.println("һ\t��\t��\t��\t��\t��\t��");
		for(int j=1;j<=days+y;j++){
			if(j<=y){
				System.out.print("\t");
				num++;
			}
			else {
				if(num<7){
					System.out.print((j-y)+"\t");
					num++;
				}
				else{
					num=0;
					System.out.println();
					System.out.print((j-y)+"\t");
					num++;
				}
			}
			
		}
			
	}
				
}

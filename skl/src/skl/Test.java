package skl;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("������һ������");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		if(num%2==0){
			System.out.println("ż��");
		}else{
			System.out.println("����");
		}
	}
}

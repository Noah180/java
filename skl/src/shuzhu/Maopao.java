package shuzhu;
import java.util.Scanner;
public class Maopao {
	public static void main(String[] args) {
		System.out.println("������2������");
		Scanner input=new Scanner(System.in);
		int num1=input.nextInt();
		int num2=input.nextInt();
		int rew=0;
		System.out.println("��ѡ��Ҫ���еļ��㣺1���ӷ���2��������3���˷���4��������");
		int num3=input.nextInt();
		if(num3==1){
			rew=num1+num2;
		}else if(num3==2){
		    rew=num1-num2;
		}else if(num3==3){
			rew=num1*num2;
		}else if(num3==4){
			rew=num1/num2;
		}else{
            System.out.println("�������");
            System.exit(0);
		}
        System.out.println(rew);
	}
}


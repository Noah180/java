//��5������༶n��ѧ���ųɼ�������ƽ���֡�
package cycle;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("������༶����:");
		int num=input.nextInt();
		System.out.println("������ѧ���ɼ���");
		int avg=0,sum=0;
		for(int i=1;i<=num;i++){
			int score=input.nextInt();
			sum=sum+score;
		}
		avg=sum/num;
		System.out.println("ƽ�����ǣ�"+avg);
	}
}

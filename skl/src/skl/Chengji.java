package skl;

import java.util.Scanner;

public class Chengji {
	public static void main(String[] args) {
		System.out.println("�����뿼���ɼ���");
		Scanner input=new Scanner(System.in);
		int score=input.nextInt();
		if((score>100)||(score<0)){
			System.out.println("�ɼ����100�֣����������룡");
			System.exit(0);
		}
		if(score>=90){
			System.out.println("�����ɼ��ţ�");
		}else if(score>=70){
			System.out.println("�����ɼ�����");
		}else if(score>=60){
			System.out.println("�����ɼ�����");
		}else{
			System.out.println("�����ɼ�������");
		}
	}
}

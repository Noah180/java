//��2�������������ʾ�ȼ���90~100���ɼ��š�
//    70~89�ɼ�����60~70�ɼ�����0~59�ɼ�������
package judge;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("������ɼ���");
		int score=input.nextInt();
		if((score>100)||(score<0)){
			System.out.println("�����������������");
			System.exit(0);
		}
		if(score>=90){
			System.out.println("�ɼ���");
		}else if(score>=70){
			System.out.println("�ɼ���");
		}else if(score>=60){
			System.out.println("�ɼ�����");
		}else{
			System.out.println("�ɼ�������");
		}
	}
}

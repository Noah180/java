//(5)��ϰ���ӿ���̨���뿼�Գɼ�����������񰤴�
package operator;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		System.out.println("�����뿼�Գɼ���");
		Scanner input=new Scanner(System.in);
		int score=input.nextInt();
		if(score<60){
			System.out.println("�ɼ�������");
		}else{
			System.out.println("��ϲ�ɼ�����");
		}
	}
}

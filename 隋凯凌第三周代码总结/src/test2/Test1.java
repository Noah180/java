/*��ҵ��
	��¼��֤�ļ������ò˵��࣬�˵���Ϊ����Ա��һ����ݣ����ο͡�
	��Ӧ�ʼ����2���⡣*/
package test2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test1 {
	public Test1() throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		Scanner sup = new Scanner(new File("E:/suikailing.txt"));
		while (true) {
			System.out.println("�������˺�:");
			String s1 = input.next();
			if (s1.isEmpty()) {
				System.out.println("�˺Ų���Ϊ�գ���������");
				continue;
			}
			System.out.println("����������:");
			String s2 = input.next();
			if (s2.isEmpty()) {
				System.out.println("���벻��Ϊ�գ���������");
				continue;
			}
			String s3 = s1 + s2;
			boolean ret = false;
			MainMenu skl = new MainMenu();
			while (sup.hasNextLine()) {
				String s4 = sup.nextLine();
				if (s3.equals(s4)) {
					ret = true;
					if (s1.equals("�忭��")) {
						skl = new GuanLi();
					} else if (s1.equals("����")) {
						skl = new Touist();
					}
					skl.sui();

				}
			}
			if (ret == false) {
				System.out.println("���������������");
				continue;
			}

		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		Test1 dudu = new Test1();
	}

}

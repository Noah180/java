//ɨ���ļ����γ�һ������ַ���,���Ұ����ı��еĸ�ʽ��ʾ��������С�
package test1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("E:/suikailing.txt"));
		StringBuffer s1 = new StringBuffer();
		while (input.hasNextLine()) {
			s1.append(input.nextLine());
		}
		System.out.println(s1);
	}

}

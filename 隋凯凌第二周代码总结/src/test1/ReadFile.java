//��ȡ�ļ������α����ļ���ÿ�У�����֤���������Ƿ����ļ���ĳһ����ȡ����û����棬���򡣣�
package test1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ReadFile {
	public static void main(String[] args) throws FileNotFoundException {
		//�ļ�·��
		Scanner input = new Scanner(new File("E:/suikailing.txt"));
		String str1 = JOptionPane.showInputDialog("����������:");
		String str2 = JOptionPane.showInputDialog("����������:");
		String str3 = str1 + str2;
		boolean ret = false;
		while (input.hasNextLine()) {
			String str4 = input.nextLine();
			if (str3.equals(str4)) {
				ret = true;
				JOptionPane.showMessageDialog(null, "��½�ɹ�");
				break;
			}
		}
		if (ret == false) {
			JOptionPane.showMessageDialog(null, "�������");
		}
	}
}

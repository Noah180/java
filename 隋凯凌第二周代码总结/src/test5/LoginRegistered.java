package test5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class LoginRegistered {
	String s3 = "";

	public void sui1() {
		do {
			String s1 = JOptionPane.showInputDialog("�������˺�:");
			String s2 = JOptionPane.showInputDialog("��������");
			s3 = s1 + s2;
			if (s1.equals("") || s2.equals("")) {
				JOptionPane.showMessageDialog(null, "�˺����벻��Ϊ�գ����������룺");
			} else {
				break;
			}
		} while (true);
	}

	public void sui() throws FileNotFoundException {
		// �ǿ���֤
		MenuRankingList skl1 = new MenuRankingList();
		sui1();
		Scanner input = new Scanner(new File("E:/suikailing.txt"));
		boolean ret = false;

		while (input.hasNextLine()) {
			String s4 = input.nextLine();
			if (s3.equals(s4)) {
				skl1.kai1();
				ret = true;
				break;
			}
		}
		if (ret == false) {
			JOptionPane.showMessageDialog(null, "δ�ҵ��˺����룬��ע��");
			sui();
		}

	}
}

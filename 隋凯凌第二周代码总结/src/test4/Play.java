package test4;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Play {

	public void kai() {
		int i = 0, j = 0, x = 0;
		do {
			Vistable kai1 = new Vistable();
			int s0 = (int) (Math.random() * 3 + 1);
			String s1 = JOptionPane.showInputDialog("���ȭ1:������2:ʯͷ��3:��.0:�˳���");
			int s2 = Integer.parseInt(s1);
			if (s2 == 0) {
				break;
			} else if (s2 < 0 || s2 > 3) {
				JOptionPane.showMessageDialog(null, "���������������");
				continue;
			}
			JOptionPane.showMessageDialog(null, ("���" + kai1.sui(s2)) + "\n���Գ�" + kai1.sui(s0));
			if (s0 == s2) {
				JOptionPane.showMessageDialog(null, "ƽ��");
				i++;
			} else if ((s0 == 1 && s2 == 3) || (s0 == 2 && s2 == 1) || (s0 == 3 && s2 == 2)) {
				JOptionPane.showMessageDialog(null, "������");
				j++;
			} else {
				JOptionPane.showMessageDialog(null, "��Ӯ��");
				x++;
			}
			String s3 = JOptionPane.showInputDialog("�Ƿ������yes or no");
			if (s3.equals("no")) {
				JOptionPane.showMessageDialog(null, "���˳�");
				break;
			}
		} while (true);
		JOptionPane.showMessageDialog(null, ("ƽ��" + i) + ("\nӮ�ˣ�" + j) + ("\n����" + x));
	}
}

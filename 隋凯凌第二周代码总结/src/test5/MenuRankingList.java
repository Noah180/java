package test5;

import javax.swing.JOptionPane;

public class MenuRankingList {

	public void kai2() {
		JOptionPane.showMessageDialog(null, "1:�忭��\n2:���\n3:����");

	}

	public void kai3() {
		JOptionPane.showMessageDialog(null, "�绰��18210081762 ");
	}

	public void kai1() {
		String s1 = JOptionPane.showInputDialog("1.���а�\n2.������Ϣ\n3.�˳�");
		do {
			if (s1.equals("1")) {
				kai2();
				break;
			} else if (s1.equals("2")) {
				kai3();
				break;
			} else if (s1.equals("3")) {
				JOptionPane.showMessageDialog(null, "�Ѿ��˳�ϵͳ");
				System.exit(0);
			} else {
				JOptionPane.showMessageDialog(null, "�����������������");
			}
		} while (true);
	}

}

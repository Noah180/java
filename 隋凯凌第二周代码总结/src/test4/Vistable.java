package test4;

import javax.swing.JOptionPane;

public class Vistable {
	public String sui(int s2) {
		String str = "";
		if (s2 == 0) {
			JOptionPane.showMessageDialog(null, "���˳���Ϸ");
			System.exit(0);
		} else if (s2 == 1) {
			str = "����";
		} else if (s2 == 2) {
			str = "ʯͷ";
		} else if (s2 == 3) {
			str = "��";
		}
		return str;
	}
}

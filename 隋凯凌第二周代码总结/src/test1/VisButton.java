//�ڵ�������ʾ��ť�������ࡣ
package test1;

import javax.swing.JButton;
import javax.swing.JFrame;

public class VisButton extends JFrame {
	public void sui() {
		JButton sui1 = new JButton("��½");
		add(sui1);
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		VisButton s = new VisButton();
		s.sui();
	}
}

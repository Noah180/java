//�����˵���������
package test1;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CreateMenuBar extends JFrame{
	
	public void sui(){
		JTextArea sui1=new JTextArea(3,20);
		JPanel ss=new JPanel();
		add(ss, BorderLayout.NORTH);
		ss.add(sui1);
		JMenuBar bar=new JMenuBar();
		setJMenuBar(bar);
		JMenu s1=new JMenu("����");
		JMenuItem s2=new JMenuItem("����");
		JMenuItem s3=new JMenuItem("��ɫ");
		s1.add(s2);
		s1.add(s3);
		bar.add(s1);
		pack();
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		CreateMenuBar kailing=new CreateMenuBar();
		kailing.sui();
	}
}

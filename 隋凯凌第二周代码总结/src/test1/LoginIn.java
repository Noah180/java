//��ʾ���˺ţ�����͵�½ע��
package test1;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginIn extends JFrame {
	
	public void sui(){
		JPanel s1=new JPanel();
		JPanel s2=new JPanel();
		JPanel s3=new JPanel();
		add(s1, BorderLayout.NORTH);
		add(s2,BorderLayout.CENTER);
		add(s3,BorderLayout.SOUTH);
		JLabel sui1=new JLabel("����");
		JTextField sui2=new JTextField(20);
		s1.add(sui1);
		s1.add(sui2);
		JLabel sui3=new JLabel("����");
		JPasswordField sui4=new JPasswordField(20);
		s2.add(sui3);
		s2.add(sui4);
		JButton sui5=new JButton("��½");
		JButton sui6=new JButton("ע��");
		s3.add(sui5);
		s3.add(sui6);
		pack();
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		LoginIn suikailing=new LoginIn();
		suikailing.sui();
	}
}

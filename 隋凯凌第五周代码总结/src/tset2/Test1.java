package tset2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;

public class Test1 {
	public static void main(String[] args) {
		ServerSocket sever;
		try {
			sever = new ServerSocket(1212);
			System.out.println("�������Ѿ�����");
			while (true) {
				Socket sui1 = sever.accept();
				InputStream is = sui1.getInputStream();
				DataInputStream dis = new DataInputStream(is);
				String s2 = dis.readUTF();
				String s5 = JOptionPane.showInputDialog(s2);
				OutputStream os = sui1.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);
				dos.writeUTF(s5);
				if (s5.equals("�ݰ�") || s2.equals("�ݰ�")) {
					dis.close();
					is.close();
					dos.flush();
					os.flush();
					dos.close();
					os.close();
					sever.close();
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
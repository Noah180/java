/*�ӿ���̨����ѧ����ѧ�ţ��������ɼ���Ϣ��������Linkedlist�洢ѧ������Ϣ��
���������ѧ�Ų�����ͬ����ͬ���������룬����0�˳�¼��ѧ����Ϣ����ת����ѯѧ
����Ϣ���棬����ѧ�ţ���ʾѧ����������Ϣ��ѭ������ѧ�Ų�ѯ��������ѧ��Ϊ0ʱ
�˳�ϵͳ��������ѧ��Ϊ1ʱ����ת���޸�ѧ����Ϣ���棬�����ṩ��ѧ�ţ��޸�ѧ��
�������ͳɼ����޸���ɺ����ز�ѯ��Ϣ���棬��ѯ�޸ĺ��ѧ����Ϣ��*/
package test2;

import java.util.LinkedList;
import java.util.Scanner;

public class Test2 {
	LinkedList<Test1> skl=new LinkedList<Test1>();
	Scanner input=new Scanner(System.in);
	public void sui(){
		while(true){
			boolean ret=false;
			System.out.println("������ѧ��(0�˳�)");
			String s1=input.next();
			if(s1.equals("0")){
				break;
			}
			if(s1.isEmpty()){
				System.out.println("����Ϊ��");
				continue;
			}
			for(Test1 dudu:skl){
				if(s1.equals(dudu.getStuid())){
					System.out.println("ѧ���ظ�����������");
					ret=true;
					break;
				}
			}
			if(ret==false){
				System.out.println("����������");
				String s2=input.next();
				System.out.println("������ɼ�");
				String s3=input.next();
				Test1 lala=new Test1(s1, s2, s3);
				skl.add(lala);
			}
			
		}
	}
	
	public void kai(){
		while(true){
			boolean ret=false;
			System.out.println("������Ҫ��ѯ��ѧ��(0�޸������˳�)");
			String s1=input.next();
			if(s1.equals("0")){
				this.ling();
				break;
			}
			if(s1.equals("�˳�")){
			System.exit(0);
			}
			for(Test1 dudu:skl){
				if(dudu.getStuid().equals(s1)){
					System.out.println(dudu.getStuid()+"\t"+dudu.getStuname()+"\t"+dudu.getStuscore());
					ret=true;
					break;
				}
			}
			if(ret==false){
				System.out.println("δ�ҵ����ѧ�ţ���������");
				continue;
			}
		}
	}	
	public void ling(){
		while(true){
			boolean ret=false;
			System.out.println("������Ҫ�޸ĵ�ѧ��(0��ѯ,����ɾ��)");
			String s1=input.next();
			if(s1.equals("0")){
				this.kai();
				break;
			}
			if(s1.equals("ɾ��")){
				this.suikailing();
				break;
			}
			for(Test1 dudu:skl){
				if(s1.equals(dudu.getStuid())){
					System.out.println("�������޸ĵ�����");
					String s2=input.next();
					System.out.println("�������޸ĵĳɼ�");
					String s3=input.next();
					dudu.setStuname(s2);
					dudu.setStuscore(s3);
					ret=true;
				}
			}
			if(ret==false){
				System.out.println("δ�ҵ����ѧ�ţ���������");
				continue;
			}
		}
	}
	public void suikailing(){
		while(true){
			boolean ret=false;
			System.out.println("������Ҫɾ����Ԫ��(0��ѯ)");
			String s1=input.next();
			if(s1.equals("0")){
				this.kai();
			}
			for(Test1 dudu:skl){
				if(s1.equals(dudu.getStuid())){
					skl.remove(dudu);
					System.out.println("�Ѿ�ɾ��");
					ret=true;
					break;
				}
			}
			if(ret==false){
				System.out.println("δ�ҵ����ѧ�ţ���������");
				continue;
			}
		}
	}
	public static void main(String[] args) {
		Test2 uio=new Test2();
		uio.sui();
		uio.kai();
	}
}

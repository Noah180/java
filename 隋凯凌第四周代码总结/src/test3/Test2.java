package test3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test2 {
	Scanner input = new Scanner(System.in);
	Map<String, Test1> skl = new HashMap<String, Test1>();
	public void sui() {
		Test1 sui1 = new Test1("1930", "������");
		Test1 sui2 = new Test1("1934", "�����");
		Test1 sui3 = new Test1("1938", "�����");
		Test1 sui4 = new Test1("1950", "������");
		Test1 sui5 = new Test1("1954", "����");
		Test1 sui6 = new Test1("1958", "����");
		Test1 sui7 = new Test1("1962", "����");
		Test1 sui8 = new Test1("1966", "Ӣ����");
		Test1 sui9 = new Test1("1970", "����");
		Test1 sui10 = new Test1("1974", "����");
		Test1 sui11 = new Test1("1978", "����͢");
		Test1 sui12 = new Test1("1982", "�����");
		Test1 sui13 = new Test1("1986", "����͢");
		Test1 sui14 = new Test1("1990", "����");
		Test1 sui15 = new Test1("1994", "����");
		Test1 sui16 = new Test1("1998", "����");
		Test1 sui17 = new Test1("2002", "����");
		Test1 sui18 = new Test1("2006", "�����");
		Test1 sui19 = new Test1("2010", "������");
		Test1 sui20 = new Test1("2014", "�¹�");
		skl.put("1930", sui1);
		skl.put("1934", sui2);
		skl.put("1938", sui3);
		skl.put("1950", sui4);
		skl.put("1954", sui5);
		skl.put("1958", sui6);
		skl.put("1962", sui7);
		skl.put("1966", sui8);
		skl.put("1970", sui9);
		skl.put("1974", sui10);
		skl.put("1978", sui11);
		skl.put("1982", sui12);
		skl.put("1986", sui13);
		skl.put("1990", sui14);
		skl.put("1994", sui15);		
		skl.put("1998", sui16);
		skl.put("2002", sui17);
		skl.put("2006", sui18);
		skl.put("2010", sui19);
		skl.put("2014", sui20);	
	}
	
	public void kai(){
		while(true){
			boolean ret=false;
			System.out.println("���������");
			String s1=input.next();
			for(Test1 dudu:skl.values()){
				if(skl.containsKey(s1)){
					System.out.println(dudu.getCountry());
					ret=true;
					break;
				}
			}
		
			if(ret==false){
				System.out.println("����û���籭");
				continue;
			} else{
				break;
			}
		}					
	}
	
	public void ling(){
		while(true){
			boolean ret=false;
			System.out.println("��������ӹ��ң�0�˳���");
			String s1=input.next();
			if(s1.equals("0")){
				System.exit(0);
			}
			for(Test1 dudu:skl.values()){
				if(dudu.getCountry().equals(s1)){
					System.out.println(dudu.getYear());
					ret=true;
				}
			}
			if(ret==false){
				System.out.println("�ù���Ϊ�ù��ھ�");
				continue;
			}
		}
	}
	
	public static void main(String[] args) {
		Test2 suikailing=new Test2();
		suikailing.sui();
		suikailing.kai();
		suikailing.ling();
	}
	
}

//��6��������2018�꣬�����˿���80000�ˣ������˿�ÿ����25%��
//     �ٶ����ӣ���ô����������˿������ﵽ200000��
package cycle;

public class Test6 {
	public static void main(String[] args) {
		double people=80000;
		int  i=0;
		for(;people<=200000;){
			i++;
			people=people*1.25;
		}
		System.out.println("��Ҫ��"+(2018+i)+"��.");
	}
}

/*��1������һ��������Creature��֪ʶ�㣺����Ĵ�����ʹ�ã� 

    1)����һ������setSnarl(Cat cat)�������ö��﷢��è������
    2)setSnarl(Dog dog)�������ö��﷢����������
    3)����һ��outPut()����������������������
��2��Ҫ����һ��è��Cat������è����������è�ഫ�붯����Creature�ĺ�з���setSnarl(Cat cat)�������ö��﷢��è������
��3��Ҫ����һ������Dog�����й��������������ഫ�붯����Creature�ĺ�з���setSnarlDog dog)�������ö��﷢����������
��4������һ��Sound�࣬��main���������Creature���setSnarl()��outPut()�����ֱ����ö����������������������*/
package exam;

public class Sound {
	public static void main(String[] args) {
		Creature sui1 = new Creature();
		Dog sui2 = new Dog();
		Cat sui3 = new Cat();
		sui1.srtSnarl(sui3);
		sui1.outPut();
		sui1.srtSnarl(sui2);
		sui1.outPut();
	}
}

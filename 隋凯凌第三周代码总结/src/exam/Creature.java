/*��1������һ��������Creature��֪ʶ�㣺����Ĵ�����ʹ�ã� 

    1)����һ������setSnarl(Cat cat)�������ö��﷢��è������
    2)setSnarl(Dog dog)�������ö��﷢����������
    3)����һ��outPut()����������������������
��2��Ҫ����һ��è��Cat������è����������è�ഫ�붯����Creature�ĺ�з���setSnarl(Cat cat)�������ö��﷢��è������
��3��Ҫ����һ������Dog�����й��������������ഫ�붯����Creature�ĺ�з���setSnarlDog dog)�������ö��﷢����������
��4������һ��Sound�࣬��main���������Creature���setSnarl()��outPut()�����ֱ����ö����������������������*/
package exam;

public class Creature {
	String sound;

	public void srtSnarl(Cat cat) {
		sound = cat.sui();
	}

	public void srtSnarl(Dog dog) {
		sound = dog.sui();
	}

	public void outPut() {
		System.out.println(sound);
	}
}

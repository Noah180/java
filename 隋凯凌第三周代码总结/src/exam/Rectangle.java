package exam;

public class Rectangle {

	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getArea() {
		return length * width;
	}

	public int getPor() {
		return 2 * (length + width);
	}

	public void showAll() {
		System.out.println("���εĳ���:" + length + "\t���εĿ�Ϊ:" + width);
		System.out.println("���ε������:" + getArea() + "\t���ε��ܳ�Ϊ:" + getPor());
	}

	public static void main(String[] args) {
		Rectangle skl = new Rectangle(30, 40);
		skl.showAll();
	}
}

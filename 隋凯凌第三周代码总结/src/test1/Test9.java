/*��дһ����Book2������̲ģ�
�������ԣ����ƣ�title����ҳ����pageNum��������ҳ����������200ҳ��
�������������Ϣ��������Ĭ��ֵ200���з����� detail�������ڿ���̨��
��ÿ���̲ĵ����ƺ�ҳ�������д������Ĺ��췽����������ɶ���ĳ�ʼ����
�������ڹ��췽������ɶ�ҳ������Сֵ���Ʊ�д������Book2Test���в�
�ԣ���ʼ��һ��Book2���󣬲����ø�Book2�����detail������������
���Ƿ���ȷ*/
package test1;

public class Test9 {
	private String bookName;
	private int bookPageNum;

	public Test9(String bookName, int bookPageNum) {
		this.bookName = bookName;
		this.bookPageNum = bookPageNum;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookPageNum() {
		return bookPageNum;
	}

	public void setBookPageNum(int bookPageNum) {
		if (bookPageNum < 200) {
			bookPageNum = 200;
		}
		this.bookPageNum = bookPageNum;
	}

	public void detail() {
		System.out.println("������:" + bookName + "\t��ҳ��:" + bookPageNum);
	}

	public static void main(String[] args) {
		Test9 skl = new Test9("�Ƕ�", 234);
		skl.detail();
	}

}

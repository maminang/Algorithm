package stack;

public class Main {

	public static void main(String[] args) {
		GenericStack<String> strStack = new GenericStack<String>(4);
		strStack.push("ó������ ��");
		strStack.push("�ι�°�� ��");
		strStack.push("����°�� ��");
		strStack.push("���� ���� �����");

		strStack.dump();
		System.out.println(strStack.size());

		System.out.println(strStack.pop());

		strStack.dump();
		System.out.println(strStack.size());

		strStack.push("���������� ��");

		strStack.dump();
		System.out.println(strStack.size());

		System.out.println(strStack.peek());

		System.out.println(strStack.indexOf("�ι�°�� ��"));

		System.out.println(strStack.capacity());

		System.out.println(strStack.isFull());
		System.out.println(strStack.isEmpty());

		strStack.clear();

		System.out.println(strStack.isFull());
		System.out.println(strStack.isEmpty());

		strStack.push("������ ��� ���׸��� ���� ��Ƴ�");
		strStack.push("�Ϻ��ϰ� ���ư��� ���̳� ����");

		strStack.dump();
		System.out.println(strStack.isFull());
		System.out.println(strStack.isEmpty());
	}

}

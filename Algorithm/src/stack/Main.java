package stack;

public class Main {

	public static void main(String[] args) {
		GenericStack<String> strStack = new GenericStack<String>(4);
		strStack.push("처음으로 들어감");
		strStack.push("두번째로 들어감");
		strStack.push("세번째로 들어감");
		strStack.push("제발 오류 없어라");

		strStack.dump();
		System.out.println(strStack.size());

		System.out.println(strStack.pop());

		strStack.dump();
		System.out.println(strStack.size());

		strStack.push("마지막으로 들어감");

		strStack.dump();
		System.out.println(strStack.size());

		System.out.println(strStack.peek());

		System.out.println(strStack.indexOf("두번째로 들어감"));

		System.out.println(strStack.capacity());

		System.out.println(strStack.isFull());
		System.out.println(strStack.isEmpty());

		strStack.clear();

		System.out.println(strStack.isFull());
		System.out.println(strStack.isEmpty());

		strStack.push("스택은 쉬운데 제네릭이 은근 어렵네");
		strStack.push("완벽하게 돌아간다 껌이네 ㅋㅋ");

		strStack.dump();
		System.out.println(strStack.isFull());
		System.out.println(strStack.isEmpty());
	}

}

package stack;

import java.util.EmptyStackException;

public class GenericStack<E> {
	private int capacity;
	private int pointer;
	private E[] stack;

	@SuppressWarnings("unchecked") // 제네릭 배열 이렇게 선언하는거 밖에 없나??
	public GenericStack(int capacity) {
		this.capacity = capacity;
		pointer = 0;
		stack = (E[]) new Object[capacity];
	}

	public void push(E e) throws StackOverflowError {
		if (pointer >= capacity) {
			throw new StackOverflowError();
		} else {
			stack[pointer++] = e;
		}
	}

	public E pop() throws EmptyStackException {
		if (pointer <= 0) {
			throw new EmptyStackException();
		} else {
			return stack[--pointer];
		}
	}

	public E peek() throws EmptyStackException {
		if (pointer <= 0) {
			throw new EmptyStackException();
		} else {
			return stack[pointer - 1];
		}
	}

	public int indexOf(E e) {
		if (pointer > 0) {
			for (int i = pointer - 1; i >= 0; i--) {
				if (e.equals(stack[i])) {
					return i;
				}
			}
		}
		return -1;
	}

	public void clear() {
		pointer = 0;
	}

	public int capacity() {
		return capacity;
	}

	public int size() {
		return pointer;
	}

	public boolean isEmpty() {
		return pointer < 1;
	}

	public boolean isFull() {
		return pointer >= capacity;
	}

	public void dump() {
		System.out.print("[");
		for (int i = pointer - 1; i >= 0; i--) {
			if (i > 0) {
				System.out.print(stack[i] + ", ");
			} else {
				System.out.print(stack[i]);
			}
		}
		System.out.println("]");
	}
}

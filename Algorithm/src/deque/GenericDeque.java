package deque;

public class GenericDeque<E> {
	private int capacity;
	private int size;
	private int front;
	private int rear;
	private E[] deque;

	@SuppressWarnings("unchecked")
	public GenericDeque(int capacity) {
		this.capacity = capacity;
		this.size = this.front = this.rear = 0;
		deque = (E[]) new Object[capacity];
	}

	public void addFront(E e) throws OverFlowDequeException {
		if (isFull()) {
			throw new OverFlowDequeException();
		} else {
			if (--front < 0) {
				front = capacity - 1;
			}
			deque[front] = e;
			size++;
		}
	}

	public void addRear(E e) throws OverFlowDequeException {
		if (isFull()) {
			throw new OverFlowDequeException();
		} else {
			deque[rear++] = e;
			size++;
			if (rear == capacity) {
				rear = 0;
			}
		}
	}

	public void removeFront() {
		if (++front >= capacity) {
			front = 0;
		}
		size--;
	}

	public void removeRear() {
		if (--rear < 0) {
			rear = capacity - 1;
		}
		size--;
	}

	public E pollFront() throws EmptyDequeException {
		if (isEmpty()) {
			throw new EmptyDequeException();
		} else {
			E e = deque[front++];
			if (front >= capacity) {
				front = 0;
			}
			size--;
			return e;
		}
	}

	public E pollRear() throws EmptyDequeException {
		if (isEmpty()) {
			throw new EmptyDequeException();
		} else {
			if (--rear < 0) {
				rear = capacity - 1;
			}
			E e = deque[rear];
			size--;
			return e;
		}
	}

	public E peekFront() {
		return deque[front];
	}

	public E peekRear() {
		return deque[rear <= 0 ? capacity - 1 : rear - 1];
	}

	public int indexOf(E e) {
		for (int i = 0; i < size; i++) {
			if (deque[(front + i) % capacity].equals(e)) {
				return i;
			}
		}
		return -1;
	}

	public E search(int index) {
		E e = deque[(front + index) % capacity];
		if (e != null) {
			return e;
		} else {
			return null;
		}
	}

	public void clear() {
		this.size = this.front = this.rear = 0;
	}

	public int capacity() {
		return capacity;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size >= capacity;
	}
}

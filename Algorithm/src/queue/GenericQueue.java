package queue;

public class GenericQueue<E> {
	private int capacity;
	private int size;
	private int front;
	private int rear;
	private E[] queue;

	@SuppressWarnings("unchecked")
	public GenericQueue(int capacity) {
		this.capacity = capacity;
		this.size = this.front = this.rear = 0;
		queue = (E[]) new Object[capacity];
	}

	public void enqueue(E e) throws QueueOverflowException {
		if (size >= capacity) {
			throw new QueueOverflowException();
		} else {
			queue[rear++] = e;
			size++;
			if (rear == capacity) {
				rear = 0;
			}
		}
	}

	public E dequeue() throws EmptyQueueException {
		if (size <= 0) {
			throw new EmptyQueueException();
		} else {
			E e = queue[front++];
			size--;
			if (front == capacity) {
				front = 0;
			}
			return e;
		}
	}

	public E peek() throws EmptyQueueException {
		if (size <= 0) {
			throw new EmptyQueueException();
		} else {
			return queue[front];
		}
	}

	public int indexOf(E e) { // front 부터 index 0으로 취급
		for (int i = 0; i < size; i++) {
			if (queue[(front + i) % capacity].equals(e)) {
				return i;
			}
		}
		return -1;
	}

	public void clear() {
		size = front = rear = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size <= 0 ? true : false;
	}

	public boolean isFull() {
		return size >= capacity ? true : false;
	}

	public void dump() {
		System.out.print("[");
		for (int i = 0; i < size; i++) {
			if (i < size - 1) {
				System.out.print(queue[(front + i) % capacity] + ", ");
			} else {
				System.out.print(queue[(front + i) % capacity]);
			}
		}
		System.out.println("]");
	}
}

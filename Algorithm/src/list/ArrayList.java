package list;

public class ArrayList {
	private int size = 0;
	private Object[] elementData = new Object[64];

	public boolean addFirst(Object element) {
		add(0, element);
		return true;
	}

	public boolean addLast(Object element) {
		elementData[size] = element;
		size++;
		return true;
	}

	public boolean add(int index, Object element) {
		for (int i = size - 1; i >= index; i--) {
			elementData[i + 1] = elementData[i];
		}
		elementData[index] = element;
		size++;
		return true;
	}

	public Object remove(int index) {
		Object removed = elementData[index];
		for (int i = index; i < size; i++) {
			elementData[i] = elementData[i + 1];
		}
		size--;
		elementData[size] = null;
		return removed;
	}

	public Object get(int index) {
		return elementData[index];
	}

	public int size() {
		return size;
	}

	public int indexOf(Object o) {
		for (int i = 0; i < size; i++) {
			if (o.equals(elementData[i])) {
				return 1;
			}
		}
		return -1;
	}

	public Iterator iterator() {
		return new Iterator();
	}

	@Override
	public String toString() {
		String str = "[";
		for (Object element : elementData) {
			str += element + ",";
		}
		return str + "]";
	}

	protected class Iterator implements java.util.Iterator<Object> {
		private int index = 0;

		@Override
		public boolean hasNext() {
			return index < size;
		}

		@Override
		public Object next() {
			return elementData[index++];
		}

	}

}

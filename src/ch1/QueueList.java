package ch1;

import java.util.Arrays;

public class QueueList<T> {
	Object[] array;
	int rear;
	int front;
	int size;
	// _____________________________________________

	public QueueList(int size) {
		this.size = size;
		array = new Object[size];
		rear = -1;
		front = -1;
	}
	// _____________________________________________

	public void queue(Object newElement) {
		enchorCapacity(size+1);
		rear++;
		array[rear] = newElement;
		if (front == -1)
			front = 0;
	}
	// _____________________________________________

	public T deQueue() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return null;
		}
		T Obj = (T) array[front];
		front++;
		return Obj;
	}

	// _____________________________________________
	public boolean isEmpty() {
		if (front == -1 || front > rear) {
			return true;
		}
		return false;
	}

	public void enchorCapacity(int minCapacity) {
		int oldCapacity = array.length;
		if (minCapacity > oldCapacity) {
			int newCapacity = oldCapacity + 1;

			if (newCapacity < minCapacity) {
				newCapacity = minCapacity;
			}
			array = Arrays.copyOf(array, newCapacity);
		}
	}
}

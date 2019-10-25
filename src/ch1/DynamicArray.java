package ch1;

import java.util.Arrays;

public class DynamicArray<T> {
	Object [] data;
	int size;
	public DynamicArray() {
		this.size = 0;
		this.data = new Object[size];
	}
	public int getSize() {
		return data.length;
	}
	
	public T get(int index) {
		return (T)data[index];
	}
	public void put(T element) {
		ensureCapacity(size+1);
		data[size++] = element;
	}
	public void ensureCapacity(int minCapacity) {
		int oldCapacity = data.length;
		if(minCapacity > oldCapacity) {
			int newCapacity = oldCapacity*2;
			if(newCapacity < minCapacity) {
				newCapacity = minCapacity;
			}
			data = Arrays.copyOf(data, newCapacity);
		}
	}
}

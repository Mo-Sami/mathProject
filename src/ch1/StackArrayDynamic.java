package ch1;

import java.util.Arrays;

public class StackArrayDynamic<T> {
	 int size;
	 Object[] ArrayOfStack;
	 int top = 0;
	 
	 public StackArrayDynamic(int size) {
		 this.size = size;
		 ArrayOfStack = new Object[this.size];
	 }
	 
	 public void push(Object newElement) {
		 top++;
		 ensureCapacity(top);
		 ArrayOfStack[top-1] = newElement;
	 }
	 
	 public T pop() {
		 if(isEmpty()) {
			 return ((T)"the stack is empty");
			 }
		 T element =(T) ArrayOfStack[top-1];
		 top--;
		 return element;
	 }
	 
	 public Boolean isEmpty() {
		 return (top == 0);
	 }
	 
	 public void ensureCapacity(int minCapacity) {
			int oldCapacity = ArrayOfStack.length;
			if(minCapacity > oldCapacity) {
				int newCapacity = oldCapacity + 1;
				if(newCapacity < minCapacity) {
					newCapacity = minCapacity;
				}
				ArrayOfStack = Arrays.copyOf(ArrayOfStack, newCapacity);
			}
}
	 }

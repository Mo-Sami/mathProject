package ch1;

public class StackArray<T> {
	 int size;
	 Object[] ArrayOfStack;
	 int top = -1;
	 
	 public StackArray(int size) {
		 this.size = size;
		 ArrayOfStack = new Object[this.size];
	 }
	 
	 public void push(Object newElement) {
		 if(isFull()) { 
			 System.out.println("the stack is full");
			 return ;		 
		 }
		top++;
		ArrayOfStack[top] = newElement;
	 }
	 
	 public Boolean isFull() {
		 return (top == size-1);
	 }
	 
	 public T pop() {
		 if(isEmpty()) {
			 return ((T)"the stack is empty");
			 }
		 T element =(T) ArrayOfStack[top];
		 top--;
		 return element;
	 }
	 
	 public Boolean isEmpty() {
		 return (top == -1);
	 }
}

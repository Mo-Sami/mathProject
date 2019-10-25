package ch1;

public class StackArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//static stack array
		StackArray Stack = new StackArray(5);
		Stack.push(25);
		Stack.push(20);
		Stack.push(10);
		System.out.println("stack array static");
		System.out.println(Stack.pop());
		System.out.println(Stack.pop());
		System.out.println(Stack.pop());
		System.out.println(Stack.pop());
		// dynamic stack array
		
		StackArrayDynamic StackD = new StackArrayDynamic(5);
		StackD.push(25);
		System.out.println("top = " + StackD.top);
		StackD.push(20);
		StackD.push(10);
		StackD.push(20);
		StackD.push(10);StackD.push(20);
		StackD.push(10);
		System.out.println("stack array Dynamic");
		System.out.println("top = " + StackD.top);
		System.out.println(StackD.pop());
		System.out.println(StackD.pop());
		System.out.println("top = " + StackD.top);
		System.out.println(StackD.pop());
		
		System.out.println(StackD.pop());
		System.out.println("top = " + StackD.top);
	}

}

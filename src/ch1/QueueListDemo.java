package ch1;

public class QueueListDemo {
	
	public static void main(String[] args) {
		QueueList<Integer> list = new QueueList<Integer>(5);
		list.queue(1);
		list.queue(2);
		list.queue(3);
		list.queue(4);
		list.queue(5);
		list.queue(6);
		list.queue(7);

		System.out.println(list.deQueue());
		System.out.println(list.deQueue());
		System.out.println(list.deQueue());
		System.out.println(list.deQueue());
		System.out.println(list.deQueue());
		System.out.println(list.deQueue());
	}
}

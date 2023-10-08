package Todolist;

/*	To do list
 * By: Joaquim Rafael Mariano Prieto Pereira 
 */

public class Queue {
	
	private int first;
	private int count;
	private int last;
	
	private String queue[];
	
	private static final int max_size = 16;
	
	public Queue() {
		this(max_size);
	}
	
	public Queue(int size) {
		this.first = 0;
		this.count = 0;
		this.last = 0;
		
		this.queue = new String[size];
	}
	
	public boolean isEmpty() {
		if(count == 0) {return true;}
		else {return false;}
	}
	
	public void enqueue(String str) {
		
		if(count>=queue.length) {
			System.out.println("Queue full, impossible to add task");
		}else {
			queue[last] = str;
			last = (last + 1) % queue.length;
			count++;
		}
	}
	
	public String dequeue() {
		if(isEmpty()) {
			System.out.println("Empty queue, can't remove task"); return null;}
		else {
			String front = queue[first];
			queue[first] = null;
			first = (first + 1)% queue.length;
			--count;
			return front;
		}
	}
	
	public String front() {
		if(isEmpty()) {return null;}
		else{return queue[first];}
	}
	
	public boolean isFull() {
		if(count>=queue.length) {return true;}
		else {return false;}
	}
	
	public int size() {
		return queue.length;
	}
	
	public int count() {
		return count;
	}
	
	public void clear() {
		for(int i = 0; i< queue.length;i++){queue[i] = null;}
		first = 0;
		count = 0;
		last = 0;
	}


}

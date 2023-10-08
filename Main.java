package Todolist;

/*	To do list
 * By: Joaquim Rafael Mariano Prieto Pereira 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Queue tasks = new Queue(10);
		Scanner input = new Scanner(System.in);
		Scanner read = new Scanner(System.in);
		String current_task = "<none>";
		boolean cond = true;
		
		while(cond) {
			
			System.out.println();
			System.out.println("*** Task organizer ***");
			System.out.println("1 - Start next task");
			System.out.println("2 - Insert a task");
			System.out.println("3 - Verify next task todo");
			System.out.println("4 - Show how many tasks remaining");
			System.out.println("5 - Remove all tasks");
			System.out.println("6 - Leave");
			System.out.println("Current task: " + current_task);
			System.out.println();
			System.out.print("Choose an option: ");
			int choice = input.nextInt();
			
			switch (choice) {
			
				case 1:
					if(tasks.isEmpty()) {
					System.out.println("*** No tasks in the queue!!");}
					else { current_task = tasks.dequeue(); System.out.println("Starting..."); }
					continue;
				
				
				case 2:
					System.out.print(">>>Describe the next task TODO: ");
					String next_task = read.nextLine();
					tasks.enqueue(next_task);
					continue;
				
				case 3:
					System.out.println(">>> Next task in the queue: ");
					if(tasks.isEmpty()) {
						System.out.println("*** No tasks in the queue!!");}
					else {System.out.println(tasks.front());}
					continue;
				
				case 4:
					System.out.printf(">>> Todo tasks: %d", tasks.count());
					continue;
				
				case 5:
					tasks.clear();
					System.out.println(">>> Sucessfully removed every task in queue!");
					continue;
				
				case 6:
					System.out.println("END.");
					cond = false;
					continue;
				
				default:
				System.out.println("*** Invalid Option!");
			}
		}
	}
}

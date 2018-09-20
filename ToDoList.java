// ToDo List Main Function
import ToDo.*;
import java.util.Scanner;

public class ToDoList{
	public static void main(String[] args){
		char option = 'a';
		String todo = "";
		final int MAX_TODO_LIST = 10;
		
		Scanner inputDevice = new Scanner(System.in);
		//ToDo[] itemList = new ToDo[ToDo.count];
		ToDo[] itemList = new ToDo[MAX_TODO_LIST];
		while(true){
			
			//option = printMenu();
			System.out.println("**************************\n" + 
			"What do you want to do?\n" +
			"a) Show ToDo List\n" +
			"b) Add to ToDo List\n" +
			"c) Mark ToDo Item as done\n" +
			"d) Print count of ToDo\n" +
			"**************************\n");
			
			System.out.print("Choose an option: ");
			option = inputDevice.next().charAt(0);
			inputDevice.nextLine();
			
			if(option == 'a'){
				//for loop for print array
				for(int i = 0; i < ToDo.count; i++){
					System.out.println((i + 1) + " TODO: " + itemList[i].getToDo());
				}
			} else if (option == 'b'){
				System.out.print("Type the name of your Item: ");
				todo = inputDevice.nextLine();
				int count = ToDo.count;
				itemList[count] = new ToDo(todo);
				//itemList[count].addToDo(todo);
			} else if (option == 'c'){
				System.out.println("Which item do you want to mark as done: ");
				int c = inputDevice.nextInt();
				inputDevice.nextLine();
				itemList[(c - 1)].markDone();
			} else if (option == 'd'){
				System.out.println(" You have " + ToDo.count + " ToDo items.");
			} else {
				//bad option
			}
		}
		/*while (toDoInput != 'z'){
			
			//ToDo[] toDoList = new ToDo[ToDo.count];
			System.out.println("**************************\n" + 
			"What do you want to do?\n" +
			"a) Show ToDo List\n" +
			"b) Add to ToDo List\n" +
			"c) Mark ToDo Item as done\n" +
			"d) Print count of ToDo\n" +
			"z) Stop\n" +
			"**************************");
			option = toDoInput.next().charAt(0);
			
			switch(toDoInput){
				case 'a':
				case 'A':
				ToDo.printList();
				case 'b':
				case 'B':
				ToDo.addToDo();
				case 'c':
				case 'C':
				ToDo.markDone();
				case 'd':
				case 'D':
				System.out.println("# of items on toDo List: " + ToDo.count);
			}
		}*/
	}
	/*private static char printMenu(){
		Scanner iDevice = new Scanner(System.in);
		System.out.println("**************************\n" + 
			"What do you want to do?\n" +
			"a) Show ToDo List\n" +
			"b) Add to ToDo List\n" +
			"c) Mark ToDo Item as done\n" +
			"d) Print count of ToDo\n" +
			"**************************");
		option = inputDevice.next().charAt(0);
		inputDevice.nextLine();
		
		return i;
	}*/
}
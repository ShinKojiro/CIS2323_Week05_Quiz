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
		
		System.out.println("************************\n" + 
			"What do you want to do?\n" +
			"a) Show ToDo List\n" +
			"b) Add to ToDo List\n" +
			"c) Mark ToDo Item as done\n" +
			"d) Print count of ToDo\n" +
			"************************");
		option = inputDevice.next().charAt(0);
		inputDevice.nextLine();
		
		if(option == 'a'){
			//for loop for print aray
		} else if (option == 'b'){
			System.out.println("Type the name of your Item");
			todo = inputDevice.nextLine();
			itemList[ToDo.count] = new ToDo();
			itemList[ToDo.count].addToDo(todo);
		} else if (option == 'b'){
			
		} else if (option == 'c'){
			
		} else if (option == 'd'){
			System.out.println(" You have " + ToDo.count + " ToDo items.");
		} else {
			//bad option
		}
		
		/*while (toDoInput != 'z'){
			
			//ToDo[] toDoList = new ToDo[ToDo.count];
			System.out.println("************************\n" + 
			"What do you want to do?\n" +
			"a) Show ToDo List\n" +
			"b) Add to ToDo List\n" +
			"c) Mark ToDo Item as done\n" +
			"d) Print count of ToDo\n" +
			"z) Stop\n" +
			"************************");
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
}
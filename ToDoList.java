import java.util.Scanner;
public class ToDoList{
	public static void main(String[] args){
		char toDoInputChar;
		
		Scanner toDoInput = new Scanner(System.in);
		//ToDo[] toDoList = new ToDo[ToDo.count];
		while (toDoInput != 'z'){
			
			ToDo[] toDoList = new ToDo[ToDo.count];
			System.out.println("************************\n" + 
			"What do you want to do?\n" +
			"a) Show ToDo List\n" +
			"b) Add to ToDo List\n" +
			"c) Mark ToDo Item as done\n" +
			"d) Print count of ToDo\n" +
			"z) Stop\n" +
			"************************");
			toDoInput.next().charAt(0);
			
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
		}
	}
}
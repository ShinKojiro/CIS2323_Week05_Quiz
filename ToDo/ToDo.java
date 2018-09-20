// ToDo class Definition

package ToDo;

public class ToDo{
	public static int count = 0;
	private String toDoItem;
	private boolean isDone = false;
	
	
	public ToDo(String i){
		toDoItem = i;
		count++;
		//ToDo();
	}
	//public ToDo(){
	//	count++;
	//}
	public String getToDo(){
		return toDoItem;
	}
	public void markDone(){
		isDone = true;
	}
	public int getCount(){
		return count;
	}
	//public String printList(){
	//	return "A list of items";
	//}
}
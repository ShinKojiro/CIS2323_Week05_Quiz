public class ToDo{
	public static int count = 0;
	private String toDoItem;
	
	
	public void addToDo(String i, int td){
		toDoItem = i;
		count = td;
		count++;
	}
	public int getToDo(){
		return count;
	}
	public String getToDo(){
		
	}
	public void markDone(){
	
	}
	public void getCount(){
		
	}
	public String printList(){
		return "A list of items";
	}
}
package assignment_03;

import java.util.ArrayList;

public class ToDoList 
{
	public static void main(String[] args)
	{
		ArrayList<Task> toDoList = new ArrayList<Task>();
		Task mow = new Task("Mow Lawn", 3);
		Task trash = new Task("Take out the Trash", 2);
		Task feed = new Task("Feed the baby", 1);
	
		toDoList.add(mow);
		toDoList.add(trash);
		toDoList.add(feed);
		
		System.out.println("To-do list");
		for(int x = 0; x < toDoList.size(); x++)
		{
			System.out.println(toDoList.get(x).toString());
		}
		
		Task temp = new Task("Temp", 0);
		int tempPriority = 68;
		for(Task task: toDoList)
		{
			if(task.getPriority() < tempPriority)
			{
				tempPriority = task.getPriority();
				temp = task;
			}
		}
		System.out.println("Max priority: " + temp );
	 }
}

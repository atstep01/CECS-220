package assignment_03;

import java.util.ArrayList;

public class Course 
{
	private String name;
	private ArrayList<Student> students = new ArrayList<Student>();
	
	public Course(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String s)
	{
		this.name = s;
	}
	
	public void addStudent(Student s)
	{
		students.add(s);
	}
	
	public String roll()
	{
		String studentNames = "";
		for(int x = 0; x < students.size(); x++)
		{
			studentNames += students.get(x).getName() + " ";
		}
		return studentNames;
	}
	
	public double average()
	{
		double averages = 0.0;
		for(int x = 0; x < students.size(); x++)
		{
			averages += students.get(x).getAvg();
		}
		averages = averages/students.size();
		return averages;
	}
	
	public String toString()
	{
		return name + " Students Enrolled: " + students.size() + " " + roll() +" " + average();
	}
}

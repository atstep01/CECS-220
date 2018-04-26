package assignment_03;

public class TestCourse 
{
	public static void main(String[] args)
	{
		Course c =  new Course("CECS 6000");
		Student John = new Student(93.4,"John");
		Student Mary = new Student(73.5,"Mary");
		Student Jimmy = new Student(80.0,"Jimmy");
		
		c.addStudent(John);
		c.addStudent(Mary);
		c.addStudent(Jimmy);
		
		System.out.println("Class Roster: " + c.roll());
		System.out.println("Class Test Average: " + c.average());
		
		
	}
}

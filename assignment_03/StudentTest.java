package assignment_03;

public class StudentTest 
{
	public static void main(String[] args)
	{
		Student john = new Student(78.9, "john");
		
		System.out.println(john.getAvg());
		System.out.println(john.getName());
		john.setAvg(89.0);
		System.out.println(john.getAvg());
		john.setName("Chuck");
		System.out.println(john.getName());
		System.out.println(john.toString());
		
	}
}

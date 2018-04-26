package assignment_05;

public class SortingDriver 
{
	public static void main(String[] args)
	{
		Contact[] friends1 = new Contact[8];
		friends1[0] = new Contact("Tim", "Timmy", "012-758-9123");
		friends1[1] = new Contact("Chris", "Chrisman", "329-938-9875");
		friends1[2] = new Contact("Mark", "Two", "097-234-8754");
		friends1[3] = new Contact("Allison", "Grimes", "111-111-7373");
		friends1[4] = new Contact("Horatio", "John", "765-921-8346");
		friends1[5] = new Contact("Phil", "Phillips", "912-273-1234");
		friends1[6] = new Contact("Sarah", "Gilberts", "102-726-9283");
		friends1[7] = new Contact("Carol", "Whitman", "320-298-9283");
		DescendingSort.selectionSort(friends1);
		for (Contact friend : friends1)
			System.out.println(friend);
		System.out.println("\n\n\n");
		
		Contact[] friends2 = new Contact[8];
		friends2[0] = new Contact("Tim", "Timmy", "012-758-9123");
		friends2[1] = new Contact("Chris", "Chrisman", "329-938-9875");
		friends2[2] = new Contact("Mark", "Two", "097-234-8754");
		friends2[3] = new Contact("Allison", "Grimes", "111-111-7373");
		friends2[4] = new Contact("Horatio", "John", "765-921-8346");
		friends2[5] = new Contact("Phil", "Phillips", "912-273-1234");
		friends2[6] = new Contact("Sarah", "Gilberts", "102-726-9283");
		friends2[7] = new Contact("Carol", "Whitman", "320-298-9283");
		DescendingSort.insertionSort(friends2);
		for (Contact friend : friends2)
			System.out.println(friend);
	}
}

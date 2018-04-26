package assignment_04;

public class Hospital 
{
	public static void main(String[] args)
	{
		Doctor ted = new Doctor();
		Doctor tim = new Doctor("Here's a doctor's excuse for school.");
		Nurse sarah = new Nurse();
		Nurse carol = new Nurse("I need you to take your medicine.");
		Administrator john = new Administrator();
		Administrator joe = new Administrator("We have to make some price cuts!");
		Surgeon harold = new Surgeon();
		Surgeon thomas = new Surgeon("Don't cut that artery!");
		Receptionist hannah = new Receptionist();
		Receptionist sean = new Receptionist("I need you to sign in on this clipboard.");
		Janitor george = new Janitor();
		Janitor hayden = new Janitor("I cleaned the bathrooms as best as I could.");
		Mortician mort = new Mortician();
		Mortician dustin = new Mortician("This guy is actually still alive.");
		
		ted.seePatient();
		tim.seePatient();
		sarah.checkOnPatient();
		carol.checkOnPatient();
		john.manage();
		joe.manage();
		harold.performSurgery();
		thomas.performSurgery();
		hannah.checkIn();
		sean.checkIn();
		george.clean();
		hayden.clean();
		mort.autopsy();
		dustin.autopsy();
		
	}
	
}

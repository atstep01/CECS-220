package assignment_05;

@SuppressWarnings("serial")
public class StringTooLongException extends Exception
{
	public StringTooLongException(String message)
	{
		super(message);
	}
}

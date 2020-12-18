import java.util.Scanner;
public class UserRegistration {
	private static final String NamePattern = "^[A-Z][a-zA-Z]{2,}$";
	Scanner scanner = new Scanner(System.in);
	public void FirstnameValidator() 
	{
		System.out.println("Enter First Name");
		String input = scanner.next();
		if (input.matches(NamePattern)) {
			System.out.println("first name sucessfully entered");
		}
		else {
			System.out.println("**Invalid First name**try again**");
			FirstnameValidator();
		}
	}
	public void LastnameValidator() {
		System.out.println("Enter the last name:");
		String input = scanner.next();
		if (input.matches(NamePattern)) {
			System.out.println("last name sucessfully entered");
		}
		else {
			System.out.println("**Invalid last name**try again**");
			LastnameValidator();
		}
	}
	public static void main(String[] args) {
		System.out.println("Welcome to user registration");
		UserRegistration user = new UserRegistration();
		user.FirstnameValidator();
		user.LastnameValidator();
	}
}

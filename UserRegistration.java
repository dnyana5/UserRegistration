import java.util.Scanner;
public class UserRegistration {
	private static final String NamePattern = "^[A-Z][a-zA-Z]{2,}$";
	private static final String EmailPattern = "^[0-9a-zA-Z]+([.\\-+]?[a-zA-Z0-9]+)?\\@[0-9a-zA-Z]+.[a-zA-Z]{2,4}(.[a-zA-Z]{2,})*$";
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
	public void EmailValidator() {
		System.out.println("Enter the email id :");
		String input = scanner.next();
		if (input.matches(EmailPattern)) {
			System.out.println("email id sucessfully entered");
		}
		else {
			System.out.println("**Invalid email id**try again**");
			EmailValidator();
		}
	}
	public static void main(String[] args) {
		System.out.println("Welcome to user registration");
		UserRegistration user = new UserRegistration();
		user.FirstnameValidator();
		user.LastnameValidator();
		user.EmailValidator();
	}

}

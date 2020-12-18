import java.util.Scanner;
public class UserRegistration {
	private static final String NamePattern = "^[A-Z][a-zA-Z]{2,}$";
	private static final String EmailPattern = "^[0-9a-zA-Z]+([.\\-+]?[a-zA-Z0-9]+)?\\@[0-9a-zA-Z]+.[a-zA-Z]{2,4}(.[a-zA-Z]{2,})*$";
	private static final String PhonenumberPattern ="^([\\+]?91)?[6-9]{1}[0-9]{9}$";
	private static final String PasswordPattern ="^(?=.*[a-z])(?=.*[A-Z]).{8,}$"; 
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
	public void PhoneNumberValidator() {
		System.out.println("Enter the phone Number:");
		String input = scanner.next();
		if (input.matches(PhonenumberPattern)) {
			System.out.println("phone number sucessfully entered");
		}
		else {
			System.out.println("**Invalid phone number**try again**");
			PhoneNumberValidator();
		}
	}
	public void PasswordValidator() {
		System.out.println("Enter the password:");
		String input = scanner.next();
		if (input.matches(PasswordPattern)) {
			System.out.println("password sucessfully entered");
		}
		else {
			System.out.println("**Invalid password**try again**");
			PasswordValidator();
		}
	}
	public static void main(String[] args) {
		System.out.println("Welcome to user registration");
		UserRegistration user = new UserRegistration();
		user.FirstnameValidator();
		user.LastnameValidator();
		user.EmailValidator();
		user.PhoneNumberValidator();
		user.PasswordValidator();
	}

}

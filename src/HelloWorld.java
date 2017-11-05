import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.println("Hello ASE2017 - How are you? :)");
		Scanner scanner = new Scanner(System.in);
		System.out.println("What's your name?");
		String userName=scanner.nextLine();
		scanner.close();
		HelloUser helloUser = new HelloUser(userName);
		helloUser.greetUser();
		
	}

}

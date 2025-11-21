package Week12;
import java.util.Scanner;

class APerson {
	static Scanner userinput = new Scanner(System.in);
	String first_name;
	String last_name;
	String gender;
	int age;
	double weight;
	double height;
	String ethnic_group;
	String religion;
	
	public void greeting() {
		System.out.println("Hello there!");
	}
	public void prayer() {
		System.out.println("Heavenly Father, if it be Your will, use me to lead others to You.");
	}
	public void nap() {
		System.out.println("zzzzz");
	}
	public void eat() {
		System.out.println("Chomp! Chomp! Chomp!");
	}
	public String get_name() {
		String first = first_name;
		String last = last_name;
		String full_name = first + " " + last;
		return full_name;
	}
	public void set_religion() {
		System.out.println("Current religion: " + religion);
		System.out.print("Enter the religion to replace " + religion + ": ");
		religion = userinput.nextLine();
		System.out.println("Religion updated to " + religion);
	}
}

public class Person_Tasks_App {
	static Scanner userinput = new Scanner(System.in);
	
	public static void main(String[] args) {
		//create a new person
		APerson person1 = new APerson();
		//get information from the user
		System.out.println("Enter the requested information for a person.");
		System.out.print("First Name: ");
		person1.first_name = userinput.nextLine();
		System.out.print("Last Name: ");
		person1.last_name = userinput.nextLine();
		System.out.print("Gender: ");
		person1.gender =  userinput.nextLine();
		System.out.print("Age: ");
		person1.age =  userinput.nextInt();
		userinput.nextLine();
		System.out.print("Weight (lb): ");
		person1.weight =  userinput.nextDouble();
		userinput.nextLine();
		System.out.print("Height (in): ");
		person1.height =  userinput.nextDouble();
		userinput.nextLine();
		System.out.print("Ethnic Group: ");
		person1.ethnic_group = userinput.nextLine();
		System.out.print("Religion: ");
		person1.religion = userinput.nextLine();
		
		String answer = "0";
		while (!answer.equals("7")) {
			//display menu
			System.out.println("\n1. Say a greeting");
			System.out.println("2. Say a prayer");
			System.out.println("3. Take a nap");
			System.out.println("4. Eat something");
			System.out.println("5. Display name");
			System.out.println("6. Change religion");
			System.out.println("7. Quit\n");
			//get a choice from the user
			System.out.print("Enter a number from the list: ");
			answer = userinput.nextLine();
			//call the correct method
			if (answer.equals("1")) {person1.greeting();}
			if (answer.equals("2")) {person1.prayer();}
			if (answer.equals("3")) {person1.nap();}
			if (answer.equals("4")) {person1.eat();}
			if (answer.equals("5")) {System.out.println(person1.get_name());}
			if (answer.equals("6")) {person1.set_religion();}
		}
	}
}

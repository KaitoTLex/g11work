import java.util.Scanner;

public class ScannerPratice{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("What is your name? ");
		String name = input.nextLine();

		System.out.print("What is your age? ");
		int age = input.nextInt();

		System.out.print("Your name is " + name + " and your age is : " + age);

	}
}

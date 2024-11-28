import java.util.Scanner;

class progchal3{
	public static void main(String[] args){
		        Scanner pcker = new Scanner(System.in);
        System.out.println("Enter the number for the program you want to use: \n 1. Interger to Roman Numerals(1-10) \n 2. Magic Dates \n 3. Mass -> Weight");
        int sel = pcker.nextInt();
        switch(sel) {
            case 1:
                romanNumerals();
                break;
            case 2:
                magicDates(); 
                break;
            case 3:
                massWeight();
                break;
            default:
                System.err.println("null");
                break;
        }
        pcker.close();	
	}
	public static void romanNumerals(){
		System.out.println("Enter an number between 1 and 10");

		Scanner kbd = new Scanner(System.in);

		int num = kbd.nextInt();

		kbd.close();

		String roman;
		switch (num){
			case 1: roman = "I"; break;
			case 2: roman = "II"; break;
			case 3:roman = "III"; break;
			case 4: roman = "IV"; break;
			case 5: roman = "V"; break; 
			case 6:roman = "VI"; break; 
			case 7:roman = "VII"; break;	
			case 8:roman = "VIII"; break; 
			case 9:roman = "IX"; break; 
			case 10:roman = "X"; break;
			default:
				System.out.println("Error: Please enter a number between 1 and 10."); return; 
		}
		System.out.println("Here's " + num+  "in Roman Numerals:" + roman);
	}
	public static void magicDates(){	
		Scanner kbd = new Scanner(System.in);

		System.out.println("Enter the Month (Interger)");
		int month = kbd.nextInt();


		System.out.println("Enter the day");
		int day = kbd.nextInt();


		System.out.println("Enter the Last 2 digits of the Year");
		int year = kbd.nextInt();
			
		kbd.close();
		if(month*day == year){
			System.out.println("It's a Magical Year!");
		}
		else{
			System.out.println("It's not a Magical year :(");
			return;
		}
	}
	public static void massWeight(){
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter the mass of a given object you want to calculate to Newtons");
		double mass = kbd.nextDouble();
		double weight = mass * 9.8;
		System.out.printf("Your object's weight in Newton is " + weight + " Newtons \n");
		if(weight > (double)1000){
			System.out.println("The Object is too heavy");
		}
		else if(weight < (double)1000){
			System.out.println("The object is too light");
		}
	}
}

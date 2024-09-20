import java.util.Scanner;

class Chapter2Challanges{
    
    public static void main (String[] args){
        Scanner pcker = new Scanner(System.in);
        System.out.println("Enter the number for the program you want to use: \n 1. Cookie Calories \n 2. Miles-per-Gallon \n 3. String Manipulator");
        int sel = pcker.nextInt();
        switch(sel) {
            case 1:
                ccc();
                break;
            case 2:
                mpg(); 
                break;
            case 3:
                smp();
                break;
            default:
                System.err.println("null");
                break;
        }
        pcker.close();
    }

    private static void ccc(){//Cookie Calorie Calculator
        Scanner AmtCookie = new Scanner(System.in);
        int cookie = 40;
        float calories = (float)300/4;
        if(cookie > 0){
            System.out.println("Enter amount of cookies eaten:");
            int withdrawedAmount = AmtCookie.nextInt();
            int calcCal = (int)((withdrawedAmount * calories) + 0.5);
            cookie = cookie - withdrawedAmount;
            System.out.println("Your total amount of Calories: " + calcCal); 
        }
        else {
            System.err.println("null");
        }
        AmtCookie.close();
    }

    private static void mpg(){//Miles Per Gallon Calculator
        Scanner prompt = new Scanner(System.in);
        double Miles, Gallons;
        System.out.println("Enter the amount of Miles driven:");
        Miles = prompt.nextDouble();
        System.out.println("Enter the amount of Gallons of gas used:");
        Gallons = prompt.nextDouble();
        double calc = Miles/Gallons;
        System.out.println("Your MPG is: " + calc);
        prompt.close();
    }
    private static void smp(){//String manipulator Program
        Scanner location = new Scanner(System.in);
        System.out.println("Enter a City Name");
        String city = location.nextLine();
        location.close();
        System.out.println("The Length of your city name is: " + city.length());
        System.out.println("Your City in all Upper Case: " + city.toUpperCase());
        System.out.println("Your City in all Lower Case: " + city.toLowerCase());
        System.out.println("The first letter of your city is: " + city.charAt(0));
    }
}
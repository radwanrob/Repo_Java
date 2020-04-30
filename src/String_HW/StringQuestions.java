package String_HW;

public class StringQuestions {

    public static void main(String[] args) {


        String name = "April 26th Homework";
        System.out.println("Message is: " + name);

        System.out.println("Hello Ahsan!");

        // A) Storing Data

        // 1. Number of Hours in a Day
        byte hoursInDay = 24;
        System.out.println("There are " + hoursInDay + " hours in a day.");

        // 2. Number of Max No. of Days in a Year
        short daysInYear = 366;
        System.out.println("Maximum Days in a Year: " + daysInYear);

        // 3. Total Number of Employees in an Organisation
        int employeesAtWalmart = 2200000;
        System.out.println("There are: " + employeesAtWalmart + " employees at Walmart");

        // 4. Population in a Country
        long populationOfEgypt = 98420000;
        System.out.println("The population of Egypt is: " + populationOfEgypt);

        // 5. Interest Rate
        float interestRate = 0.06f;
        System.out.println("Bank of America Platinum Savings Interest Rate: " + interestRate);

        // 6. Balance in a Bank Account
        double bankBalance = 7654.32;
        System.out.println("My Current Balance is: " + bankBalance);

        // 7. Does the Sun Rise From the West?
        boolean sunRiseInWest = false;
        System.out.println("Does the sun rise from the west? " + sunRiseInWest);

        // 8. Initials of Your Name
        char initial = 'R';
        System.out.println("Initial: " + initial);

        // 9. Your Name
        String fullName = "Radwan Hasan Rob";
        System.out.println("My full name is: " + fullName);


        // B) Temperature Conversions

        // Celsius to Fahrenheit
        double tempC = 25;
        double tempCToF = (9.0/5.0) * tempC + 32;
        System.out.println("25 degrees Celsius is: " + tempCToF + " degrees Fahrenheit.");

        // Kelvin to Fahrenheit
        double tempK = 300;
        double tempKToF = (9.0/5.0) * (tempK - 273) + 32;
        System.out.println("50 degrees Kelvin is " + tempKToF + " degrees Fahrenheit.");

        //Celsius to Kelvin - using previous value for tempC
        double tempCToK = tempC + 273;
        System.out.println("25 Degrees Celsius is " + tempCToK + " degrees Kelvin.");

        // Kelvin to Celsius - using previous value for tempK
        double tempKToC = tempK - 273;
        System.out.println("300 Degrees Kelvin is " + tempKToC + " degrees Celsius.");

        // Fahrenheit to Kelvin
        double tempF = 65;
        double tempFtoK = (5.0/9) * (tempF - 32) + 273;
        System.out.println("65 Degrees Fahrenheit is " + tempFtoK + " degrees in Kelvin.");
    }
}

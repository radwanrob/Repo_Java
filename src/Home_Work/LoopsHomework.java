package Home_Work;

public class LoopsHomework {

    public static void main(String[] args) {

        System.out.println("Hi Ahsan!");

        // 1. Radwan's SAT Grade Checker 1600

        double maxScore = 1600.00;
        int studentScore = 1450;

        double gradePercent = (studentScore / maxScore) * 100;

        if (gradePercent >= 91) {
            System.out.println("Your percentage: " + gradePercent + " & your grade is: A");

        } else if (gradePercent >= 81 && gradePercent < 91) {
            System.out.println("Your percentage: " + gradePercent + " & your grade is: B");

        } else if (gradePercent >= 71 && gradePercent < 81) {
            System.out.println("Your percentage: " + gradePercent + " & your grade is: C");

        } else if (gradePercent >= 61 && gradePercent < 71) {
            System.out.println("Your percentage: " + gradePercent + " & your grade is: D");

        } else if (gradePercent >= 51 && gradePercent < 61) {
            System.out.println("Your percentage: " + gradePercent + " & your grade is: E");

        } else if (gradePercent <= 50) {
            System.out.println("Your percentage: " + gradePercent + " & your grade is: F");
        }


        // 2. Car Gear & Message

        char carGear = 'P';
        String message = "";
        String driveType = "Snow";

        if (carGear == 'P') {
            message = "You can Park Car";

        } else if (carGear == 'D')  {

            if (driveType == "Snow") {
                message = "You are on Snow Mode";

            } else if (driveType == "Sport") {
                message = "You are on Sport Mode";

            } else if (driveType == "Eco") {
                message = "You are on Eco Mode";
            } else {
                message = "Please select a mode: Snow, Sport or Eco";
            }
        } else if (carGear == 'N') {
            message = "Put car in Car Wash";

        } else if (carGear == 'R') {
            message = "Reverse the car";

        } else {
            message = "Invalid Response";
        }

        System.out.println(message);


        // 3. Divide By 3 and/or 5

        int num = 32;
        int x = 3;
        int y = 5;

        int dThree = num % x;
        int dFive = num % y;

        if (dThree == 0 && dFive != 0) {
            System.out.println("Divisible by 3");

        } else if (dFive == 0 && dThree != 0) {
            System.out.println("Divisible by 5");

        } else if (dThree == 0 && dFive == 0) {
            System.out.println("Divisible by both");

        } else {
            System.out.println(num + " is not divisible by '5' or '3'");
        }


    }
}

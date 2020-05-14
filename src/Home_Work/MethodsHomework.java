package Home_Work;

public class MethodsHomework {

    public static void main(String[] args) {

        // 1. Having trouble linking "name to search", to main method
        String[] names = {"john", "michael", "dora", "philip", "ilena", "palena", "fahry"};
        String nameToSearch = "dora";
        int position = locate(names);
        System.out.println("1. " + nameToSearch + " is in the position: " + position); //attempt 1
        String positionOne = locateOne(nameToSearch);
        System.out.println("1. " + nameToSearch + " is in the position: " + positionOne); //attempt 2

        // 2. Average of Values in Array
        int[] numbers = {96,99,100,125,195};
        double numbersTotal = average(numbers);
        System.out.println("2. Average if the given array: " + numbersTotal);

        // 3. Maximum Value in Array
        int[] integers = {45, 22, 11, 65, 189, 91, 100, 81};
        int maximumValue = maximum(integers);
        System.out.println("3. The maximum value in the array is: " + maximumValue);

        // 4.
        int[] scores = {90, 89, 191, 100, 81};
        String[] testTakers = {"Happy", "Peace", "Jesse", "Kaitlin", "Lucky"};
        int highestGrade = grades(scores);
        if (highestGrade == 90) {
            System.out.println("4. Happy scored the maximum score " + "(" + highestGrade + ")");
        } else if (highestGrade==89) {
            System.out.println("4. Peace scored the maximum score " + "(" + highestGrade + ")");
        } else if (highestGrade==191) {
            System.out.println("4. Jesse scored the maximum score " + "(" + highestGrade + ")");
        } else if (highestGrade==100) {
            System.out.println("4. Kaitlin scored the maximum score " + "(" + highestGrade + ")");
        } else if (highestGrade==81) {
            System.out.println("4. Lucky scored the maximum score " + "(" + highestGrade + ")");
        }


    }

    public static int locate(String[] names) {
        String nameToSearch = "dora";
        int students =0;
        for (int i = 0; i < names.length; i++) {
            if(names[i].equals(nameToSearch)){
                return i +1;
            }
        }
        return -1;
    }

    public static String locateOne(String names) {
        String nameToSearch = "";
        if (nameToSearch == "john") {
            return "John is in position: 1";
        } else if (nameToSearch == "michael") {
            return "Michael is in position: 2";
        } else if (nameToSearch == "dora") {
            return "Dora is in position: 3";
        } else if (nameToSearch == "philip") {
            return "Philip is in the position: 4";
        } else if (nameToSearch == "ilena") {
            return "Ilena is in the position: 5";
        } else if (nameToSearch == "palena") {
            return "Palena is in the position: 6";
        } else if (nameToSearch == "fahry") {
            return nameToSearch;
        } else {
            return "Name not in Array";
        }
    }


    public static double average(int[] numbers) {
        int sum = 0;
        double average;

        for(int i=0; i < numbers.length; i++){
            sum = sum + numbers[i];
        }
        average = (double)sum/numbers.length;
        return average;
    }


    public static int maximum(int [] integers) {
        int max = 0;

        for(int i=0; i<integers.length; i++ ) {
            if(integers[i]>max) {
                max = integers[i];
            }
        }
        return max;
    }



    public static int grades (int[] scores) {
        int mark = 0;

        for(int i=0; i<scores.length; i++ ) {
            if(scores[i]>mark) {
                mark = scores[i];
            }
        }
        return mark;


    }


}
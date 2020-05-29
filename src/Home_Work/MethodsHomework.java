package Home_Work;

public class MethodsHomework {

    public static void main(String[] args) {

        /**
         * Question 1:
         * Create a method to return an array after remove a specific value from a given int array.
         * Original array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}    Remove: 24
         * Returned array: {32, 14, 98, 56, 148, 78}
         *
         * Input array:     {1, 2, 4, 3, 1, 6, 1}    Remove: 3
         * Returned Array:  {1, 2, 4, 3, 1, 6, 1}
         *
         */



        // 2. Average of Values in Array
        int[] numbers = {96,99,100,125,195};
        double numbersTotal = average(numbers);
        System.out.println("2. Average if the given array: " + numbersTotal);

        // 3. Maximum Value in Array
        int[] integers = {45, 22, 11, 65, 189, 91, 100, 81};
        int maximumValue = maximum(integers);
        System.out.println("3. The maximum value in the array is: " + maximumValue);

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


    }



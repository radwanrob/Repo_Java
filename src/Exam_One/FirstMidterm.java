package Exam_One;

import java.awt.*;
import java.util.Arrays;

public class FirstMidterm {

    public static void main(String[] args) {

        //Question 1
        int[] setOfNumbers = {1, 2, 4, 3, 1, 6, 1};
        int remove = 3;
        int[] removingNumber = removeInt(setOfNumbers, remove);
        System.out.println("New Array: " + Arrays.toString(removingNumber));

        //Question 2
        int[] setOfIntegers = {1, 3, 5, 4, 2, 7};
        int arraySize = setOfIntegers.length;
        int missing = findMissingPositive(setOfIntegers, arraySize);
        System.out.println("The smallest positive missing number is " + missing);

        //Question 3
        double userSpeed = 78;
        double speedLimit = 70;
        double mileGap = 5;
        double points = 0;

        if (userSpeed <= speedLimit) {
            System.out.println("userspeed = " + userSpeed + "; Thank you for driving within the speed limit.");

        } else {

            points = Math.floor((userSpeed - speedLimit) / mileGap);

            if (points >= 12) {
                System.out.println("User speed = " + userSpeed + " ; " + points + " points (License suspended).");
            } else {
                System.out.println("user speed = " + userSpeed + " ; " + points + " points");
            }
        }
    }

    public static int[] removeInt(int [] setOfNumbers, int remove) {
        int removeTotal = 0;
        for(int i = 0; i < setOfNumbers.length; i++){
            if (setOfNumbers[i] == remove)
                removeTotal++;
        }
        int newSize = setOfNumbers.length - removeTotal;
        int [] newArray = new int[newSize];

        int index = 0;
        for (int j = 0; j < setOfNumbers.length; j++) {
            if (setOfNumbers[j] != remove) {
                newArray[index] = setOfNumbers[j];
                index++;}
        }
        return newArray;
    }

    public static int findMissingPositive(int[] setOfIntegers, int size) {
        int i;
        for (i = 0; i < size; i++) {
            int x = Math.abs(setOfIntegers[i]);
            if (x - 1 < size && setOfIntegers[x - 1] > 0)
                setOfIntegers[x - 1] = -setOfIntegers[x - 1];
        }
        for (i = 0; i < size; i++)
            if (setOfIntegers[i] > 0)
                return i + 1;

        return size + 1;
    }
}
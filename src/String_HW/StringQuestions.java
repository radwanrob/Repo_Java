package String_HW;

public class StringQuestions {

    public static void main(String[] args) {

        System.out.println("Hi Ahsan");

        //Storing First Name in Variable
        String R = "Radwan";
        System.out.println(R);

        // 1. Displaying length of the first name.
        int lengthOfName = R.length();
        System.out.println("Length of My Name is: " + lengthOfName + " letters.");

        // 2. Does your name start with K? (Considering cases)
        boolean startsWithK = R.startsWith("K");
        System.out.println("Does my name start with a capital K? " + startsWithK);

        // 3. First alphabet of your name
        char charAtIndex0 = R.charAt(0);
        System.out.println("The first letter of my name is: " + charAtIndex0);

        // 4. Does your name end with "M"? (Ignoring cases)
        boolean endWithLetterM = R.endsWith("M") || R.endsWith("m");
        System.out.println("Does my name end with a M or m? " + endWithLetterM);



        // String Statement
        String mySentence = "I am a good programmer";

        // 1. Fetch last word of sentence
        String lastWord = mySentence.substring(mySentence.lastIndexOf(" ") + 1);
        System.out.println("The last word of the sentence is: " + lastWord);

        // 2. Display the total number of words in mySentence
        String words[] = mySentence.split(" ");
        System.out.println("The total number of words in my sentence is: " + words.length);

        // 3. Replace all the 'r' characters with 'f' characters
        String replaceRWithF = mySentence.replaceAll("r", "f");
        System.out.println("If I replace all 'r's with 'f' it would be: " + replaceRWithF);


        // Store first name in String Variable
        String rad = "Radwan";

        // Calculate the length of your name w/o using length() method
        int letterCount = rad.lastIndexOf("");
        System.out.println("Amount of letters in my name: " + letterCount);

    }
}

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class FirstExercise {
    //The goal for this exercise is to get familiar with Maven, adding dependencies to your project, and using those dependencies.
    //
    //1. Create a new Maven project named codeup-exercises.
    //
    //2. Add the Apache Commons Lang library to your project This is a utility library for many
    // different things; we will use it specifically for String manipulations, which is available
    // through the StringUtils class.
    //
    //3. Create a new class with a main method that prompts the user for input and does the following (using the Stringutils class)
    //
    // A.Tells whether or not what the user entered is a number
    // B. Flips the case of the string
    // C.Reverses the string
    // D.Example Console Output
    //
    //
    //Enter Something: Life, The Universe, and Everything
    //You Entered: "Life, The Universe, and Everything"
    //"Life, The Universe, and Everything" is not a number
    //Flipped Case: lIFE, tHE uNIVERSE, AND eVERYTHING
    //Reversed: gnihtyrevE dna ,esrevinU eht ,efiL

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter a sentence:\n");
        String userInput = input.nextLine();

        //A
        boolean isNumber = StringUtils.isNumeric(userInput);
        System.out.println("Is the user's input a number?\n" + isNumber);

        //B

        String changeCase = StringUtils.swapCase(userInput);
        System.out.println("Swapping the cases of the user input looks like this: " + changeCase);


        //C
        String reverse = StringUtils.reverse(userInput);
        System.out.println("The user's input in reverse is: " + reverse);




                //public static void main(String[] args) {
        //        Joiner joiner = Joiner.on("-").skipNulls();
        //        System.out.println(joiner.join("annette","nichole","iglesias"));
        //    }





    }


}

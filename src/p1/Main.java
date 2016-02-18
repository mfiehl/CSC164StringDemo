package p1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String sentence;

        do {

            System.out.printf("Enter a sentence: ");
            sentence = input.nextLine();
            System.out.println(sentence);

            String[] tokens = sentence.split(" +");

            for(String each : tokens)
            {
                System.out.println(each);
            }

            System.out.println("Number of tokens = " + tokens.length);

            System.out.println(isChar1capitalized(sentence) ? "Starts with a cap" : "Does not start with a cap");
            System.out.println(isPunctuation(sentence) ? "Ends with punctuation" : "Does not end with punctuation");

        }while(!sentence.equals(""));
    }

    static boolean isChar1capitalized(String arg)
    {
        return Character.isUpperCase(arg.charAt(0));
    }

    static boolean isPunctuation(String arg)
    {
       return arg.matches(".*[.!?]");
    }
}



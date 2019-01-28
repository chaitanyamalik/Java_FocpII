import java.util.*;
public class Q5 {

  public static void main(String[] args)
    {
        Scanner inputVal = new Scanner(System.in);
        System.out.print("Enter alphabet: ");
        String input = inputVal.next();

        boolean ucase = input.charAt(0) >= 65 && input.charAt(0) <= 90;    
        boolean lcase = input.charAt(0) >= 97 && input.charAt(0) <= 122;    
        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u") || input.equals("A") || input.equals("E") || input.equals("I") || input.equals("O") || input.equals("U");

        if (input.length() > 1)
        {
            System.out.println("Input is not a single character.");
        }
        else if (!(ucase || lcase))
        {
            System.out.println("Input is not a letter.");
        }
        else if (vowels)
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
}
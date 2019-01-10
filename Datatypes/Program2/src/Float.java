import java.util.*;
public class Float {

    
  public static void main(String[] args)
    {
        Scanner inputNum = new Scanner(System.in);

        System.out.print("Input a number: ");
        double x = inputNum.nextDouble();
        System.out.print("Input another number: ");
        double y = inputNum.nextDouble();

        x = Math.round(x * 1000);
        x = x / 1000;
        y = Math.round(y * 1000);
        y = y / 1000;

        if (x == y)
        {
            System.out.println("They are the same up to three decimal places");
        }
        else
        {
            System.out.println("They aren't the same");
        }
    }
}
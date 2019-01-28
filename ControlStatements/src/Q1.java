import java.util.*;
		 
public class Q1
{
    public static void main(String args[])
    {
       int num1, num2;
       double result;
       Scanner inputNum = new Scanner(System.in);
	     System.out.print("Enter Two Numbers : ");
       num1 = inputNum.nextInt();
       num2 = inputNum.nextInt();
	     result = num1 + num2;
       System.out.println("Add = " +result);
	     result = num1 - num2;
       System.out.println("Subtract = " +result);
	     result = num1 * num2;
       System.out.println("Multiply = " +result);
	     result = num1 / num2;
       System.out.println("Divide = " +result);
    }
}
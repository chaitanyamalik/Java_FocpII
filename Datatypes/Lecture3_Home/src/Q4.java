import java.util.*;
public class Q4 {
    public static void main (String[] args) { 
        Scanner inputNum = new Scanner (System.in);
        int i; 			
        int num;
        int fact = 1;			
        double x;		
        double sum = 1;	  
        System.out.println("1+x+x^2/2!+x^3/3!+...+x^n/n!");
        System.out.println("Enter the value for x :");
        x = inputNum.nextDouble();
        System.out.println("Enter the number of terms:");
        num = inputNum.nextInt();
        for (i=1; i<=num; i++){
            fact = fact*i;
			sum = sum + Math.pow(x,i)/fact;
        }
        System.out.println("Answer = " + sum);
    }
}
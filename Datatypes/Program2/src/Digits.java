import java.util.*;
 
public class Digits {
    public static void main (String [] args) {
         
        Scanner inputValue = new Scanner(System.in);
         
        int num; 
        int digit1; 
        int digit2; 
        int digit3; 
        int digit4; 
        int digit5;
        char ch; 
        do{
        System.out.print ("Enter a number consisting of five digits ");
        num = inputValue.nextInt();
        if(num >= 10000 && num <= 99999){
            digit5 = num % 10;
            digit4 = (num % 100)/10;
            digit3 = (num % 1000)/100;
            digit2 = (num % 10000)/1000;
            digit1 = num / 10000;
         System.out.println(digit1+"   "+digit2+"   "+digit3+"   "+digit4+"   "+digit5);
        }
        else{
            System.out.println("Number entered doesn't contain 5 digits....");
        }
        System.out.println("Press N to try again..");
        System.out.println("Press any other key to exit..");
        ch = inputValue.next().charAt(0);
    }while(ch == 'N');
    }
}         
                

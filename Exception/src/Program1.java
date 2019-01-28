import java.lang.*;
import java.util.*;
class Program1{
	static void setPercent(int pct){
		if(pct<0 || pct>100){
			throw new IllegalArgumentException("Illegal Argument");
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("1.ArithmeticException\n2.ArrayIndexOutOfBoundsException\n3.NumberFormatException\n4.NullPointerException\n5.IllegalArgumentException");
		int menu = in.nextInt();
		if(menu == 1){
			try{
         		int num1=30, num2=0;
         		int output=num1/num2;
         		System.out.println ("Result: "+output);
      		}
      		catch(ArithmeticException e){
         		System.out.println ("You Shouldn't divide a number by zero");
      		}
		}
		if(menu == 2){
			try{
        		int a[]=new int[10];
        		//Array has only 10 elements
        		a[11] = 9;
      		}
      		catch(ArrayIndexOutOfBoundsException e){
         		System.out.println("ArrayIndexOutOfBounds");
      		}
		}
		if(menu == 3){
			try{
	 			int num=Integer.parseInt ("XYZ") ;
	 			System.out.println(num);
      		}
      		catch(NumberFormatException e){
	  			System.out.println("Number format exception occurred");
       		}
		}
		if(menu == 4){
			try{
				String str=null;
				System.out.println (str.length());
			}
        	catch(NullPointerException e){
				System.out.println("NullPointerException..");
			}
		}
		if(menu == 5){
			try {
          	setPercent(101);
      }
      catch(IllegalArgumentException e){
           System.out.println("Illegal Argument");
      }
		}
	}
}
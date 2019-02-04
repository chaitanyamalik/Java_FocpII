import java.lang.*;
import java.util.*;
class CheckArgumentException extends Exception{
	CheckArgumentException(String m){
		super(m);
	}
}
class Program5{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum;
		char ch;
		boolean flag = false;
		do{
			try{
				if(args.length < 5){
					throw new CheckArgumentException("Numbers entered less than 5");
				}
				sum = 0;
				for(int i = 0; i < args.length; i++){
					int num = Integer.parseInt(args[i]);
						sum = sum + num;
				}
				flag = true;
				System.out.println(sum);
			}
			catch(CheckArgumentException e){
				System.out.println(e.getMessage());
			}
			catch(Exception e){
				
			}
	    	System.out.print("Press n to exit or any key to retry");
	    	ch = in.next().charAt(0);
		}while(ch != 'n');	
	}
}
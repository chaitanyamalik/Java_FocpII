import java.util.*;
class Q1{
	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.print("Enter rows:- ");
			int rows = in.nextInt();
			System.out.print("Enter columns:- ");
			int columns = in.nextInt();
			int[][] array = new int[rows][columns];
			int num;
			int num2;
			System.out.println("Enter 2 digit number only.");
			//Enter Array
			for(int i = 0; i<rows; i++){
			    for(int j = 0; j<columns; j++){
			    	System.out.print("Enter Element for Row "+(i+1)+" and Column "+(j+1)+":- ");
			        num = in.nextInt();
			        if(num >= 10 || num <= 99){
			        	array[i][j] = num;
			        }
			        else{
			        	System.out.print("Invalid. Please Re-enter :- ");
			        	j--;
			        }
			    }
			}
			System.out.println("Original Array :-");
			//Display Array
			for(int i = 0; i<rows; i++)
			{
			    for(int j = 0; j<columns; j++)
			    {
			        System.out.print(array[i][j]+"\t");
			    }
			    System.out.println();
			}
			System.out.println("Updated Array :-");
			//Display Updated Array
			for(int i = 0; i<rows; i++)
			{
			    for(int j = 0; j<columns; j++)
			    {
			    	if(array[i][j]%2 == 0){
			    		num2 = array[i][j];
			    	}
			    	else{
			    		num2 = array[i][j]*2;
			    	}
			        System.out.print(num2+"\t");
			    }
			    System.out.println();
			}
	}	
}
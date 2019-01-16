import java.util.*;
class DistanceTest{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the value in feet:- ");
		double feet = in.nextDouble();
		System.out.print("Enter another value in inch:- ");
		double inch = in.nextDouble();

		Distance d1 = new Distance(feet,inch);
		System.out.println("You've entered the value "+d1.getFeet()+" feet and "+d1.getInch()+" inches.");
		
		Distance d2 = new Distance();
		d2 = d1.sum(d1);
	}
}
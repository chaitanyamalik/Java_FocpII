import java.util.*;
public class Quadratic {
    

    public static void main(String[] args) {
        Scanner cofEnter = new Scanner(System.in);

        double a = cofEnter.nextDouble();
        double b = cofEnter.nextDouble();
        double c = cofEnter.nextDouble();
        double root1, root2;
        double determinant = b * b - 4 * a * c;

        // condition for real and different roots
        if(determinant > 0) {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);

            System.out.println("Roots are :- "+root1+" "+root2);
        }
        // Condition for real and equal roots
        else if(determinant == 0) {
            root1 = root2 = -b / (2 * a);

            System.out.println("Roots are :- "+root1);
        }
        // If roots are not real
        else {
            double realPart = -b / (2 *a);
            double imaginaryPart = Math.sqrt(-determinant) / (2 * a);

            System.out.println("Roots are Imaginary");
        }
    }
}
import java.util.*;
class VehicleTest{
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		Vehicle v1 = new Vehicle();
		Car c1 = new Car();
		Bike b1 = new Bike();
		System.out.print("Enter the number of wheels :- ");
		int n = num.nextInt();
		switch(n){
			case 2 : b1.displayBike();
			break;
			case 4 : c1.displayCar();
			break;
			default : v1.displayVehicle();
			break;
		} 
	}
}
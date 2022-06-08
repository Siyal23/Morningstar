package classWork.program3;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vehicle vObj;
		ArrayList<Vehicle> vehicleArr=new ArrayList<Vehicle>();
		for(int i=0;i<2;i++) {
			
			System.out.println("Enter regno:");
			long regNo=sc.nextInt();
			System.out.println("Enter brand name:");
			String brand=sc.nextLine();
			
			System.out.println("Enter vehicle price:");
			float price=sc.nextFloat();
			System.out.println(brand);
			System.out.println("Enter mileage:");
			float mileage=sc.nextFloat();
			vObj=new Vehicle(regNo,brand,price,mileage);
			vehicleArr.add(vObj);
		}
		for (Vehicle vehicle : vehicleArr) {
			System.out.println(vehicle.getBrand());
		}
	}
}

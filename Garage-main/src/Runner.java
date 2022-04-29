package oop.garage;

public class Runner {

	public static void main(String[] args) {
		GarageStored garagestored = new GarageStored();

		garagestored.addVehicle(new Racecar("Blue", 20_000, 2, 79));

		garagestored.addVehicle(new Fireengine("Red", 99_999, 37, 5));

		garagestored.addVehicle(new Bus("White", 1_000_000, 34, 2));

		garagestored.printVehicles();

		System.out.println(garagestored.calcBill());

		garagestored.removeVehicleById(2);

		garagestored.printVehicles();

		garagestored.removeByType("car");

		garagestored.printVehicles();
	}
}

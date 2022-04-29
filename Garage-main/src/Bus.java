package oop.garage;

public class Bus extends Vehicle {

	private int capacity;

	public Bus(String colour, int mileage, int age, int capacity) {
		super(colour, mileage, age);
		this.setCapacity(capacity);
	}

	@Override
	public String toString() {
		return "Bus [capacity=" + capacity + ", getId()=" + getId() + ", getColour()=" + getColour()
				+ ", getMileage()=" + getMileage() + ", getAge()=" + getAge() + "]";
	}

	@Override
	public float calcBill() {
		return 600 / capacity * 20;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int Capacity) {
		this.Capacity = capacity;
	}

}

package oop.garage;

public class Racecar extends Vehicle {

	private int maxspeed;

	public Racecar(String colour, int mileage, int age, int maxspeed) {
		super(colour, mileage, age);
		this.setMaxspeed(maxspeed));
	}

	@Override
	public float calcBill() {
		return maxspeed * 1000;
	}

	@Override
	public String toString() {
		return "Racecar [maxspeed=" + maxspeed + ", id=" + getId() + ", colour=" + getColour() + ", mileage="
				+ getMileage() + ", age=" + getAge() + "]";
	}

	public int getMaxspeed() {
		return maxspeed;
	}

	public void setMaxSpeed(int Maxspeed) {
		this.maxspeed = maxspeed;
	}

}

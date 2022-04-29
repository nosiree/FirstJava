package oop.garage;

public class Fireengine extends Vehicle {

	private int hoses;

	public Fireengine(String colour, int mileage, int age, int hoses) {
		super(colour, mileage, age);
		this.setHoses(hoses);
	}

	@Override
	public String toString() {
		return "FireengineTank [hoses=" + hoses + ", getId()=" + getId() + ", getColour()=" + getColour() + ", getMileage()="
				+ getMileage() + ", getAge()=" + getAge() + "]";
	}

	@Override
	public float calcBill() {
		return hoses * 250;
	}

	public int getHoses() {
		return hoses;
	}

	public void setHoses(int hoses) {
		this.hoses = hoses;
	}

}

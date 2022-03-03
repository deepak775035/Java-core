package ride_share;

public class Vehicle {
	String ownerName;
	String carName;
	String numberPlate;
	
	

	public Vehicle(String ownerName, String carName, String numberPlate) {
		super();
		this.ownerName = ownerName;
		this.carName = carName;
		this.numberPlate = numberPlate;
	}



	@Override
	public String toString() {
		return "Vehicle [ownerName=" + ownerName + ", carName=" + carName + ", numberPlate=" + numberPlate + "]";
	}
	
	
}

package ride_share;

public class Onboard {
	
	
	// static methods just for matching SRS Doc function naming
	public static User add_user(String name,char gender,int age) {
		
		return new User(name, gender, age);
	}
	
	public static Vehicle add_vehicle(String ownerName, String vehicleName, String numberPlate) {
		return new Vehicle(ownerName, vehicleName, numberPlate);
	}
	
}

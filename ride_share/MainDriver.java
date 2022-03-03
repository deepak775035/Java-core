package ride_share;

import java.util.ArrayList;

public class MainDriver {

	public static void main(String[] args) {
		
		
		ArrayList<User> users = new ArrayList<>();
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		
		users.add(Onboard.add_user("Rohan", 'M', 36));
		vehicles.add(Onboard.add_vehicle("Rohan", "Swift", "KA-01-12345"));
		
		users.add(Onboard.add_user("Shashank", 'M', 29));
		vehicles.add(Onboard.add_vehicle("Shashank", "Baleno", "TS-05-62395"));
		
		users.add(Onboard.add_user("Nandini", 'F', 29));
		
		users.add(Onboard.add_user("Shipra", 'F', 27));
		vehicles.add(Onboard.add_vehicle("Shipra", "Polo", "KA-05-41491"));
		vehicles.add(Onboard.add_vehicle("Shipra", "Activa", "KA-12-12332"));
		
		users.add(Onboard.add_user("Gaurav", 'M', 29));
		
		users.add(Onboard.add_user("Rahul", 'M', 35));
		vehicles.add(Onboard.add_vehicle("Rahul", "XUV", "KA-05-1234"));
		
		
		//////////////////////////////
		
		RideManager rideManager = new RideManager(users, vehicles);
		
		
		
		try {
			rideManager.offer_ride("Rohan", "Hyderabad", 1 , "Swift", "KA-01-12345", "Bangalore");
		} catch (IllegalArgumentException e) {
			System.out.println("error Handled " + e);
		}
		
		try {
			rideManager.offer_ride("Shipra", "Bangalore", 1 , "Activa", "KA-12-12332", "Mysore");
		} catch (IllegalArgumentException e) {
			System.out.println("error Handled " + e);
		}
		
		try {
			rideManager.offer_ride("Shipra", "Bangalore", 2 , "Polo", "KA-05-41491", "Mysore");
		} catch (IllegalArgumentException e) {
			System.out.println("error Handled " + e);
		}
		
		try {
			rideManager.offer_ride("Shashank", "Hyderabad", 2 , "Baleno", "TS-05-62395", "Bangalore");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		//this will throw an error because below car is used above.
		try {
			rideManager.offer_ride("Rohan", "Bangalore", 1 , "Swift", "KA-01-12345", "Pune");
		} catch (IllegalArgumentException e) {
			System.out.println("error Handled " + e);
		}
		
		
		
		//Uncomment to see internal details before matching passengers with offered rides
//		rideManager.testpool();
//		System.out.println("\n\n");
		
		
		rideManager.select_ride("Nandini", "Bangalore", "Mysore", 1, "Most Vacant");
		
		rideManager.select_ride("Gaurav", "Bangalore", "Mysore", 1, "Activa");
		
		rideManager.select_ride("Shashank", "Mumbai", "Bangalore", 1, "Most Vacant");
		
		rideManager.select_ride("Rohan", "Hyderabad", "Bangalore", 1, "Baleno");
		
		
		
		//Uncomment to see internal details after matching rides
//		rideManager.testpool();
		
//		System.out.println("\n\n");
//		for(User temp: users)
//			System.out.println(temp);
		
		System.out.println("\n");
		rideManager.print_ride_stats();
		
		
	}

}




















package ride_share;

import java.util.ArrayList;

public class RideManager {
	
	ArrayList<OfferRideDetails> offeredRidePool = new ArrayList<>();
	ArrayList<User> users;
	ArrayList<Vehicle> vehicles;
	
	
	
	public RideManager(ArrayList<User> users, ArrayList<Vehicle> vehicles) {
		super();
		this.users = users;
		this.vehicles = vehicles;
	}



	void offer_ride(String ownerName, String origin, int availableSeats, String carName, String numberPlate, String destination) throws IllegalArgumentException {
		
		
		for (OfferRideDetails rideDetails : offeredRidePool) {
			if(rideDetails.vehicle.numberPlate.equals(numberPlate)) {
				throw new IllegalArgumentException("Vehical already in USE");
			}
		}
		
		
		User tempUser=null;
		Vehicle tempVehicle=null;
		
		for (User user : users) {
			if(user.name.equals(ownerName)) {
				tempUser=user;
				break;
			}
		}
		
		for (Vehicle vehicle : vehicles) {
			if(vehicle.numberPlate.equals(numberPlate)) {
				tempVehicle=vehicle;
				break;
			}
		}
		
		offeredRidePool.add(new OfferRideDetails(tempUser, origin, availableSeats, tempVehicle, destination));
		tempUser.rideOfferedCount++;
	}
	
	
	
	void select_ride(String passengerName, String origin,String destination,int seatsNeeded, String selection_strategy) {

		User currentUser = null;
		for(User temp:users)
			if(temp.name.equals(passengerName))currentUser=temp;
		
		ArrayList<OfferRideDetails> possibleRideMatch = new ArrayList<>();
		for (OfferRideDetails rideDetails : offeredRidePool) {
			if(rideDetails.origin.equals(origin) && rideDetails.destination.equals(destination) && rideDetails.availableSeats>=seatsNeeded) {
				possibleRideMatch.add(rideDetails);
			}
		}
		
		
		//Applying selection strategy
		OfferRideDetails bestMatch=null;
		if(selection_strategy.equals("Most Vacant")) {
			
			for (OfferRideDetails temp : possibleRideMatch) {
				if(bestMatch==null) bestMatch=temp;
				else if(bestMatch.availableSeats<temp.availableSeats) bestMatch=temp;
			}
		
		} else {
			
			for (OfferRideDetails temp : possibleRideMatch) {
				if(temp.vehicle.carName.equals(selection_strategy))bestMatch=temp;
			}
		}
		
		if(bestMatch==null) {
			System.out.println("no Route found");
		} else {
			bestMatch.availableSeats-=seatsNeeded;
			currentUser.rideTakenCount++;
		}
	}
	
	
	void print_ride_stats() {
		for(User user : users) {
			System.out.println(user.name+": "+user.rideTakenCount+" Taken, "+user.rideOfferedCount+" Offered");
		}
	}
	
	
	
	//For testing purpose
	void testpool() {
		for (OfferRideDetails rideDetails : offeredRidePool) {
			System.out.println(rideDetails);
		}
	}
	
	
	
	
}

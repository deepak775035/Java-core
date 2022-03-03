package ride_share;

public class OfferRideDetails {
	
	User user;
	String origin;
	int availableSeats;
	Vehicle vehicle;
	String destination;
	public OfferRideDetails(User user, String origin, int availableSeats, Vehicle vehicle, String destination) {
		super();
		this.user = user;
		this.origin = origin;
		this.availableSeats = availableSeats;
		this.vehicle = vehicle;
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "OfferRideDetails [" + user + ", origin=" + origin + ", availableSeats=" + availableSeats
				+ "," + vehicle + ", destination=" + destination + "]";
	}
	
	
	
}

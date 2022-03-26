package classFolder.session13.cmdargs;


class AirTicket{
    String passenger;
    String source;
    String destination;
    public AirTicket(String passenger, String source, String destination) {
        this.passenger = passenger;
        this.source = source;
        this.destination = destination;
    }
    public String getPassenger() {
        return passenger;
    }
    public void setPassenger(String passenger) {
        this.passenger = passenger;
    }
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    @Override
    public String toString() {
        return "AirTicket [destination=" + destination + ", passenger=" + passenger + ", source=" + source + "]";
    }

    
}


public class PassengerOnboarding {
    public static void main(String[] args) {
        String dateOfJourney = args[0];
        AirTicket airTicket = new AirTicket("June", "DEL", "BLR");
        System.out.println("Date OfJourney :"+ dateOfJourney + " " + airTicket);
    }
}

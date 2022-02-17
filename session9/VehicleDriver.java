package session9;

abstract class Vehicle {

  abstract void drive();

  abstract void steeringMechanism();

  void start() {
    System.out.println("Vehicle Started");
  }

  void stop() {
    System.out.println("Vehicle Stopped");
  }
}

class Car extends Vehicle {

  @Override
  void drive() {
    System.out.println("Driving a Car");
  }

  @Override
  void steeringMechanism() {
    System.out.println("A steering wheel is used to steer the car");
  }
}

class Bike extends Vehicle {

  @Override
  void drive() {
    System.out.println("Riding a Bike");
  }

  @Override
  void steeringMechanism() {
    System.out.println("Bike handle is used to steer the bike");
  }
}

public class VehicleDriver {

  public static void main(String[] args) {
   
    Vehicle myVehicle = new Car();

    myVehicle.start();
    myVehicle.drive();
    myVehicle.steeringMechanism();
    myVehicle.stop();
    System.out.println("\nChanging myVehicle\n");

    myVehicle = new Bike();
    myVehicle.start();
    myVehicle.drive();
    myVehicle.steeringMechanism();
    myVehicle.stop();
  }
}

package ride_share;

public class User {
	
	String name;
	char gender;
	int age;
	
	int rideTakenCount;
	int rideOfferedCount;
	
	

	public User(String name, char gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}



	@Override
	public String toString() {
		return "User [name=" + name + ", gender=" + gender + ", age=" + age + ", rideTaken=" + rideTakenCount
				+ ", rideOffered=" + rideOfferedCount + "]";
	}
		
	

}

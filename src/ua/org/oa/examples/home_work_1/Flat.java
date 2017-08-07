package ua.org.oa.examples.home_work_1;

public class Flat {

	private String flatName;
	private double squareSqM;
	private int roomCount;
	private int distanceFromSubway;
	private boolean elevatorAvailability;
	private String districtName;
	private double priceForSqM;

	final double PROPERTY_TAX = 0.15;

	public String getFlatName() {
		return flatName;
	}

	public void setFlatName(String newFlatName) {
		flatName = newFlatName;
	}

	public double getSquareSqM() {
		return squareSqM;
	}

	public void setSquareSqM(double newSquareSqM) {
		squareSqM = newSquareSqM;
	}

	public int getRoomCount() {
		return roomCount;
	}

	public void setRoomCount(int newRoomCount) {
		roomCount = newRoomCount;
	}

	public int getDistanceFromSubway() {
		return distanceFromSubway;
	}

	public void setDistanceFromSubway(int newDistanceFromSubway) {
		distanceFromSubway = newDistanceFromSubway;
	}

	public boolean getElevatorAvailability() {
		return elevatorAvailability;
	}

	public void setElevatorAvailability(boolean newElevatorAvailability) {
		elevatorAvailability = newElevatorAvailability;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String newDistrictName) {
		districtName = newDistrictName;
	}

	public double getPriceForSqM() {
		return priceForSqM;
	}

	public void setPriceForSqM(double newPriceForSqM) {
		priceForSqM = newPriceForSqM;
	}

	public void displayFlatInformation() {
		System.out.println("Flat name: " + flatName);
		System.out.println("Flat square: " + squareSqM + " sq.m");
		System.out.println("Number of room: " + roomCount);
		System.out
				.println("Distance from subway: " + distanceFromSubway + " m");
		System.out.println("District name: " + districtName);
		System.out.println("Price excluding taxes: " + priceForSqM + " $");
		System.out.println("Final price: " + finalPriceCalculation() + " $");

		if (elevatorAvailability)
			System.out.println("An elevator in the house?: Yes ");
		else
			System.out.println("An elevator in the house?: No ");

		System.out
				.println("--------------------------------------------------------");

	}

	private double finalPriceCalculation() {
		return priceForSqM * squareSqM + priceForSqM * squareSqM * PROPERTY_TAX;
	}

}

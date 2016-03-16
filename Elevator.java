import java.util.*;

public class Elevator {

	private static final int defaultHowManyFloors = 15;
	private static final int elevatorCapacity = 12;

	private int elevatorFloor; // current floor of the elevator
	private int howManyFloors; // number of floors in the building
	private int howManyPeopleMax; // maximum number of people in simulation
	private int direction; // direction of the elevator
	private ArrayList floors;

	public Elevator() {
		// initialize elevator
		howManyFloors = defaultHowManyFloors;
		howManyPeopleMax = elevatorCapacity;
		floors = new ArrayList();
		for (int i = 0; i <= howManyFloors; i++) { // make ArrayLists for each floor to count total passenger number
			floors.add(new ArrayList());
		}
		elevatorFloor = 1; // start elevator at floor 1
	}

	/** get the current floor that the elevator is on */
	public int getCurrentFloor() {
		return elevatorFloor;
	}

	/** get the highest floor number */
	public int getMaxFloor() {
		return howManyFloors;
	}

	/** get the lowest floor number */
	public int getMinFloor() {
		return 1;
	}

	/** take the elevator to the specified floor */
	public void moveToFloor(int f) {
		if (f > howManyFloors) {
			f = howManyFloors;
		}
		if (f <= 0) {
			f = 1;
		}

		if (f == elevatorFloor) {
			System.out.println("Enter the elevator");
		} else if (f > elevatorFloor) {
			direction = 1;
			for (int floor = elevatorFloor; floor <= f; floor++)
				System.out.println(floor);
		} else {
			direction = -1;
			for (int floor = elevatorFloor; floor >= f; floor--)
				System.out.println(floor);
		}
	}

}
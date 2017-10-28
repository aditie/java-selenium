package java.sel.corejava.datast;

import java.util.LinkedList;
import java.util.Queue;

public class Elevator {
	/*
	 * Elevator class has 
	 * currentFloor int
	 * queue of floors to goto
	 * Methods:
	 * gotoFloor(int floor)
	 * callElevator(int callfloor)
	 * internal method returnToBase()
	 * 
	 * 
	 */
	
	private int currentFloor;
	private Queue<Integer> floorQueue=new LinkedList<Integer>();
	private static final int BASEFLOOR=0;
	private static final int MAXFLOOR=10;
	
	/*everytime user requests an elevator
	 * first callElevator() is called for the elevator to go to the User
	 * then gotoFloor() handles the actual request of the elevator going to destination floor
	 */
	public void gotoFloor(int floor){
		
		if (floorQueue.isEmpty()) {
			floorQueue.add(floor);
		}
		if (!floorQueue.isEmpty() && floorQueue.contains(floor)) {
			floorQueue.remove();
			System.out.println("Come to floor : "+floor);
			currentFloor=floor;
		}
	}
	
	public void callElevator(int callfloor){
		System.out.println("Going to the User who called @Floor : "+callfloor);
		gotoFloor(callfloor);
		
	}
	
	private void returnToBase(){
		System.out.println("Returning to Base ");
		currentFloor=0;
		
	}
	
	
	
}


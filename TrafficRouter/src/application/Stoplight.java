package application;

import java.util.Arrays;

public class Stoplight {
	
	private String id;
	// green, yellow, or red
	private String status;
	// time for each color in sections
	// [0] -> green
	// [1] -> yellow
	// [2] -> red
	private int[] timer;
	private String direction;
	
	public Stoplight(String id, int[] timer, String direction){
		this.id = id;
		this.status = "Green";
		this.timer = timer;
		this.direction = direction;
	}
	
	public String getId() {
		return id;
	}

	public String getDirection() {
		return direction;
	}
		
	public String getStatus() {
		return status;
	}

	public int[] getTimer() {
		return timer;
	}

	@Override
	public String toString() {
		return "Stoplight [direction=" + direction + ", id=" + id + ", status=" + status + ", timer="
				+ Arrays.toString(timer) + "]";
	}
	
	public void setStatus(String status){
		this.status = status;
	}
	
	public void setTimer(int[] timer){
		this.timer = timer;
	}
}
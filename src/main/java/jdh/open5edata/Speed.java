package jdh.open5edata;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the types of speed a creature may have
 */
public class Speed{

	@JsonProperty("walk")
	private int walk;

	public void setWalk(int walk){
		this.walk = walk;
	}

	public int getWalk(){
		return walk;
	}

	@JsonProperty("fly")
	private int fly;

	public void setFly(int fly){
		this.fly = fly;
	}

	public int getFly(){
		return fly;
	}

	@JsonProperty("swim")
	private int swim;

	public void setSwim(int swim){
		this.swim = swim;
	}

	public int getSwim(){
		return swim;
	}

	@JsonProperty("climb")
	private int climb;

	public void setClimb(int climb){
		this.climb = climb;
	}

	public int getClimb(){
		return climb;
	}

	@JsonProperty("burrow")
	private int burrow;

	public void setBurrow(int burrow){
		this.burrow = burrow;
	}

	public int getBurrow(){
		return burrow;
	}

	@JsonProperty("hover")
	private boolean hover = false;

	public void setHover(boolean hover){
		this.hover = hover;
	}

	public boolean getHover(){
		return hover;
	}

	@Override
	public String toString() {
		String returnedString = "";

		if (walk != 0) {
			returnedString = returnedString + "Walk: " + walk + " ";
		}
		if (fly != 0) {
			returnedString = returnedString + "Fly: " + fly + " ";
		}
		if (swim != 0) {
			returnedString = returnedString + "Swim: " + swim + " ";;
		}
		if (climb != 0) {
			returnedString = returnedString + "Climb: " + climb + " ";;
		}
		if (burrow != 0) {
			returnedString = returnedString + "Burrow: " + burrow + " ";;
		}
		if (hover = true) {
			returnedString = returnedString + "Hover: Yes";
		}

		return returnedString;
	}
}
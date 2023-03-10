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
	private int hover;

	public void setHover(int hover){
		this.hover = hover;
	}

	public int getHover(){
		return hover;
	}

	@Override
	public String toString() {
		return "Speed{" +
				"walk=" + walk +
				", fly=" + fly +
				", swim=" + swim +
				", climb=" + climb +
				", burrow=" + burrow +
				", hover=" + hover +
				'}';
	}
}
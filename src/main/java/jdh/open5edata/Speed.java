package jdh.open5edata;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Speed{

	@JsonProperty("walk")
	private int walk;

	public void setWalk(int walk){
		this.walk = walk;
	}

	public int getWalk(){
		return walk;
	}

	@Override
 	public String toString(){
		return 
			"Speed{" + 
			"walk = '" + walk + '\'' + 
			"}";
		}
}
package jdh.open5edata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the skills a monster may have
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Skills{

	@JsonProperty("stealth")
	private int stealth;

	public void setStealth(int stealth){
		this.stealth = stealth;
	}

	public int getStealth(){
		return stealth;
	}

	@Override
 	public String toString(){
		return 
			"Skills{" + 
			"}";
		}
}
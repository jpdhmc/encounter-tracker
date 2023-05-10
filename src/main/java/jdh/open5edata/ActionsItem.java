package jdh.open5edata;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ActionsItem{

	@JsonProperty("attack_bonus")
	private int attackBonus;

	@JsonProperty("damage_dice")
	private String damageDice;

	@JsonProperty("name")
	private String name;

	@JsonProperty("damage_bonus")
	private int damageBonus;

	@JsonProperty("desc")
	private String desc;

	public void setAttackBonus(int attackBonus){
		this.attackBonus = attackBonus;
	}

	public int getAttackBonus(){
		return attackBonus;
	}

	public void setDamageDice(String damageDice){
		this.damageDice = damageDice;
	}

	public String getDamageDice(){
		return damageDice;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setDamageBonus(int damageBonus){
		this.damageBonus = damageBonus;
	}

	public int getDamageBonus(){
		return damageBonus;
	}

	public void setDesc(String desc){
		this.desc = desc;
	}

	public String getDesc(){
		return desc;
	}

	public String getString() {
		String returnedString = name + ": " + desc + " ";
		return returnedString;
	}

	@Override
 	public String toString(){
		return name + " " + desc + " ";
		}
}
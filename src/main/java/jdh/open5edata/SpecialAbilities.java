package jdh.open5edata;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SpecialAbilities {
    @JsonProperty("name")
    private String name;

    @JsonProperty("desc")
    private String desc;

    @JsonProperty("attack_bonus")
    private String attack_bonus;

    @JsonProperty("damage_dice")
    private String damage_dice;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setDesc(String desc){
        this.desc = desc;
    }

    public String getDesc(){
        return desc;
    }

    public String getAttack_bonus() {
        return attack_bonus;
    }

    public void setAttack_bonus(String attack_bonus) {
        this.attack_bonus = attack_bonus;
    }

    public String getDamage_dice() {
        return damage_dice;
    }

    public void setDamage_dice(String damage_dice) {
        this.damage_dice = damage_dice;
    }


    @Override
    public String toString() {
        return "SpecialAbilities{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", attack_bonus='" + attack_bonus + '\'' +
                ", damage_dice='" + damage_dice + '\'' +
                '}';
    }
}

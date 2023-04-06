package jdh.open5edata;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LegendaryActions {
    @JsonProperty("name")
    private String name;

    @JsonProperty("desc")
    private String desc;

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

    @Override
    public String toString(){
        return
                "LegendaryActions{" +
                        ",name = '" + name + '\'' +
                        ",desc = '" + desc + '\'' +
                        "}";
    }
}

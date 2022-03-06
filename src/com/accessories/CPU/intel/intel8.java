package com.accessories.CPU.intel;

public class intel8 extends mainIntel{


    public intel8(){
        super(4,"intel8",3,4500);
    }
    public int getWeight(){
        return weight;
    }
    public String getName(){
        return name;
    }
    public int getAmountOfCore(){
        return amountOfCore;
    }

    public int getCost(){
        return cost;
    }
}

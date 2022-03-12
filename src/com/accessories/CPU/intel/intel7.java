package com.accessories.CPU.intel;

import com.accessories.CPU.mainCPU;

public class intel7 extends mainCPU {

    public intel7(){
        super(4,"intel7",3,3500);
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

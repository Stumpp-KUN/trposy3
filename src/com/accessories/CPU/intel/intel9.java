package com.accessories.CPU.intel;

import com.accessories.CPU.mainCPU;

public class intel9 extends mainCPU {

    public intel9(){
        super(4,"intel9",4,7000);
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

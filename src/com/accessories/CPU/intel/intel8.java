package com.accessories.CPU.intel;

import com.accessories.CPU.mainCPU;

public class intel8 extends mainCPU {


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

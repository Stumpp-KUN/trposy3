package com.accessories.CPU.amd;

import com.accessories.CPU.mainCPU;

public class ryzenPro2000 extends mainCPU {

    public ryzenPro2000() {
        super(3,"ryzenPro2000",3,3500);
    }

    public int getCost(){
        return cost;
    }

    public String getName(){
        return name;
    }

    public int getAmountOfCore(){
        return amountOfCore;
    }

    public int getWeight(){
        return weight;
    }
}

package com.accessories.CPU.amd;

import com.accessories.CPU.mainCPU;

public class ryzenPro1000 extends mainCPU {

    public ryzenPro1000() {
        super(3,"ryzenPro1000",2,2000);
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

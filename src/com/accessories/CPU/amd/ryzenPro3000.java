package com.accessories.CPU.amd;

public class ryzenPro3000 extends mainAMD{



    public ryzenPro3000() {
        super(2,"ryzenPro3000",4,5000);
    }

    public int getCost(){
        return cost;
    }
    public String getName(){
        return name;
    }
    public int getWeight(){
        return weight;
    }
    public int getAmountOfCore(){
        return amountOfCore;
    }

}

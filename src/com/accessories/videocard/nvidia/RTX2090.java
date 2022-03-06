package com.accessories.videocard.nvidia;

public class RTX2090 extends mainVideocard{
    public RTX2090(){
        super(4,"RTX2090",7000,12);
    }
    public int getFillRate(){
        return fillRate;
    }
    public String getName(){
        return name;
    }
    public int getAmountOfMemory(){
        return amountOfMemory;
    }

    public int getCost(){
        return cost;
    }
}

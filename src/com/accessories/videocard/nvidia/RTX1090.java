package com.accessories.videocard.nvidia;

public class RTX1090 extends mainVideocard{
    public RTX1090(){
        super(3,"RTX1090",5000,9);
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

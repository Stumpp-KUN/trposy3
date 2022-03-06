package com.accessories.videocard.nvidia;

public class RTX3090 extends mainVideocard{


    public RTX3090(){
        super(5,"RTX3090",9000,16);
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

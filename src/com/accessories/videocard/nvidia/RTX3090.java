package com.accessories.videocard.nvidia;

import com.accessories.videocard.mainVideo;

public class RTX3090 extends mainVideo {


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

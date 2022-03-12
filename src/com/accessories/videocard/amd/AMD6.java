package com.accessories.videocard.amd;

import com.accessories.videocard.mainVideo;

public class AMD6 extends mainVideo {

    AMD6(int fillRate, String name, int cost, int amountOfMemory) {
        super(fillRate, name, cost, amountOfMemory);
    }

    public AMD6(){super(4,"AMD6",4000,8);}
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

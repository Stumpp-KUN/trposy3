package com.accessories.videocard.nvidia;

public class mainVideocard {
    int fillRate;
    String name;
    int cost;
    int amountOfMemory;

    mainVideocard(int fillRate,String name,int cost,int amountOfMemory){
        this.amountOfMemory=amountOfMemory;
        this.cost=cost;
        this.name=name;
        this.fillRate=fillRate;
    }
}

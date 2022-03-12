package com.accessories.memory.hyperx.model5;

import com.accessories.memory.hyperx.mainMemory;

public class hx2500 extends mainMemory {
    public hx2500(){
        super(5,20,2500,"hx2500");
    }
    public int getFillRate(){
        return fillRate;
    }
    public int getMemory(){
        return memory;
    }
    public int getCost(){return cost;}
    public String getName(){return name;}
}

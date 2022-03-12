package com.accessories.memory.hyperx.modelTEN;

import com.accessories.memory.hyperx.mainMemory;

public class hv6300 extends mainMemory {
    public hv6300(){
        super(10,64,4000,"hv6300");
    }
    public int getFillRate(){
        return fillRate;
    }
    public int getMemory(){
        return memory;
    }
    public int getCost(){
        return cost;
    }
    public String getName(){
        return name;
    }
}

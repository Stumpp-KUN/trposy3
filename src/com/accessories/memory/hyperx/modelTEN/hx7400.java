package com.accessories.memory.hyperx.modelTEN;

import com.accessories.memory.hyperx.mainMemory;

public class hx7400 extends mainMemory {
    public hx7400(){
        super(5,10,5400,"hx7400");
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

package com.accessories.memory.hyperx.model5;

import com.accessories.memory.hyperx.mainMemory;

public class hx1000 extends mainMemory {
    public hx1000(){
        super(6,32,2000,"hx1000");
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

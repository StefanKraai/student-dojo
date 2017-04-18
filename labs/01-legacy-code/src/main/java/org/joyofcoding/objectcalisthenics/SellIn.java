package org.joyofcoding.objectcalisthenics;

/**
 * Created by Stefan on 27-3-2017.
 */
public class SellIn {
    private int sellIn;
    public SellIn(int sellIn){
        this.sellIn = sellIn;
    }

    public int getSellIn(){
        return sellIn;
    }

    public void increase(){
        sellIn++;
    }

    public void decrease(){
        sellIn--;
    }
}

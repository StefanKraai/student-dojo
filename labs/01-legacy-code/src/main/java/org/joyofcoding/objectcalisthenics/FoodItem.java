package org.joyofcoding.objectcalisthenics;

/**
 * Created by Stefan on 27-3-2017.
 */
public class FoodItem implements Item {
    private Name name;
    private SellIn sellIn;
    private Quality quality;

    public FoodItem(Name name, SellIn sellIn, Quality quality) {
        this.name = name;
        this.quality = quality;
        this.sellIn = sellIn;
    }

    @Override
    public void updateQuality() {
        if (quality.getQuality() < 50) {
            quality.increase();
        }

        sellIn.decrease();

        if (sellIn.getSellIn() < 0 && quality.getQuality() < 50) {
            quality.increase();
        }
    }

    @Override
    public String getName() {
        return name.getName();
    }

    @Override
    public int getQuality() {
        return quality.getQuality();
    }

    @Override
    public int getSellIn() {
        return sellIn.getSellIn();
    }
}

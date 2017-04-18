package org.joyofcoding.objectcalisthenics;

/**
 * Created by Stefan on 27-3-2017.
 */
public class WeaponItem implements Item {
    private Name name;
    private SellIn sellIn;
    private Quality quality;

    public WeaponItem(Name name, SellIn sellIn, Quality quality) {
        this.name = name;
        this.quality = quality;
        this.sellIn = sellIn;
    }

    @Override
    public void updateQuality() {
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

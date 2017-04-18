package org.joyofcoding.objectcalisthenics;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {
    public static void main(String[] args) {
        GildedRose gildedRose = new GildedRose();
        gildedRose.updateItemsQuality(gildedRose.makeItems());
    }

    public List<Item> makeItems() {
        List<Item> items = new ArrayList<Item>();
        items.add(new VestItem(new Name("+5 Dexterity Vest"), new SellIn(10), new Quality(20)));
        items.add(new FoodItem(new Name("Aged Brie"),new SellIn(2), new Quality(0)));
        items.add(new ElixerItem(new Name("Elixir of the Mongoose"), new SellIn(5), new Quality(7)));
        items.add(new WeaponItem(new Name("Sulfuras, Hand of Ragnaros"), new SellIn(0), new Quality(80)));
        items.add(new PassItem(new Name("Backstage passes to a TAFKAL80ETC concert"), new SellIn(15), new Quality(20)));
        items.add(new CakeItem(new Name("Conjured Mana Cake"), new SellIn(3), new Quality(6)));
        return items;
    }

    public void updateItemsQuality(List<Item> items) {
        for (Item item : items) {
            item.updateQuality();
        }
    }
}
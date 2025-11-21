package com.gildedrose;

public class GenericItem extends Item {

    public GenericItem(String name, Integer quality, Integer sellIn) {
        super(name, quality, sellIn);
    }

    @Override
    public void update() {
        this.sellIn--;
        this.quality--;

        if (this.sellIn < 0)
            this.quality--;

        this.limitQuality(0, 50);
    }
}
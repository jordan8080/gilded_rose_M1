package com.gildedrose;

public class AgedItem extends Item {

    public AgedItem(String name, Integer quality, Integer sellIn) {
        super(name, quality, sellIn);
    }

    @Override
    public void update() {
        this.sellIn--;
        this.quality++;

        this.limitQuality(0, 50);
    }
}

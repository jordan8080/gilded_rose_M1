package com.gildedrose;

public abstract class Item {
    public String name;
    public Integer quality;
    public Integer sellIn;

    public Item(String name, Integer quality, Integer sellIn) {
        this.name = name;
        this.quality = quality;
        this.sellIn = sellIn;
    }

    public abstract void update();

    
    protected void limitQuality(Integer min, Integer max) {
        if (this.quality < min)
            this.quality = min;

        if (this.quality > max)
            this.quality = max;
    }
}

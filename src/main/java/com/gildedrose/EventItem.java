package com.gildedrose;

public class EventItem extends Item {
    
    public EventItem(String name, Integer quality, Integer sellIn) {
        super(name, quality, sellIn);
    }

    @Override
    public void update() {
        this.sellIn--;
        this.quality++;

        if (this.sellIn <= 10)
            this.quality++;
        if (this.sellIn <= 5)
            this.quality++;
        if (this.sellIn <= 0)
            this.quality = 0;
        
        this.limitQuality(0, 50);
    }
}

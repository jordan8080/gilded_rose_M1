package com.gildedrose;

/* Dans une troisième étape, nous allons appliquer le polymorphisme
 * pour ne plus utiliser un switch */

public class Shop {
    public Item[] items;

    public Shop(Item[] items) {
        this.items = items;
    }
    
    public void updateQuality() {


        for (Item item : items)
            item.update();

        /* Le switch disparaît et l'update se fera tout simplement en
         * passant les bonnes classes dans la liste d'Items, par
         * exemple:
         * 
         * Shop shop = new Shop(new Item[] {
         *     new GenericItem("Generic Item", 10, 10),
         *     new AgedItem("Aged Brie", 10, 8),
         *     new LegendaryItem("Sulfuras", 80, 8),
         *     new EventItem("Backstage passes", 10, 10)
         * });

         * shop.updateQuality();
         */
    }
}

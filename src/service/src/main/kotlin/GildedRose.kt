import java.lang.Integer.min

class GildedRose(var items: List<Item>) {
    fun updateQuality() {
        items.map { item ->
            var qualityMultiplier = 1;
            item.handleSaleDate()
            if (item.sellIn < 0) qualityMultiplier = 2;

            item.handleAgedBrie()
            item.handleConjured(qualityMultiplier)
            item.handleBackStagePass()
            item.handleQuality(qualityMultiplier)
        }
    }
}
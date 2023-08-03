fun Item.handleSaleDate() {
    this.sellIn = this.sellIn - 1
}
fun Item.handleAgedBrie() {
    if (this.isBrie() && !this.isSulfurace()) {
        this.quality = this.quality + 1
    }
}

fun Item.handleConjured(multiplier: Int) {
    if (this.isConjured() && !this.isSulfurace()) {
        this.quality = this.quality - (2 * multiplier)
    }
}

fun Item.handleBackStagePass() {
    if (this.isBackStage() && !this.isSulfurace()) {
        when (this.sellIn) {
            in 6..10 -> {
                this.quality = this.quality + 2
            }
            in 0..5 -> {
                this.quality = this.quality + 3
            }
            else -> {
                this.quality = this.quality + 1
            }
        }
    }
}

fun Item.handleQuality(multiplier: Int) {
    if (!this.isSulfurace() && !this.isConjured() && !this.isBackStage() && !this.isBrie()) {
        this.quality = this.quality - (1 * multiplier)
        this.quality = Integer.min(this.quality, 50);
    }
}

fun Item.isSulfurace() = this.name.lowercase().contains("sulfuras");
fun Item.isBackStage() = this.name.lowercase().contains("backstage passes");
fun Item.isConjured() = this.name.lowercase().contains("conjured");
fun Item.isBrie() = this.name.lowercase().contains("aged brie");
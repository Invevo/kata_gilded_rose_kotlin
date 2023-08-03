import org.junit.jupiter.api.Test

class LogicTests {

    @Test
    fun `todo implement tests`() {
        val testItem = Item("foo", 1, 1)
        val testItems =  listOf(testItem)
        val app = GildedRose(testItems)
        app.updateQuality()
        val foo = app.items.find { item -> item.name == "foo" }
        assert(foo?.quality == testItem.quality - 1)
        assert(foo?.sellIn == testItem.sellIn - 1)

        app.updateQuality()

        assert(foo?.quality == 0)
        assert(foo?.sellIn == testItem.sellIn - 2)
    }

    @Test
    fun `todo implement tests 2`() {
        val testItem = Item("foo", 1, 100)
        val testItems =  listOf(testItem)
        val app = GildedRose(testItems)
        app.updateQuality()
        val foo = app.items.find { item -> item.name == "foo" }
        assert(foo?.quality == 99)

        app.updateQuality()

        assert(foo?.quality == 97)
    }

    @Test
    fun `todo implement tests 3`() {
        val testItem = Item("foo", 1, 1)
        val testItems =  listOf(Item("foo", 1, 1))
        val app = GildedRose(testItems)
        app.updateQuality()
        val foo = app.items.find { item -> item.name == "foo" }
        assert(foo?.quality == testItem.quality - 1)
        assert(foo?.sellIn == testItem.quality - 1)

    }
}
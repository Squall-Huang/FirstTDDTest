import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CartTest {

    @Test
    fun buy1() {
        val cart = Cart()
        val price = cart.buy(1, 100)
        Assertions.assertEquals(100,price)
    }

    @Test
    fun buy2_get_90_percent_discount() {
        val cart = Cart()
        val price = cart.buy(2, 100)
        Assertions.assertEquals(180,price)
    }
}
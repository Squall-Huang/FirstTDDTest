import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CartTest {

    @Test
    fun buy1() {
        val cart = Cart(false)
        val price = cart.buy(1, 100)
        Assertions.assertEquals(100,price)
    }

    @Test
    fun buy2_get_90_percent_discount() {
        val cart = Cart(false)
        val price = cart.buy(2, 100)
        Assertions.assertEquals(180,price)
    }

    @Test
    fun buy1_vip_get_80_percent_discount() {
        val cart = Cart(true)
        val price = cart.buy(1, 100)
        Assertions.assertEquals(80,price)
    }

    @Test
    fun buy2_vip_get_72_percent_discount() {
        val cart = Cart(true)
        val price = cart.buy(2, 100)
        Assertions.assertEquals(144,price)
    }
}
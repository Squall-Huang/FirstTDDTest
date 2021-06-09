class Cart(val isVIP: Boolean) {
    fun buy(quantity: Int, price: Int): Int {
        val totalPrice = quantity * price
        if (isVIP) {
            return (totalPrice * 0.8).toInt()
        }
        else if (quantity > 1) {
            return (totalPrice * 0.9).toInt()
        }
        return totalPrice
    }

}

class Cart {
    fun buy(quantity: Int, price: Int): Int {
        val totalPrice = quantity * price
        if (quantity > 1) {
            return (totalPrice * 0.9).toInt()
        }
        return totalPrice
    }

}

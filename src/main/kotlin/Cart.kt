class Cart {
    fun buy(quantity: Int, price: Int): Int {
        if (quantity > 1) {
            return (quantity * price * 0.9).toInt()
        }
        return quantity * price
    }

}

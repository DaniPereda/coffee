package domain

class MachineOrder(private val order: Orders, private val message: String = "") {
    fun translate(): String {
        return when (this.order) {
            Orders.TEA_SUGAR_STICK -> "T:1:0"
            Orders.CHOCOLATE -> "H::"
            Orders.COFFEE_2SUGAR_STICK -> "C:2:0"
            Orders.MESSAGE -> "M:" + this.message
        }
    }
}
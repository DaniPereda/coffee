package domain

import kotlin.math.roundToInt

class MachineOrder(private var order: Orders, private var message: String = "", private val moneyInserted:Float = 0F) {
    private fun translate(): String {
        return when (order) {
            Orders.TEA_SUGAR_STICK -> "T:1:0"
            Orders.CHOCOLATE -> "H::"
            Orders.COFFEE_2SUGAR_STICK -> "C:2:0"
            Orders.MESSAGE -> "M:" + message
            Orders.COFFE_EXTRA_HOT -> "Ch::"
            Orders.ORANGE_JUICE -> "O::"
            Orders.CHOCOLATE_EXTRA_HOT_SUGAR_STICK -> "Hh:1:0"
            Orders.TEA_EXTRA_HOT_2SUGAR_STICK -> "Th:2:0"
        }
    }
    private fun controlMoney()
    {
        val moneyToInsert = moneyInserted - order.price

        if(notEnoughMoney(moneyToInsert))
        {
            message = "Error you need ${howManyMoneyNeeded(moneyToInsert)} coins. The cost of your drink is ${order.price}"
            order = Orders.MESSAGE
        }
    }

    private fun round2(amount:Float):Float = ((amount * 100).toInt()).toFloat()/100

    private fun howManyMoneyNeeded(moneyToInsert: Float):String = round2(moneyToInsert * -1).toString()

    private fun notEnoughMoney(moneyExceeded: Float) = moneyExceeded < 0

    fun manageMachineOrder():String{
        controlMoney()
        return translate()
    }
}
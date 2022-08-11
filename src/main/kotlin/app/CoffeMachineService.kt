package app

import domain.MachineOrder

class CoffeMachineService(var drinkMaker: DrinkMaker) {
    var machineOrder = MachineOrder()

    fun manageButton(button: Buttons)
    {
        when(button){
            Buttons.DECREASE_SUGAR -> machineOrder.decraseSugar()
            Buttons.INCREASE_SUGAR -> machineOrder.increaseSugar()
            Buttons.COFFEE -> machineOrder.coffee()
            Buttons.CHOCOLATE -> machineOrder.chocolate()
            Buttons.TEA -> machineOrder.tea()
            Buttons.READY -> ready()

        }
    }
    fun ready() {

        sendOrderToDrinkMaker()
    }

    private fun sendOrderToDrinkMaker() {
        drinkMaker.receiveOrder(getFormattedOrder())
    }

    private fun getFormattedOrder() = machineOrder.manageOrder()


}
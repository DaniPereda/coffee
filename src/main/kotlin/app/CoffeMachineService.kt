package app

import domain.MachineOrder

class CoffeMachineService(var drinkMaker: DrinkMaker, var translator:Translator) {
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
        machineOrder.check_Drink_Selected()
        sendOrderToDrinkMaker()
    }

    private fun sendOrderToDrinkMaker() {
        translator.translate(machineOrder, drinkMaker)
    }

}
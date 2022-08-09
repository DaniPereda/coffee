package app
import domain.*

class CoffeMachineService {
    fun run(drinkMaker:DrinkMaker,pad:Pad)
    {
        var padOrder = pad.sendOrder()
        drinkMaker.receiveOrder(padOrder.translate())
    }

}
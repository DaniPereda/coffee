package app

import domain.Products

class CoffeMachineService {
    fun run(drinkMaker: DrinkMaker, pad: Pad)
    {
        var padOrder = pad.sendOrder(Products.ORANGE, 1, 5, false,0.6F)
        drinkMaker.receiveOrder(padOrder.manageOrder())
    }

}
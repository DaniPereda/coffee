package app

import domain.MachineOrder
import domain.Products

interface Pad {
    fun sendOrder(product: Products, numberSugars:Int, numberSticks:Int, extraHot:Boolean, moneyInserted:Float): MachineOrder
}
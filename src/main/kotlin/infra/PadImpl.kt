package infra

import domain.MachineOrder
import domain.Products
import app.Pad

class PadImpl: Pad {
    override fun sendOrder(product:Products, numberSugars:Int, numberSticks:Int, extraHot:Boolean, moneyInserted:Float): MachineOrder {
        return MachineOrder(product, numberSugars, numberSticks, "", extraHot, moneyInserted)
    }
}
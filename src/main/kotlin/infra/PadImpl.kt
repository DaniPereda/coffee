package infra

import domain.MachineOrder
import domain.Orders
import domain.Pad

class PadImpl:Pad {
    override fun sendOrder(): MachineOrder {
        return MachineOrder(Orders.CHOCOLATE, "Something is wrong", 0.55F)
    }
}
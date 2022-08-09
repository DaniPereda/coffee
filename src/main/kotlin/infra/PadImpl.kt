package infra

import domain.MachineOrder
import domain.Orders
import domain.Pad

class PadImpl:Pad {
    override fun sendOrder(): MachineOrder {
        return MachineOrder(Orders.TEA_SUGAR_STICK, "Algo no ha funcionado")
    }
}
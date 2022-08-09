package infra

import domain.MachineOrder
import domain.Orders
import domain.Pad

class PadImpl:Pad {
    override fun sendOrder(): MachineOrder {
        return MachineOrder(Orders.TEA_EXTRA_HOT_2SUGAR_STICK, "Something is wrong", 0.40F)
    }
}
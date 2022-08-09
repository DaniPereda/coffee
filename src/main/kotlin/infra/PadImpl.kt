package infra

import domain.MachineOrder
import domain.Products
import app.Pad

class PadImpl: Pad {
    override fun sendOrder(): MachineOrder {
        return MachineOrder(Products.TEA, 2, 1, "")
    }
}
package app

import domain.MachineOrder

interface Pad {
    fun sendOrder(): MachineOrder
}
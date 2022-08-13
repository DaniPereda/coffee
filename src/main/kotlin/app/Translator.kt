package app

import domain.MachineOrder
import app.DrinkMaker

interface Translator {
    fun translate(machineOrder: MachineOrder)
}
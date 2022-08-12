package app

import domain.MachineOrder

interface Translator {
    fun translate(machineOrder: MachineOrder):String
}
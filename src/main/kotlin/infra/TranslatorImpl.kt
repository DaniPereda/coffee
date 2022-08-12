package infra

import app.Translator
import domain.ERROR_CODES
import domain.MachineOrder

class TranslatorImpl(): Translator {
    var machineOrder = MachineOrder()
    override fun translate(myMachineOrder: MachineOrder):String {
        machineOrder = myMachineOrder
        if(hasNoErrors())
        {
            return okMessageGeneration()
        }
        else {
            return errorMsgGeneration()
        }

    }

    private fun hasNoErrors() = machineOrder.error == ERROR_CODES.NONE

    private fun okMessageGeneration() = translateCode() + ":" + translateSugarAndStick()

    private fun errorMsgGeneration():String
    {
        var message = "M: ERROR. "
        when(machineOrder.error){
            ERROR_CODES.NO_SELECTED_DRINK -> message += "DRINK NOT SELECTED"
        }

        return message

    }
    private fun translateCode() = machineOrder.product.code
    private fun translateSugarAndStick():String {
        return if(machineOrder.sugar == 0)
            noSugarNoStick()
        else
            sugarAndStick()

    }
    private fun sugarAndStick() = "${machineOrder.sugar}:0"
    private fun noSugarNoStick() = ":"
}
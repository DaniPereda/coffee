package domain

import kotlin.math.roundToInt

class MachineOrder() {

    private var product: Products = Products.ERROR
    private var sugar:Int=0
    private var message: String = ""

    fun increaseSugar(){
        sugar += 1
    }
    fun decraseSugar(){
        if(sugar > 0)
            sugar -= 1
    }
    fun chocolate(){
        product = Products.CHOCOLATE
    }
    fun tea(){
        product = Products.TEA
    }
    fun coffee(){
        product = Products.COFFEE
    }

    private fun errorMessage() = product == Products.ERROR

    private fun translateProduct() = product.code

    private fun translateSugarAndStick():String {
        return if(sugar == 0)
            noSugarNoStick()
        else
            sugarAndStick()
    }

    private fun sugarAndStick() = sugar.toString() + ":0"

    private fun noSugarNoStick() = ":"



    fun manageOrder():String{
        var codeReturned:String
        codeReturned = translateProduct()
        if(errorMessage())
        {
            codeReturned += message
        }else {
            codeReturned = codeReturned + ":" + translateSugarAndStick()
        }
        return codeReturned
    }

}
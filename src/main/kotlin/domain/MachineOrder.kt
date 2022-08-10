package domain

import kotlin.math.roundToInt

class MachineOrder(private var product: Products, private val sugar:Int=0, private val stick:Int=0, private var message: String = "", private val isExtraHot:Boolean = false, private val moneyInserted:Float = 0F) {
    fun translate(): String {
        var codeReturned:String
        codeReturned = translateProduct()
        if(errorMessage())
        {
            codeReturned += message
        }else {
            codeReturned = codeReturned + translateExtraHot() + ":" + translateSugar() + ":" + translateStick()
        }
        return codeReturned
    }

    private fun errorMessage() = product == Products.ERROR

    private fun translateProduct() = product.code

    private fun translateSugar():String {
        return if(sugar == 0)
            ""
        else
            sugar.toString()
    }

    private fun translateExtraHot():String {
        return if(isExtraHot)
            "h"
        else
            ""
    }

    private fun translateStick():String {
        return if(stick == 0)
            ""
        else
            "0"
    }

    fun manageOrder():String{
        if(notEnoughMoney())
        {
            message = "Error, you need ${roundedDifference()} more credit to reach the cost of the product (${product.price})"
            product = Products.ERROR
        }
        return translate()
    }

    private fun roundedDifference() = (((product.price - moneyInserted)*100).roundToInt()).toFloat()/100

    private fun notEnoughMoney() = product.price > moneyInserted




}
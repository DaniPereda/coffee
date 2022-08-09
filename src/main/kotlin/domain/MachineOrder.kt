package domain

class MachineOrder(private val product: Products, private val sugar:Int=0, private val stick:Int=0, private val message: String = "") {
    fun translate(): String {
        var codeReturned:String
        codeReturned = translateProduct()
        if(errorMessage())
        {
            codeReturned += message
        }else {
            codeReturned = codeReturned + ":" + translateSugar() + ":" + translateStick()
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

    private fun translateStick():String {
        return if(stick == 0)
            ""
        else
            (stick - 1).toString()
    }



}
package domain


class MachineOrder() {

    var product: Products = Products.NO_SELECTED
    var sugar:Int=0
    var error = ERROR_CODES.NONE

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

    fun check_Drink_Selected() {
        if (product == Products.NO_SELECTED)
        {
            error = ERROR_CODES.NO_SELECTED_DRINK
        }
    }

}
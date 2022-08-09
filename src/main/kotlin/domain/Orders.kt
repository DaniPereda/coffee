package domain

enum class Orders (val price:Float=0F){
    TEA_SUGAR_STICK(Prices.TEA.familyPrice),
    CHOCOLATE(Prices.CHOCOLATE.familyPrice),
    COFFEE_2SUGAR_STICK(Prices.COFFEE.familyPrice),
    ORANGE_JUICE(Prices.ORANGE_JUICE.familyPrice),
    COFFE_EXTRA_HOT(Prices.COFFEE.familyPrice),
    CHOCOLATE_EXTRA_HOT_SUGAR_STICK(Prices.CHOCOLATE.familyPrice),
    TEA_EXTRA_HOT_2SUGAR_STICK(Prices.TEA.familyPrice),
    MESSAGE,
}

private enum class Prices(val familyPrice:Float){
    COFFEE(0.6F),
    ORANGE_JUICE(0.6F),
    TEA(0.4F),
    CHOCOLATE(0.5F)

}
package domain

enum class Products(val code:String, val price:Float = 0F) {
    TEA("T", 0.4F),
    CHOCOLATE("H", 0.5F),
    COFFEE("C", 0.6F),
    ORANGE("O", 0.6F),
    NULL(""),
}
package app

interface Pad {
    fun coffee(): Buttons
    fun tea(): Buttons
    fun chocolate(): Buttons
    fun increaseSugar(): Buttons
    fun decreaseSugar(): Buttons
    fun ready(): Buttons


}
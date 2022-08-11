package infra

import app.Buttons
import app.Pad

class PadImpl: Pad {

    override fun coffee() = Buttons.COFFEE

    override fun tea() = Buttons.TEA

    override fun chocolate() = Buttons.CHOCOLATE

    override fun increaseSugar() = Buttons.INCREASE_SUGAR

    override fun decreaseSugar() = Buttons.DECREASE_SUGAR

    override fun ready() = Buttons.READY



}
import app.CoffeMachineService
import infra.DrinkMakerImpl
import infra.PadImpl
import infra.TranslatorImpl
import app.MainApp

fun main(args: Array<String>) {
    MainApp(DrinkMakerImpl(), PadImpl(), TranslatorImpl()).userInteraction()

}

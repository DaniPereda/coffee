import infra.DrinkMakerImpl
import infra.PadImpl
import app.CoffeMachineService

fun main(args: Array<String>) {
    CoffeMachineService().run(DrinkMakerImpl(), PadImpl())
}
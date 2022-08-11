import app.CoffeMachineService
import infra.DrinkMakerImpl
import infra.PadImpl
import app.MainApp
import domain.MachineOrder

fun main(args: Array<String>) {
    MainApp(DrinkMakerImpl(), PadImpl()).userInteraction()

}

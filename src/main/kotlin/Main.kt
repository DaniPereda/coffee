import infra.DrinkMakerImpl
import infra.PadImpl
import app.CoffeMachineService

fun main(args: Array<String>) {
    CoffeMachineService().run(DrinkMakerImpl(), PadImpl())
}

//aquest pas de parametres l'he de fer des de app? però aleshores hauria de referenciar infra des-de app. no? Això no estaria be
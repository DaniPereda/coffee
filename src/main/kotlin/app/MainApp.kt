package app

class MainApp(private val pad: Pad, adapter:Translator) {
    var coffeeMachineService = CoffeMachineService(adapter)

    fun userInteraction(){

        coffeeMachineService.manageButton(pad.increaseSugar())
        coffeeMachineService.manageButton(pad.decreaseSugar())
        coffeeMachineService.manageButton(pad.coffee())
        coffeeMachineService.manageButton(pad.ready())
    }


}
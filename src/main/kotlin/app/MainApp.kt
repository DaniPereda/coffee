package app

class MainApp(drinkMaker: DrinkMaker, private val pad: Pad, translator:Translator) {
    var coffeeMachineService = CoffeMachineService(drinkMaker, translator)

    fun userInteraction(){

        coffeeMachineService.manageButton(pad.increaseSugar())
        coffeeMachineService.manageButton(pad.decreaseSugar())
        coffeeMachineService.manageButton(pad.increaseSugar())
        coffeeMachineService.manageButton(pad.tea())


        coffeeMachineService.manageButton(pad.ready())
    }


}
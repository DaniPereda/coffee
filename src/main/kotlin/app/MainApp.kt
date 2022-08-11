package app

class MainApp(drinkMaker: DrinkMaker, private val pad: Pad) {
    var coffeeMachineService = CoffeMachineService(drinkMaker)

    fun userInteraction(){
        coffeeMachineService.manageButton(pad.chocolate())
        coffeeMachineService.manageButton(pad.increaseSugar())
        coffeeMachineService.manageButton(pad.decreaseSugar())
        coffeeMachineService.manageButton(pad.increaseSugar())
        coffeeMachineService.manageButton(pad.tea())
        coffeeMachineService.manageButton(pad.decreaseSugar())
        coffeeMachineService.manageButton(pad.decreaseSugar())

        coffeeMachineService.manageButton(pad.ready())
    }


}
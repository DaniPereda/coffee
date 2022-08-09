package infra
import domain.DrinkMaker

class DrinkMakerImpl:DrinkMaker {
    override fun receiveOrder(nativeOrder: String) {
        println(nativeOrder)
    }

}
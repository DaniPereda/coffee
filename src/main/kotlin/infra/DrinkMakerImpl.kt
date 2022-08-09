package infra
import app.DrinkMaker

class DrinkMakerImpl: DrinkMaker {
    override fun receiveOrder(nativeOrder: String) {
        println(nativeOrder)
    }

}
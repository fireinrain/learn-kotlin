package classes

/**
@Description:
@Author  : fireinrain
@Site    : https://github.com/fireinrain
@File    : Lamp
@Software: IntelliJ IDEA
@Time    : 2022/7/26 12:00 PM
 */

class Lamp {
    private var isOn: Boolean = false

    fun turnOn() {
        this.isOn = true
    }

    fun turnOff() {
        this.isOn = false
    }

    fun lightSatus(): Boolean {
        return this.isOn
    }



}


fun main(args: Array<String>) {
    val lamp = Lamp()
    lamp.turnOn()
    println(lamp.lightSatus())
}
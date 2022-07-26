package classes

/**
@Description: 继承
@Author  : fireinrain
@Site    : https://github.com/fireinrain
@File    : Inherit2
@Software: IntelliJ IDEA
@Time    : 2022/7/26 6:50 PM
 */

class Inherit2 {}

open class PersonB(name: String, age: Int) {
    init {
        println("my name is: $name, age is: $age")
    }
}

class Teacher(name: String, age: Int, address: String) : PersonB(name, age) {
    fun teachMath() {
        println("I teaching match")
    }
}

class GamePlayer(name: String, age: Int, address: String) : PersonB(name, age) {
    fun playGame() {
        println("I am play games")
    }
}

open class Monitor {
    var type: String

    constructor(type: String) {
        this.type = type
    }

    open fun printInfo() {
        println("my type is: ${this.type}")
    }
}

class LGMonitor(name: String, type: String) : Monitor(type) {
    private var name: String

    init {
        this.name = name
    }


    override fun printInfo() {
        // super.printInfo()
        println("my name is: ${this.name},my type is: ${this.type}")
    }
}

class DEllMonitor(name: String, type: String) : Monitor(type) {
    private var name: String

    init {
        this.name = name
    }


    override fun printInfo() {
        // super.printInfo()
        println("my name is: ${this.name},my type is: ${this.type}")
    }
}



fun main(args: Array<String>) {
    val teacher = Teacher("baba", 14, "beijin")
    teacher.teachMath()

    val gamePlayer = GamePlayer("xiye", 25, "nanjin")
    gamePlayer.playGame()


    val lgMonitor = LGMonitor("LG", "IPS")
    lgMonitor.printInfo()

    val dEllMonitor = DEllMonitor("DELL", "AMoled")
    dEllMonitor.printInfo()
}
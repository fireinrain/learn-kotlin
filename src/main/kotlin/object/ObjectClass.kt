package `object`

/**
@Description: 在kotlin中 object 是单例对象  和class 声明的对象类似
只不过他只会有一个实例
@Author  : fireinrain
@Site    : https://github.com/fireinrain
@File    : ObjectClass
@Software: IntelliJ IDEA
@Time    : 2022/7/27 12:31 PM
 */

object ObjectClass {}


open class People {
    fun printInfo() = println("my info")

    fun eat() = println("I am eating")

    open fun sayHi(name: String) {
        println("I say hello to $name")
    }
}

object Bob : People() {
    var name: String = "Bob"

    override fun sayHi(name: String) {
        super.sayHi(name)
        println("hihi I am ${this.name}")
    }
}

fun main(args: Array<String>) {
    Bob.sayHi("Bob")
    println(Bob.name)
}
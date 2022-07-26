package abstractclass

/**
@Description:
@Author  : fireinrain
@Site    : https://github.com/fireinrain
@File    : AbstractClass
@Software: IntelliJ IDEA
@Time    : 2022/7/26 10:45 PM
 */

abstract class AbstractClass {}

abstract class Desk {
    abstract var name: String
    abstract var brand: String

    // 在抽象类中的方法 （有方法体的方法）默认是final的 想要在子类中
    // 重写的话 需要加上open关键字
    open fun printInfo() {
        println("name: $name, bran: $brand")
    }

}

class IDEADEsk(brand: String, name: String) : Desk() {
    override var name: String = name
        get() = field
        set(value) {
            field = value
        }
    override var brand: String = brand
        get() = field
        set(value) {
            field = value
        }

    override fun printInfo() {
        println("I am from idea desk")
    }

}


fun main(args: Array<String>) {
    val ideadEsk = IDEADEsk("idea", "desk")
    ideadEsk.printInfo()
}
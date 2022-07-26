package classes

/**
@Description:
@Author  : fireinrain
@Site    : https://github.com/fireinrain
@File    : Inherit3
@Software: IntelliJ IDEA
@Time    : 2022/7/26 10:03 PM
 */

class Inherit3 {
}


open class Person() {
    open var age: Int = 0
        get() = field

        set(value) {
            field = value
        }
}

class Girl: Person() {

    override var age: Int = 0
        get() = field

        set(value) {
            field = value - 5
        }
}

fun main(args: Array<String>) {

    val girl = Girl()
    girl.age = 31
    println("我的虚拟年龄是 ${girl.age}.")
}
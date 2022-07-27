package interfaces

/**
@Description: 接口
@Author  : fireinrain
@Site    : https://github.com/fireinrain
@File    : Test
@Software: IntelliJ IDEA
@Time    : 2022/7/26 11:06 PM
 */

interface Test {}


interface MyInterface {
    var name: String
    fun foo()

    fun printInfo(number: String): Int
}


class My : MyInterface {
    override var name: String = ""
        get() = field
        set(value) {
            field = value
        }

    override fun foo() {
        println("I am foo")
    }

    override fun printInfo(number: String): Int {
        println("i am printinfo")
        return 1
    }

}

interface A {
    fun callMe() {
        println("Call from A")
    }
}

interface B {
    fun callMeToo() {
        println("Call from B")
    }
}

class C : A, B


interface Animal {
    fun printInfo() {
        println("I am animal")
    }
}

interface Memal {
    fun printInfo() {
        println("I am memal")
    }
}

class Mokey : Animal, Memal {
    override fun printInfo() {
        super<Animal>.printInfo()
        super<Memal>.printInfo()
    }

}

fun main(args: Array<String>) {
    val my = My()
    my.foo()
    my.printInfo("xiaoqian")

    val c = C()
    c.callMe()
    c.callMeToo()

    val mokey = Mokey()
    mokey.printInfo()
}



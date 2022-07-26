package classes

/**
@Description:
@Author  : fireinrain
@Site    : https://github.com/fireinrain
@File    : Inherit4
@Software: IntelliJ IDEA
@Time    : 2022/7/26 10:04 PM
 */

class Inherit4 {}

open class PersonCase() {
    open fun displayAge(age: Int) {
        println("我的实际年龄是 $age.")
    }
}

class GirlCase : PersonCase() {

    override fun displayAge(age: Int) {

        //调用基类的函数
        super.displayAge(age)

        println("我的虚拟年龄是 ${age - 5}.")
    }
}

fun main(args: Array<String>) {
    val girl = GirlCase()
    girl.displayAge(31)
}
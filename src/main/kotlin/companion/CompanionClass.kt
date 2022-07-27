package companion

/**
@Description: 伴生对象  用来模拟java中的static
@Author  : fireinrain
@Site    : https://github.com/fireinrain
@File    : CompanionClass
@Software: IntelliJ IDEA
@Time    : 2022/7/27 12:47 PM
 */

class CompanionClass {
}


class People {
    var name: String = "xiao"
    var age: Int = 20

    companion object {
        @JvmField
        val gender: String = "male"

        @JvmStatic
        fun printInfo() {
            println("my gender is: $gender")
        }
    }
}


fun main(args: Array<String>) {
    val people = People()
    println(People.gender)
    println(People.printInfo())
}
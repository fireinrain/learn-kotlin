package function

/**
@Description:
@Author  : fireinrain
@Site    : https://github.com/fireinrain
@File    : Function
@Software: IntelliJ IDEA
@Time    : 2022/7/25 6:48 PM
 */

fun main(args: Array<String>) {
    println("hello")
    printHelloToPeople("xiaoqian")
    printInfo("xiaobai", 18)
    var product = { a: Int -> println(a) }
    product(10)
}

fun printHelloToPeople(name: String): String {
    println("hello $name")
    return "hello$name"
}

//如果函数返回单个表达式(如上例所示)，则可以省略函数体的花括号{}，并在 = 符号之后指定主体。

fun printInfo(name: String, age: Int): String = "name is $name,age is $age"
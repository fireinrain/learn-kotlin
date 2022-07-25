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
}

fun printHelloToPeople(name: String): String {
    println("hello $name")
    return "hello$name"
}
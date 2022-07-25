package processcontrol

/**
@Description:
@Author  : fireinrain
@Site    : https://github.com/fireinrain
@File    : While
@Software: IntelliJ IDEA
@Time    : 2022/7/25 4:19 PM
 */

fun main(args: Array<String>) {
    //while 和 do{} while

    var count = 100
    var result: Int = 0
    while (count >= 0) {
        result += count
        count--
    }
    println("result is: $result")

    result = 0
    count = 100
    do {
        result += count
        count--
    } while (count > 0)
    println("result is: $result")
}
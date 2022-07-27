package extension

/**
@Description:
@Author  : fireinrain
@Site    : https://github.com/fireinrain
@File    : Extension
@Software: IntelliJ IDEA
@Time    : 2022/7/27 1:44 PM
 */

fun String.removeFirstAndLast() = this.substring(1, this.length - 1)

fun main(args: Array<String>) {
    var name = "xiaoqian"
    println(name.removeFirstAndLast())

}
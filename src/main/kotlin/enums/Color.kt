package enums

/**
@Description:
@Author  : fireinrain
@Site    : https://github.com/fireinrain
@File    : Color
@Software: IntelliJ IDEA
@Time    : 2022/7/27 8:17 PM
 */

enum class Color {
    YELLOW, BLUE,
}

fun main(args: Array<String>) {
    val blue = Color.BLUE
    println(blue.name)

    val values = Color.values()
    for (value in values) {
        println(value)
    }

    val valueOf = Color.valueOf("YELLOW")
    println(valueOf is Color)

}
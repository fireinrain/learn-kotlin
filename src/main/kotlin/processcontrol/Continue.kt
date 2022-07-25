package processcontrol

/**
@Description:
@Author  : fireinrain
@Site    : https://github.com/fireinrain
@File    : Continue
@Software: IntelliJ IDEA
@Time    : 2022/7/25 4:38 PM
 */

fun main(args: Array<String>) {
    for (i in 1..5) {
        println("$i Always printed.")
        if (i > 1 && i < 5) {
            continue
        }
        println("$i Not always printed.")
    }

    //continue 跳转标签
    here@ for (i in 1..5) {
        for (j in 1..4) {
            if (i == 3 || j == 2)
                continue@here
            println("i = $i; j = $j")
        }
    }
}
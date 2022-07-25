package processcontrol

/**
@Description:
@Author  : fireinrain
@Site    : https://github.com/fireinrain
@File    : Break
@Software: IntelliJ IDEA
@Time    : 2022/7/25 4:38 PM
 */

fun main(args: Array<String>) {
    for (i in 1..10) {
        if (i == 8) {
            println("find num: $i")
            break
        }
    }

    //break tag

    var result = 0
    outter@ for (i in 1..10) {
        for (j in 1..10) {
            if ((i == 7) and (j == 7)) {
                result = i
                break@outter
            }
        }
    }
    println("result is: $result")


}
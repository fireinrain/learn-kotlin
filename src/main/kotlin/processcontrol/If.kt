package processcontrol

/**
@Description:
@Author  : fireinrain
@Site    : https://github.com/fireinrain
@File    : If
@Software: IntelliJ IDEA
@Time    : 2022/7/25 11:58 AM
 */

fun main(args: Array<String>) {
    var age = 106
    if (age > 10) {
        println("You are older than 10")
    } else {
        println("You are newer than 10")
    }

    var number = -10
    var result = if (number > 0) {
        "正数"
    } else {
        "负数"
    }
    println(result)


    var a = 16
    var b = 10
    var max = if (a > b) {
        println("a > b")
        println("max is a")
        a
    } else {
        println("a < b")
        println("max is b")
        b
    }
    println(max)

    var n = 0
    var r = if(n>0){
        "正数"
    }else if (n<0){
        "负数"
    }else{
        "0"
    }
    println(r)


    //三个数比较
    val n1 = 3
    val n2 = 5
    val n3 = -2

    val maxNum = if (n1 > n2) {
        if (n1 > n3)
            n1
        else
            n3
    } else {
        if (n2 > n3)
            n2
        else
            n3
    }

    println("maxNum = $maxNum")
}
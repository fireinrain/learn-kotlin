package processcontrol

/**
@Description:
@Author  : fireinrain
@Site    : https://github.com/fireinrain
@File    : For
@Software: IntelliJ IDEA
@Time    : 2022/7/25 4:23 PM
 */

fun main(args: Array<String>) {
    for (i in 1..10){
        println("index: $i")
    }

    for(i in 10 downTo 1){
        println("index: $i")
    }

    for(i in 10 downTo 1 step 2){
        println("index with step 2: $i")
    }

    for(i in 1 .. 10 step 3){
        println("index with step 2: $i")
    }

    // 遍历数组
    val names = arrayOf("xiao", "bai", "lin")
    for(i in names){
        println("name is: $i")
    }
    //遍历字符
    var people = "xiaoxiao"
    for(char in people){
        println("char: $char")
    }

    //带index 遍历
    people.forEachIndexed { index, char -> println("index: $index,char: $char") }

    var language = arrayOf("Ruby", "Koltin", "Python", "Java")

    for (item in language.indices) {

        //打印仅具有偶数索引的数组元素
        if (item%2 == 0){
            println(language[item])
        }

    }
}
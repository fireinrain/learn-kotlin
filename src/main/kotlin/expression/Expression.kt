package expression

/**
@Description: 表达式 语句 块
@Author  : fireinrain
@Site    : https://github.com/fireinrain
@File    : Expression
@Software: IntelliJ IDEA
@Time    : 2022/7/25 11:36 AM
 */

fun main(args: Array<String>) {

    // 表达式 是有返回值的
    // 语句没有返回值
    // 代码块 {} 执行内容

    // java 中if 是一个语句  条件语句
    // kotlin 中if是表达式

    var bigger = if (12 > 13) 12 else 13
    println("bigger is: $bigger")

    //Kotlin 语句
    // 语句是构成完整执行单元的所有内容。例如，
    //
    // val score = 90 + 25

    //表达式 是语句的一部分

    fun main(args: Array<String>) {  // main 函数块
        val flag = true

        if (flag == true) {      //if块的开始
            print("Hey ")
            print("jude!")
        }                        //if块的结尾
    }
    main(arrayOf(""))
}
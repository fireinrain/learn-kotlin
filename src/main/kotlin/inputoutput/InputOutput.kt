package inputoutput

import java.util.*

/**
@Description:
@Author  : fireinrain
@Site    : https://github.com/fireinrain
@File    : InputOutput
@Software: IntelliJ IDEA
@Time    : 2022/7/25 11:50 AM
 */

fun main(args: Array<String>) {


    //输出
    println("this is output")

    //输入
    // 要在 Kotlin 中读取一行字符串，可以使用 readline() 函数
    val readLine = readLine()!!
    println("readLine is: $readLine")

    // 获取其他类型
    // 创建一个实例，该实例从标准输入（键盘）获取输入
    // in 在kotlin中是关键字  所以用反引号
    val reader = Scanner(System.`in`)
    print("输入一个数字: ")

    //nextInt()从键盘读取下一个整数
    var integer:Int = reader.nextInt()

    println("您输入: $integer")
}
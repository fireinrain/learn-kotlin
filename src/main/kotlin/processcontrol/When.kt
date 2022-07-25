package processcontrol

/**
@Description:
@Author  : fireinrain
@Site    : https://github.com/fireinrain
@File    : When
@Software: IntelliJ IDEA
@Time    : 2022/7/25 4:09 PM
 */

fun main(args: Array<String>) {
    println("请输入数字1：")
    val number1 = readLine()!!
    val num1 = number1.toInt()
    println("请输入数字2：")
    val number2 = readLine()!!
    var num2 = number2.toInt()
    println("请输入操作符号：(+,-,*,/)")
    val op = readLine()!!
    val trim = op.trim()
    var result = when (trim) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> num1 / num2
        else -> "$op is not supported"
    }
    println("result is: $result")

    // when 可以赋值给变量  也可以不赋值给变量
    val a = 12
    val b = 5

    println("输入运算符 +, -, * 或 /")
    val operator = readLine()

    when (operator) {
        "+" -> println("$a + $b = ${a + b}")
        "-" -> println("$a - $b = ${a - b}")
        "*" -> println("$a * $b = ${a * b}")
        "/" -> println("$a / $b = ${a / b}")
        else -> println("$operator is invalid")
    }

    // when 的使用场景
    // 1、用逗号组合两个或多个分支条件。例如，
    //
    // 示例
    // fun main(args: Array<String>) {
    //
    //     val n = -1
    //
    //     when (n) {
    //         1, 2, 3 -> println("n 是正整数小于 4.")
    //         0 -> println("n 为0 ")
    //         -1, -2 -> println("n 是负整数大于 -3.")
    //     }
    // }
    // 运行该程序时，输出为：
    //
    // n 是负整数大于 -3.
    // 2、检查范围内的值。例如，
    //
    // 示例
    // fun main(args: Array<String>) {
    //
    //     val a = 100
    //
    //     when (a) {
    //         in 1..10 -> println("A 是小于11的正数。")
    //         in 10..100 -> println("介于10和100(包括10和100)之间的正数")
    //     }
    // }
    // 运行该程序时，输出为：
    //
    // 介于10和100(包括10和100)之间的正数
    // 3、检查值是否为特定类型。
    //
    // 要在运行时检查值是否为特定类型，可以使用 is 和！is 运算符。例如，
    //
    // when (x) {
    //     is Int -> print(x + 1)
    //     is String -> print(x.length + 1)
    //     is IntArray -> print(x.sum())
    // }
    // 4、使用表达式作为分支条件。例如，
    //
    // 示例
    // fun main(args: Array<String>) {
    //
    //     val a = 11
    //     val n = "11"
    //
    //     when (n) {
    //         "cat" -> println("Cat? Really?")
    //         12.toString() -> println("Close but not close enough.")
    //         a.toString() -> println("Bingo! It's eleven.")
    //     }
    // }
    // 运行该程序时，输出为：
    //
    // Bingo! It's eleven.

}
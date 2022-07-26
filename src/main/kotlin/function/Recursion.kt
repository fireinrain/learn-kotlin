package function

/**
@Description: 递归
@Author  : fireinrain
@Site    : https://github.com/fireinrain
@File    : Recursion
@Software: IntelliJ IDEA
@Time    : 2022/7/26 10:41 AM
 */

fun main(args: Array<String>) {
    // 求阶乘
    println(factorial(10))
    // 尾递归
    println(factorial2(10))


}

fun factorial(number: Int): Long {
    return if (number == 1) number.toLong() else number * factorial(number - 1)
}

tailrec fun factorial2(n: Int, run: Int = 1): Long {
    return if (n == 1) run.toLong() else factorial2(n-1, run*n)
}
//使用尾递归的阶乘
// 上述示例（第一个示例）中用于计算数字阶乘的示例无法针对尾递归进行优化。 这是执行相同任务的另一个程序。
//
// 示例
// fun main(args: Array<String>) {
//     val number = 5
//     println("$number 阶乘 = ${factorial(number)}")
// }
//
// tailrec fun factorial(n: Int, run: Int = 1): Long {
//     return if (n == 1) run.toLong() else factorial(n-1, run*n)
// }

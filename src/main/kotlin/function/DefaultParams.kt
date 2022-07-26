package function

/**
@Description: 默认参数和命名参数
@Author  : fireinrain
@Site    : https://github.com/fireinrain
@File    : DefaultParams
@Software: IntelliJ IDEA
@Time    : 2022/7/26 10:09 AM
 */

fun main(args: Array<String>) {
    // 指定参数
    println(printInfoMe("xiaobai"))
    //命名参数
    println(printInfoMe(age = 12))
    // 重载默认参数
    println(printInfoMe("baibai", 17))
    // 使用默认参数
    println(printInfoMe())

}

fun printInfoMe(info: String = "xiaobai", age: Int = 13) {
    println("info: $info,age: $age")
}
    

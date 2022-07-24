package variables

/**
@Description:
@Author  : fireinrain
@Site    : https://github.com/fireinrain
@File    : variables
@Software: IntelliJ IDEA
@Time    : 2022/7/24 12:11 PM
 **/
//声明一个全局常量
const val currencyName = "RMB"

//val（不可变引用）- 赋值后，无法更改使用val关键字声明的变量。 它类似于Java中的 final变量。
//
// var（可变引用）- 使用var关键字声明的变量可以稍后在程序中更改。它对应于常规的Java变量。
fun main(args: Array<String>) {
    //声明变量
    var name = "xiaoqian"
    var age = 12

    //声明不可变量
    val pi = 3.141592653

    //以上不主动指定类型 是因为kotlin会使用类型推导

    println("name is: $name, age is: $age")

    //主动指定类型
    var foodName: String = "kangshifu"
    val foodPrice: Float = 4.52f

    println("food: $foodName, price is: $foodPrice")

}
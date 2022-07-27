package dataclass

/**
@Description:
@Author  : fireinrain
@Site    : https://github.com/fireinrain
@File    : DataClass
@Software: IntelliJ IDEA
@Time    : 2022/7/27 12:10 PM
 */
// 可能会出现这样的情况: 您需要创建一个仅用于保存数据的类。在这种情况下，您可以将类标记为 data 以创建数据类。比如说,
//
// data class Person(val name: String, var age: Int)
// 对于此类，编译器会自动生成：
//
// copy()函数，equals()和hashCode()对以及主要构造函数的toString()形式
//
// componentN() 函数
//
// 在详细讨论这些函数之前，让我们讨论数据类必须满足的要求。
//
// Kotlin 数据类的要求
// 要求如下：
//
// 主构造函数必须至少具有一个参数。
//
// 主构造函数的参数必须标记为val（只读）或 var（读写）。
//
// 类不能是开放的、抽象的、内部的或密封的。
//
// 该类可以扩展其他类或实现接口。 如果您使用的是1.1之前的Kotlin版本，则该类只能实现接口。

data class DataClass(var name: String)


data class People(var firstName: String, var lastName: String)


fun main(args: Array<String>) {
    val people = People("xiao", "bai")
    println(people)
    // copy 函数
    val copy = people.copy("ding")
    println(copy)
    // toString
    println(copy.toString())

    // hashCode
    val hashCode = copy.hashCode()
    val peopleHashCode = people.hashCode()

    println("copy hash: $hashCode")
    println("people hash: $peopleHashCode")

    // 解构 对象属性
    val (firstName, secondName) = people
    println("firstname of people: $firstName")
    println("secondname of people: $secondName")
}



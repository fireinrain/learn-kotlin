package innerclass

/**
@Description: 内部类 和 嵌套类
@Author  : fireinrain
@Site    : https://github.com/fireinrain
@File    : InnerClass
@Software: IntelliJ IDEA
@Time    : 2022/7/27 11:11 AM
 */

// 需要注意
// 嵌套类 即 直接定义在类的内部，在嵌套类中 是无法访问外部类的成员变量的
// 使用inner 关键字定义的 是内部类  内部类保留了对外部成员变量的引用 所以是
// 可以访问外部类的成员变量的

class InnerClass {}

class OuterClass {
    var name: String = "outer"

    class InnerClass {
        var name: String = "inner"
        fun callMe() = "I am inner"

        fun printInfo() {
            println("my name is: $name")
            // 这里是无法访问到 outerclass的name的
        }
    }
}


class OuterClass2 {
    var name_: String = "outer2"

    inner class InnerClass2 {
        var name: String = "inner2"
        var kk = name_

        fun callMe() = "I am inner 2"

        fun printInfo() {
            println("value from outer: $kk")
        }
    }
}

fun main(args: Array<String>) {
    val outerClass = OuterClass()
    val innerClass = OuterClass.InnerClass()
    println(innerClass.callMe())
    innerClass.printInfo()


    val innerClass2 = OuterClass2().InnerClass2()
    innerClass2.printInfo()

}
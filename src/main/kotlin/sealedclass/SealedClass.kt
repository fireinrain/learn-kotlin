package sealedclass

import kotlin.math.roundToInt

/**
@Description: 密封类
@Author  : fireinrain
@Site    : https://github.com/fireinrain
@File    : SealedClass
@Software: IntelliJ IDEA
@Time    : 2022/7/27 12:21 PM
 */

sealed class SealedClass


sealed class A {
    var info: String = ""
}

class B : A() {

}

sealed class Expr
class Const(val value: Int) : Expr()
class Sum(val left: Expr, val right: Expr) : Expr()
object NotANumber : Expr()


fun eval(e: Expr): Int =
    when (e) {
        is Const -> e.value
        is Sum -> eval(e.right) + eval(e.left)
        NotANumber -> java.lang.Double.NaN.roundToInt()
    }

//密封类的所有子类必须在声明密封类的同一文件中声明。
//
// 密封类本身是抽象的，您不能从中实例化对象。
//
// 不能创建密封类的非私有构造函数；默认情况下，它们的构造函数是 private。
//
// 枚举和密封类之间的区别
// 枚举类和密封类非常相似。枚举类型的值集也像密封类一样受到限制。
//
// 唯一的区别是，枚举只能有一个实例，而密封类的子类可以有多个实例。
fun main(args: Array<String>) {
    // 密封类无法实例化
    // val a = A() cant compile

}

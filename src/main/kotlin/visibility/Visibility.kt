package visibility

import classes.People

/**
@Description: 可见性修饰符
@Author  : fireinrain
@Site    : https://github.com/fireinrain
@File    : Visibility
@Software: IntelliJ IDEA
@Time    : 2022/7/26 10:22 PM
 */

// 可见性修饰符是用于设置类，对象，接口，构造函数，函数，属性及其设置器的可见性（可访问性）的关键字。
// （不能设置 getters 的可见性修饰符，因为它们总是具有与属性相同的可见性

class Visibility {

}

// 包内的可见性修饰符
// 包组织一组相关的函数、属性和类、对象和接口。
//
// 修饰符	描述
// public	在任何地方都可见
// private	在包含声明的文件内可见
// internal	在同一模块内可见（一组一起编译的Kotlin文件）
// protected	不可用于包（用于子类）
// 注意：如果未指定可见性修饰符，则默认情况下为默认值 public 。


fun function1() {}   //默认情况下是公共的，并且在任何地方都可见

private fun function2() {}   //在hello.kt内部可见

internal fun function3() {}   //在同一模块内可见

var name = "Foo"   //随处可见
    get() = field   //在hello.kt内可见(与其属性相同)
    private set(value) {   //在hello.kt内部可见
        field = value
    }

private class class1 {} //在hello.kt内部可见

class Nmae(name: String) {
    private val name: String = name

    fun printInfo() {
        println(this.name)
    }
}

//一下两种基本上市等价的
class Foo {
    val bar: String

    constructor(barValue: String) {
        bar = barValue
    }
}

class Foo2(val bar: String)


// 私有化主构造函数
class Person private constructor(name: String, age: Int) {
    val name: String
    val age: Int

    init {
        this.name = name
        this.age = age
    }
}

open class Base() {
    var a = 1                 //默认情况下为公共
    private var b = 2         // Base 类私有
    protected open val c = 3  //对 Base 类和 Derived 类可见
    internal val d = 4        //在同一模块内可见

    protected fun e() {}     //对 Base 类和 Derived 类可见
}

class Derived : Base() {

    // a, c, d, 和 e()Base 类的所有属性都是可见的
    // b 不可见

    override val c = 9        // c 是 protected
}

fun main2(args: Array<String>) {
    val base = Base()

    //base.a和base.d可见
    // base.b, base.c 和 base.e() 不可见

    val derived = Derived()
    // derived.c 不可见
}


fun main(args: Array<String>) {
    val foo = Foo("xiaoqian")
    println(foo.bar)

    val foo2 = Foo2("xiaoqian")
    println(foo2.bar)

    //在外部 无法实例化
    // val people = Person("x", 13)
    // println(people.name)

    main2(arrayOf(""))

    var number: String? = null
    println(number)
}
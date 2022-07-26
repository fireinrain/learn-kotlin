package classes

/**
@Description:
@Author  : fireinrain
@Site    : https://github.com/fireinrain
@File    : Constructor
@Software: IntelliJ IDEA
@Time    : 2022/7/26 12:41 PM
 */

// Kotlin中的构造函数（主要构造函数和次构造函数）以及初始化程序块。
//
// 构造函数是初始化类属性的简洁方法。
//
// 它是一个特殊的成员函数，在实例化（创建）对象时调用。但是，它们在Kotlin中的工作方式略有不同。
//
// 在Kotlin中，有两个构造函数：
//
// 主构造函数 - 初始化类的简洁方法
//
// 次构造函数 - 允许您放置其他初始化逻辑


class Constructor

// 次构造函数
class Cube {
    val name: String
    var width: Double
    var height: Double

    var area:Double

    init {
        this.name = "Cube-X"
    }

    constructor(width: Double, height: Double) {
        this.width = width
        this.height = height
        this.area = this.width * this.height
    }

    override fun toString(): String {
        return "Cube(name='$name', width=$width, height=$height, area=$area)"
    }


}



// 默认参数
open class Animal(_name: String = "dog", _age: Int = 12) {

    val name = _name.uppercase()
    var age = _age

    init {
        this.age = _age + 1
    }

    override fun toString(): String {
        return "Animal(name='$name', age=$age)"
    }


}

// 主构造函数
class People(val name: String, var age: Int) {
    var address: String = "北京"
    var salary: Double
        get() {
            return 123.3
        }
        set(value) {}

    var height: Double

    init {
        this.height = 175.3
        // name 为 val 申明的变量 无法修改
        // this.name = "baibai"
    }


    override fun toString(): String {
        return "People(name='$name', age=$age, address='$address')"
    }

}

fun main(args: Array<String>) {
    val people = People("xiaoqian", 13)
    println(people)

    val animal = Animal()
    println(animal)

    val cube = Cube(23.2, 234.4)
    println(cube)
}
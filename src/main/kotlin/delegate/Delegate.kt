package delegate

import java.io.File
import kotlin.properties.Delegates
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
@Description:
@Author  : fireinrain
@Site    : https://github.com/fireinrain
@File    : Delegate
@Software: IntelliJ IDEA
@Time    : 2022/7/27 8:25 PM
 */

fun main(args: Array<String>) {
    // try {
    //     val firstLine = File("./test.txt").readLines().get(0)
    //     println(firstLine)
    // } catch (e: Exception) {
    //     e.printStackTrace()
    // }

    val maserGamePlayer = MaserGamePlayer()
    val newBeeWithMaster = NewBeeWithMaster(maserGamePlayer)
    newBeeWithMaster.rank()
    newBeeWithMaster.upgrade()

    val test = Test()
    println(test.prop)
    test.prop = "xiaoqian"


    //lazy
    println(lazyProp)
    println(lazyProp)

    // 可观察属性
    observableProp = "第一次修改值"
    observableProp = "第二次修改值"

    println("vetoableProp=$vetoableProp")
    vetoableProp = 10
    println("vetoableProp=$vetoableProp")
    vetoableProp = 5
    println("vetoableProp=$vetoableProp")
    vetoableProp = 100
    println("vetoableProp=$vetoableProp")

    // 属性值存储在map中
    val user = User(
        mapOf(
            "name" to "西哥",
            "age" to 25
        )
    )
    println("name=${user.name} age=${user.age}")

}

interface IGamePlayer {
    fun rank()

    fun upgrade()
}

class MaserGamePlayer : IGamePlayer {
    override fun rank() {
        println("master play rank for you")
    }

    override fun upgrade() {
        println("master play upgrade for you")
    }

}

// 类代理
class NewBeeWithMaster(val player: IGamePlayer) : IGamePlayer by player

// 属性代理
class Test {
    // 属性委托
    var prop: String by Delegate()
}

class Delegate : ReadWriteProperty<Test, String> {
    override fun getValue(thisRef: Test, property: KProperty<*>): String {
        return "name"
    }

    override fun setValue(thisRef: Test, property: KProperty<*>, value: String) {

        println("属性 ${property.name} 设置为：$value")
    }

}

// 延迟属性lazy
// 需要用val 定义？？？

val ppp: String by lazy {
    println("xxxx")
    ""
}

val lazyProp: String by lazy {
    println("Hello，第一次调用才会执行我！")
    "西哥！"
}

// 默认是线程安全的
val lazyProp2: String by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
    println("Hello，第一次调用才会执行我！")
    "西哥！"
}

// 可观察属性
var observableProp: String by Delegates.observable("默认值：xxx") { property, oldValue, newValue ->
    println("property: $property: $oldValue -> $newValue ")
}

// 可观察属性2
var vetoableProp: Int by Delegates.vetoable(0) { _, oldValue, newValue ->
    // 如果新的值大于旧值，则生效
    newValue > oldValue
}

// 属性存储在映射中
class User(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int by map
}





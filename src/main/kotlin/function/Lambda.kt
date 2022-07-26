package function

/**
@Description:
@Author  : fireinrain
@Site    : https://github.com/fireinrain
@File    : Lambda
@Software: IntelliJ IDEA
@Time    : 2022/7/25 6:59 PM
 */

fun main(args: Array<String>) {
    val greeting = { println("hello") }
    greeting()

    // 带参数和返回值
    var add = { a: Int, b: Int -> a + b }
    println(add(1, 2))

    // 高阶函数
    // 函数的参数是其他函数
    fun highOrder(func: (a: Int, b: Int) -> Int, a: Int, b: Int) {
        println("func start")

        println(func(a, b))

        println("func end")
    }

    highOrder({ a, b -> a + b }, 1, 2)

    data class People(val name: String, val age:Int)
    val peoples = listOf<People>(People("xiaoqian",13),People("baibai",16),
                                People("tit",87))

    println(peoples.maxBy { it -> it.age })
    println(peoples.maxBy { it -> it.name.length })

    //it 关键字：用于单参数
    // 在上面的程序中，lambda表达式只接受一个参数（Person对象的列表）。在这种情况下，可以使用关键字 it 来引用参数。
    //
    // 您可以
    //
    // val selectedPerson = people.maxBy({ person -> person.age })
    // 等效于
    //
    // val selectedPerson = people.maxBy({ it.age })
    // 在上面的程序中。

    val people = listOf(
        People("Jack", 34),
        People("Shelly", 19),
        People("Patrick", 13),
        People("Jill", 12),
        People("Shane", 22),
        People("Joe", 18)
    )

    val selectedPerson = people
        .filter(predicate = { it.name.startsWith("S")})
        .maxBy{ it.age }


    println(selectedPerson)
    println("name: ${selectedPerson?.name}" )
    println("age: ${selectedPerson?.age}" )

}
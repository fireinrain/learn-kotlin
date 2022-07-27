package generic

import java.util.Collections.sort

/**
@Description: 泛型
@Author  : fireinrain
@Site    : https://github.com/fireinrain
@File    : Generic
@Software: IntelliJ IDEA
@Time    : 2022/7/27 2:54 PM
 */

class Box<T>(value: T) {
    var value = value
}

fun main(args: Array<String>) {
    val box = Box<Int>(12)
    println(box.value)
    val box1 = Box("xiaoqian")
    val box2 = Box<Double>(12.3)
    printWithType(box1)
    printWithType(box2)
    printWithType(box)
    val arrayListOf = arrayListOf(1, 2, 9, 4)
    println(arrayListOf)
    sort(arrayListOf)
    println(arrayListOf)

    var params1 = listOf<Float>(1.2f, 12.3f)
    val listOf = listOf<Int>(1, 2, 3)
    printInfos(params1)
    printInfos(listOf)
    val listOf1 = listOf<String>("xiaoq", "d")
    printInfos(listOf1)

}

fun <T> printWithType(box: Box<T>) {
    when (box.value) {
        is Int -> println("this is Int")
        is String -> println("this is String")
        else -> println("unsupported type for print")
    }
}

// 多个上界
fun <T> test(list: List<T>, threshold: T): List<T> where T : CharSequence, T : Comparable<T> {
    return list.filter { it > threshold }.map { it }
}

fun <T> printInfos(params: List<out T>) {
    println(params)
}

fun <T : Number> addT(p: T) {
    val listOf = mutableListOf<Number>()
    listOf.add(p)

}

fun <T> sort(list: List<T>) {

}

////Kotlin使用处协变
// fun sumOfList(list: List<out Number>)
//
// //Java上界通配符
// void sumOfList(List<? extends Number> list)
//
// //Kotlin使用处逆变
// fun addNumbers(list: List<in Int>)
//
// //Java下界通配符
// void addNumbers(List<? super Integer> list)
//



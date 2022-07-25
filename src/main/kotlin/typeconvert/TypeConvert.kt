package typeconvert

/**
@Description:
@Author  : fireinrain
@Site    : https://github.com/fireinrain
@File    : TypeConvert
@Software: IntelliJ IDEA
@Time    : 2022/7/25 10:24 AM
 */

fun main(args: Array<String>) {

    // 类型转换
    // 在Kotlin中，一种类型的数值不会自动转换为另一种类型，即使另一种类型更大。这与Java处理数字转换的方式不同

    // java
    // int number = 55
    // long number2 = number  ok

    // kotlin 如果要向上转型 必须要显式的调用
    var number: Int = 13
    var number2: Long = number.toLong()
    println(number2)
    println(number2 is Long)

    //toByte() - 将字符串解析为带符号的字节数，然后返回结果。
    //
    // toShort() - 将 Int 值转换为Short。
    //
    // toInt() - 将字符串解析为Int数字并返回结果。
    //
    // toLong() - 将字符串解析为Long数字并返回结果。
    //
    // toFloat() - 将字符串解析为Float数字并返回结果。
    //
    // toDouble() - 将字符串解析为Double数字并返回结果。
    //
    // toChar() - 将Int值转换为Char。
    //
    // 注意，没有 Boolean 类型的转换。

    // 从较大的类型 转换为 较小的类型
    // 上面提到的函数可以在两个方向上使用（从较大类型到较小类型的转换 以及从较小类型到较大类型的转换）。
    //
    // 但是，从较大的类型到较小的类型的转换可能会截断该值。例如，

    fun main(args: Array<String>) {
        val number1: Int = 545344
        val number2: Byte = number1.toByte()
        println("number1 = $number1")
        println("number2 = $number2")
    }
    main(arrayOf(""))


}
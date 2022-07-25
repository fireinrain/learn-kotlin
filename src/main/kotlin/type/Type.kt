package type

/**
@Description:
@Author  : fireinrain
@Site    : https://github.com/fireinrain
@File    : type
@Software: IntelliJ IDEA
@Time    : 2022/7/24 2:40 PM
 **/


fun main(args: Array<String>) {

    //kotlin 基本数据类型
    // Number 类型
    // Char 类型
    // Boolean 类型
    // Array 数组
    // String 类型

    var size: Byte = 12
    var length: Short = 14159
    var age: Int = 14159
    var bigger: Long = 1434343434333434
    var price: Float = 3.1233232f
    var distance: Double = 3434334.434343

    println("size: $size,length: $length,age: $age,bigger: $bigger,price: $price,distance: $distance")

    /**
     * Char对象有大量的方法 可以方便的操作
     */
    var aChar: Char = 'K'
    println("aChar is: $aChar")
    val charRange = aChar.rangeTo('X')
    charRange.forEach(::println)

    var isAdults: Boolean = false
    if (isAdults) {
        println("you are adult")
    } else {
        println("you are not adult")
    }

    // 数组
    val arrayOf = arrayOf(1, 2, 3, 4)
    println(arrayOf !is Array)
    println(arrayOf is Array)

    var names: Array<String> = arrayOf()
    names.fill("1", 0, names.size)
    names.forEach { println(it) }

    var people: Array<String> = Array(5) { index -> index.toString() }
    people.forEach { println(it) }


}
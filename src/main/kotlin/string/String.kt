package string

/**
@Description: 字符串操作
@Author  : fireinrain
@Site    : https://github.com/fireinrain
@File    : String
@Software: IntelliJ IDEA
@Time    : 2022/7/26 11:40 AM
 */


fun main(args: Array<String>) {
    val name = "xiaoqian"
    println(name[1])

    // b遍历字符串
    for (c in name) {
        println("char: $c")
    }

    // 字符串不可变
    //var myString = "Hey!"
    // myString[0] = 'h'      // Error! Strings

    // 重新指向新字符串
    var age = "12"
    age = "222"

    // 字符串转义
    // 转义的字符串中可能已转义了字符。 例如
    //
    // val myString = "Hey there!\n"
    // 这里，\n 是转义字符，用于在文本中出现的位置插入换行符。
    //
    // 以下是Kotlin支持的转义字符列表：
    //
    // \t -  插入制表符
    //
    // \b - 插入退格符
    //
    // \n - 插入换行符
    //
    // \r - 插入回车符
    //
    // \' - 插入单引号字符
    //
    // \" - 插入双引号字符
    //
    // \\ - 插入反斜杠
    //
    // \$ - 插入美元字符

    // 字符串模板
    val info = """
        name: xiaobai,
        age: 13,
        address: beijin
    """.trimIndent()
    println(info)


    // 打印原始字符串
    //  println("不使用trimMargin函数的输出:")
    //
    //     val myString = """
    //     |Kotlin is interesting.
    //     |Kotlin is sponsored and developed by JetBrains.
    // """
    //     println(myString)
    //
    //     println("使用trimMargin函数输出:\n")
    //     println(myString.trimMargin())

    println("不使用trimMargin函数的输出:")

    val myString = """
    |Kotlin is interesting.
    |Kotlin is sponsored and developed by JetBrains.
"""
    println(myString)

    println("使用trimMargin函数输出:\n")
    println(myString.trimMargin())

    // 带参数的trimMargin
    val myString2 = """
    !!! Kotlin is interesting.
    !!! Kotlin is sponsored and developed by JetBrains.
"""
    println(myString2.trimMargin("!!! "))

    // 字符串模板

    val myInt = 5;
    val myString3 = "myInt = $myInt"

    println(myString3)

    // 字符串常用函数
    val s1 = "Hey there!"
    val s2 = "Hey there!"
    var result: String

    println("s1字符串的长度为 ${s1.length}.")

    result = if (s1.compareTo(s2) == 0) "相等" else "不相等"
    println("字符串s1和s2是 $result.")

    // s1.get(2) 等同于 s1[2]
    println("第三个字符是 ${s1.get(2)}.")

    result = s1.plus(" How are you?") // result = s1 + " How are you?"
    println("result = $result")

    println("子字符串是 \"${s1.subSequence(4, 7)}\"")

    // 比较字符串
    var name1 = "xiaoxiao"
    var name2 = "xiaoxiaO"
    println(name1 == name2)
    println(name1.compareTo(name2, true))
    // compareTo = 0 标识字符串相等
    // <0 表示a<b
    // >0 表示 a>b

    // 字符串替换
    var infos = "beijing ditie"
    println(infos.replace("beijin", "tianjian", true))

    // 字符串切割
    val split = infos.split(" ")
    println(split)
    val split1 = infos.split(Regex("ing|ti"))
    println(split1)
    println(split1 is List<String>)

}

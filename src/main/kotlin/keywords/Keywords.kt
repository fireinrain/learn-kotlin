package keywords

/**
@Description:
@Author  : fireinrain
@Site    : https://github.com/fireinrain
@File    : Keywords
@Software: IntelliJ IDEA
@Time    : 2022/7/25 11:41 AM
 */

fun main(args: Array<String>) {
    var name = "xiaoqian"

    // Kotlin关键字列表
    // as	break	class	continue	do	else
    // false	for	fun	if	in	interface
    // is	null	object	package	return	super
    // this	throw	true	try	typealias	typeof
    // val	var	when	while
    // 这些关键字称为 硬关键字。


    //软关键字
    // 除了这28个硬关键字，Kotlin中还有许多软关键字。软关键字仅在特定上下文中被视为关键字。例如，
    //
    // 当您将类的成员设为public时，public充当关键字。
    //
    // class TestClass {
    //     public val name = "Kotlin"
    // }
    // 在这里，public充当关键字。
    //
    // 您也可以创建一个名为 public 的变量。
    //
    // val public = true
    // 这里 public 是一个布尔变量。
    //
    // Koltin中的一些软变量有：override、private、field等


    //Kotlin 标识符
    // 标识符是为变量，类，方法等提供的名称。例如：
    //
    // var salary = 7789.3
    // 这里，var是一个关键字，salary是给定给变量（标识符）的名称。
    //
    // 以下是在Kotlin中命名变量（标识符）的规则和约定：
    //
    // 标识符以字母或下划线开头，后跟零，字母和数字。
    //
    // 不允许使用空格。
    //
    // 标识符不能包含符号，如@，#等
    //
    // 标识符区分大小写。
    //
    // 创建变量时，请选择一个有意义的名称。例如 score、number、level 比变量名（如s、n和l）更有意义，尽管 s、n和l 它们也是有效的。
    //
    // 如果选择一个具有多个单词的变量名，请对第一个单词使用所有小写字母，并在每个后续单词中使用大写字母。例如，speedLimit。




    //Kotlin 运算符重载
    // 在本文中，您将通过示例学习有关运算符重载的内容（定义运算符如何为用户定义的类型(如对象)工作）。
    //
    // 在Kotlin中使用operator时，将调用它的相应成员函数。 例如，表达式a + b在后台转换为a.plus(b)。
    //
    // 示例
    // fun main(args: Array<String>) {
    //     val a = 5
    //     val b = 10
    //
    //     print(a.plus(b)) // print(a+b)
    // }
    // 运行该程序时，输出为：
    //
    // 15
    // 实际上，plus()函数被重载以处理各种Kotlin基本类型和String（字符串）。
    //
    // // + 基本类型的运算符
    // operator fun plus(other: Byte): Int
    // operator fun plus(other: Short): Int
    // operator fun plus(other: Int): Int
    // operator fun plus(other: Long): Long
    // operator fun plus(other: Float): Float
    // operator fun plus(other: Double): Double
    //
    // //用于字符串连接
    // operator fun String?.plus(other: Any?): String
    // 您还可以通过重载相应的函数来定义运算符对对象的工作方式。 例如，您需要通过重载plus()函数来定义+运算符对对象的工作方式。
    //
    // 示例：重载+运算符
    // 示例
    // fun main(args: Array<String>) {
    //     val p1 = Point(3, -8)
    //     val p2 = Point(2, 9)
    //
    //     var sum = Point()
    //     sum = p1 + p2
    //
    //     println("sum = (${sum.x}, ${sum.y})")
    // }
    //
    // class Point(val x: Int = 0, val y: Int = 10) {
    //
    //     //重载 plus 函数
    //     operator fun plus(p: Point) : Point {
    //         return Point(x + p.x, y + p.y)
    //     }
    // }
    // 运行该程序时，输出为：
    //
    // sum = (5, 1)
    // 在此，plus()函数用 operator 关键字标记，以告知编译器 + 运算符正在重载。
    //
    // 表达式 p1 + p2 在后台转换为 p1.plus(p2)。
    //
    // 示例：- 运算符重载
    // 在此示例中，您将学习重载 - 运算符。表达式 --a 在后台转换为 a.dec()。
    //
    // dec()成员函数不带任何参数。
    //
    // 示例
    // fun main(args: Array<String>) {
    //     var point = Point(3, -8)
    //     --point
    //
    //     println("point = (${point.x}, ${point.y})")
    // }
    //
    // class Point(var x: Int = 0, var y: Int = 10) {
    //     operator fun dec() = Point(--x, --y)
    // }
    // 当您运行该程序时，输出将是：
    //
    // point = (2, -9)
    // 请记住，
    //
    // operator fun dec() = Point(--x, --y)
    // 相当于
    //
    // operator fun dec(): Point {
    //     return Point(--x, --y)
    // }
    // 注意几个要点
    // 1、重载运算符时，应尝试保持运算符的原始作用。例如，
    //
    // 示例
    // fun main(args: Array<String>) {
    //     val p1 = Point(3, -8)
    //     val p2 = Point(2, 9)
    //
    //     var sum = Point()
    //     sum = p1 + p2
    //
    //     println("sum = (${sum.x}, ${sum.y})")
    // }
    //
    // class Point(val x: Int = 0, val y: Int = 10) {
    //
    //     //重载plus函数
    //     operator fun plus(p: Point) = Point(x - p.x, y - p.y)
    // }
    // 尽管上面的程序在技术上是正确的，但我们使用 + 运算符减去了两个对象的相应属性，这使程序变得混乱。
    //
    // 2、与Scala之类的语言不同，Kotlin中只能重载一组特定的运算符。




    //Kotlin 按位和移位操作
    // Kotlin提供了几种函数（以 infix 形式）来执行按位和移位操作。在本文中，您将借助示例学习在Kotlin中执行位级操作。
    //
    // 仅在两种整数类型(Int和Long)上使用按位运算符和位移位运算符来执行位级运算。
    //
    // 为了执行这些操作，Kotlin提供了7个使用中缀符号的函数。
    //
    // 按位或 (or)
    // or函数比较两个值的相应位。如果两个位中的任何一个为1，则为1。否则为0。例如，
    //
    // 12 = 00001100 (二进制)
    // 25 = 00011001 (二进制)
    //
    // 12和25的按位或运算
    //    00001100 or
    //    00011001
    //    ________
    //    00011101  = 29 (十进制)
    // 示例：按位或运算
    // 示例
    // fun main(args: Array<String>) {
    //
    //     val number1 = 12
    //     val number2 = 25
    //     val result: Int
    //
    //     result = number1 or number2   // result = number1.or(number2)
    //     println(result)
    // }
    // 运行该程序时，输出为：
    //
    // 29
    // 按位与(and)
    // and 函数比较两个值的相应位。如果两个位都为1，则求值为1。如果两个位中的任意一个为0，则求值为0。例如，
    //
    // 12 = 00001100 (二进制)
    // 25 = 00011001 (二进制)
    //
    // 12和25的按位与运算
    //    00001100 and
    //    00011001
    //    ________
    //    00001000  = 8 (十进制)
    // 示例：按位与运算
    // 示例
    // fun main(args: Array<String>) {
    //
    //     val number1 = 12
    //     val number2 = 25
    //     val result: Int
    //
    //     result = number1 and number2   // result = number1.and(number2)
    //     println(result)
    // }
    // 运行该程序时，输出为：
    //
    // 8
    // 按位异或(xor)
    // xor函数比较两个值的相应位。如果相应的位不同，则为1。如果相应的位相同，则为0。例如，
    //
    // 12 = 00001100 (二进制)
    // 25 = 00011001 (二进制)
    //
    // 12和25的按位异或运算
    //    00001100 xor
    //    00011001
    //    ________
    //    00010101  = 21 (十进制)
    // 示例：按位异或运算
    // 示例
    // fun main(args: Array<String>) {
    //
    //     val number1 = 12
    //     val number2 = 25
    //     val result: Int
    //
    //     result = number1 xor number2   // result = number1.xor(number2)
    //     println(result)
    // }
    // 运行该程序时，输出为：
    //
    // 21
    // 按位非  inv()
    // inv()函数按位非。它使每个0 到 1，以及每个 1 到 0。
    //
    // 35 = 00100011 (二进制)
    //
    // 35的按位补码运算
    //   00100011
    //   ________
    //   11011100  = 220 (十进制)
    // 示例：按位补码
    // 示例
    // fun main(args: Array<String>) {
    //
    //     val number = 35
    //     val result: Int
    //
    //     result = number.inv()
    //     println(result)
    // }
    // 运行该程序时，输出为：
    //
    // -36
    // 我们为什么要输出 -36 代替 220？
    //
    // 这是因为编译器显示了该数字的2的补码。二进制数的负号。
    //
    // 对于任何整数n，n的2的补数将为-（n + 1）。
    //
    //  Decimal         Binary                      2's complement
    // ---------       ---------          ---------------------------------------
    // 0             00000000          -(11111111+1) = -00000000 = -0(decimal)
    // 1             00000001          -(11111110+1) = -11111111 = -256(decimal)
    // 12            00001100          -(11110011+1) = -11110100 = -244(decimal)
    // 220           11011100          -(00100011+1) = -00100100 = -36(decimal)
    //
    // Note: Overflow is ignored while computing 2's complement.
    // 35的按位补码为220（十进制）。220的2的补码是-36。因此，输出是-36而不是220。
    //
    // 左移运算符 (shl)
    // shl函数将位模式向左移动一定数量的指定位，并且零位被移到低位位置。
    //
    // 212 (二进制: 11010100)
    //
    // 212 shl 1 evaluates to 424 (二进制: 110101000)
    // 212 shl 0 evaluates to 212 (二进制: 11010100)
    // 212 shl 4 evaluates to 3392 (二进制: 110101000000)
    // 示例：按位左移
    // 示例
    // fun main(args: Array<String>) {
    //     val number = 212
    //
    //     println(number shl 1)
    //     println(number shl 0)
    //     println(number shl 4)
    // }
    // 运行该程序时，输出为：
    //
    // 424
    // 212
    // 3392
    // 右移运算符(shr)
    // shr函数将位模式向右移位指定位数。
    //
    // 212 (二进制: 11010100)
    //
    // 212 shr 1 计算为 106 (二进制: 01101010)
    // 212 shr 0 计算为 212 (二进制: 11010100)
    // 212 shr 8 计算为 0 (二进制: 00000000)
    // 如果该数字是2的补号，则将标志位移到高位位置。
    //
    // 示例
    // fun main(args: Array<String>) {
    //     val number = 212
    //
    //     println(number shr 1)
    //     println(number shr 0)
    //     println(number shr 8)
    // }
    // 当您运行该程序时，输出将是：
    //
    // 106
    // 212
    // 0
    // 无符号右移运算符(ushr)
    // ushr函数将零移位到最左边的位置。
    //
    // 示例：有符号和无符号右移
    // 示例
    // fun main(args: Array<String>) {
    //     val number1 = 5
    //     val number2 = -5
    //
    //     //有符号右移
    //     println(number1 shr 1)
    //
    //     //无符号右移
    //     println(number1 ushr 1)
    //
    //     //有符号右移
    //     println(number2 shr 1)
    //
    //     //无符号右移
    //     println(number2 ushr 1)
    // }
    // 运行该程序时，输出为：
    //
    // 2
    // 2
    // -3
    // 2147483645
    // 注意，对于2的补码，有符号右移函数和无符号右移函数的工作方式是不同的。
    //
    // 2147483645的2的补码是3。
}
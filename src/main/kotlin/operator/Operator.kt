package operator

/**
@Description: 运算符
@Author  : fireinrain
@Site    : https://github.com/fireinrain
@File    : operator
@Software: IntelliJ IDEA
@Time    : 2022/7/25 9:42 AM
 */

fun main(args: Array<String>) {

    // 算术运算符
    /**
     * + - * / %
     */
    var number1 = 12.5
    var number2 = 3.5
    var result: Double

    result = number1 + number2
    println("number1 + number2 = $result")

    result = number1 - number2
    println("number1 - number2 = $result")

    result = number1 * number2
    println("number1 * number2 = $result")

    result = number1 / number2
    println("number1 / number2 = $result")

    result = number1 % number2
    println("number1 % number2 = $result")

    // 字符串拼接
    var name = "xiaobai"
    var age = 18
    var address = "beijing"
    var info: String = name + age + address
    println("personal info: $info")

    // 算术符重载

    /**
     * // + 基本类型的运算符
    operator fun plus(other: Byte): Int
    operator fun plus(other: Short): Int
    operator fun plus(other: Int): Int
    operator fun plus(other: Long): Long
    operator fun plus(other: Float): Float
    operator fun plus(other: Double): Double

    // 对字符串串联
    operator fun String?.plus(other: Any?): String
     */
    var prince1: Int = 13
    var prince2: Int = 14
    var all = prince1 + prince1
    all = prince1.plus(prince2)
    println("all = $all")

    // 赋值运算符
    /**
     *
    a + = b	a = a + b	a.plusAssign(b)
    a-= b	a = a-b	a.minusAssign(b)
    a * = b	a = a * b	a.timesAssign(b)
    a / = b	a = a / b	a.divAssign(b)
    a％= b	a = a％b	a.modAssign(b)
     */
    // 以上依然是通过运算符重载的方法 调用类型实际的方法来实现的

    var height: Int = 130
    height += 10
    println("height = $height")
    // 貌似废弃了
    // height.plusAssign(1)

    // 一元前缀 和 递增/递减运算符
    // +	一元加	+a	a.unaryPlus()
    // -	一元减	-a	a.unaryMinus()
    // ！	不是（反转值）	！a	a.not()
    // ++	递增：值加1	++a	a.inc()
    // --	递减：值减1	--a a.dec()

    val a = 1
    val b = true
    var c = 1

    var result2: Int
    var booleanResult: Boolean

    result2 = -a
    println("-a = $result")

    booleanResult = !b
    println("!b = $booleanResult")

    --c
    println("--c = $c")

    // 比较运算符 和 相等运算符
    // >	大于	a> b	a.compareTo(b)> 0
    // <	小于	a <b	a.compareTo(b)<0
    // >=	大于 或 等于	a> = b	a.compareTo(b)>= 0
    // <=	小于 或 等于	a <= b	a.compareTo(b)<= 0
    // ==	等于	a == b	a?.equals(b)?:(b === null)
    // ！=	不等于	a！= b	!(a?.equals(b)?:(b ===null))

    var age1 = 18
    var age2 = 30
    if (age1 >= age2) {
        println("age1 is bigger than age2")
    }

    // 逻辑运算符
    // || &&
    /**
     *
    ||	如果任一布尔表达式为true，则为true  (a>b)||(a<c)	(a>b)or(a<c)
    &&	如果所有布尔表达式均为true，则为true	(a>b)&&(a<c)	(a>b)and(a<c)
     */

    val a1 = 10
    val b1 = 9
    val c1 = -1
    val result3: Boolean

    // result 为 true 是最大
    result3 = (a1 > b1) && (a1 > c1) // result = (a>b) and (a>c)
    println(result3)

    var result4 = (a1 < b1) and (a1 < c1)
    println(result4)

    var result5 = (a1 > b1) or (a1 > c1)
    println(result5)
    // result

    // in 运算符
    /**
     *
     in  a in b	  b.contains(a)
    !in  a !in b  !b.contains(a)
     *
     */
    var ages = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    if (3 in ages){
        println("3 in ages")
    }else{
        println("3 not in ages")
    }
    // 索引访问运算符
    // a[i]	a.get(i)
    // a[i, n]	a.get(i, n)
    // a[i1, i2, ..., in]	a.get(i1, i2, ..., in)
    // a[i] = b	a.set(i, b)
    // a[i, n] = b	a.set(i, n, b)
    // a[i1, i2, ..., in] = b	a.set(i1, i2, ..., in, b)

    val ac  = intArrayOf(1, 2, 3, 4, - 1)
    println(ac[1])
    ac[1]= 12
    println(ac[1])

    // // invoke 运算符
    // a()	a.invoke()
    // a(i)	a.invoke(i)
    // a(i1, i2, ..., in)	a.inkove(i1, i2, ..., in)
    // a[i] = b	a.set(i, b)

    // 按位运算
    // 与Java不同，Kotlin中没有按位和移位运算符。为了执行这些任务，使用了各种功能（支持中缀符号）：
    //
    // shl - 签名左移
    //
    // shr - 右移签名
    //
    // ushr - 无符号右移
    //
    // and - 按位与
    //
    // or - 按位或
    //
    // xor - 按位异或
    //
    // inv - 按位反
    println(0b00000001)
    println(0b00000010)
    println(1 and 2)
    println(1 or 2)
    println(1 shl 2) // java  1 << 2

    // 注意kotlin 中没有三元运算符  java：a : b ? c

}
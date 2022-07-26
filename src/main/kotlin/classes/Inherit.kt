package classes

import JavaPeople

/**
@Description:
@Author  : fireinrain
@Site    : https://github.com/fireinrain
@File    : Inherit
@Software: IntelliJ IDEA
@Time    : 2022/7/26 6:29 PM
 */

class Inherit {
}

open class APeople(age:Int)

class MathTeacher(age:Int):APeople(age)

class FootballPlayer(age: Int):APeople(age)

class BusinessMan(age: Int):APeople(age)

fun main(args: Array<String>) {
    val mathTeacher = MathTeacher(13)
    println(mathTeacher is APeople)

    val footballPlayer = FootballPlayer(18)
    println(footballPlayer is APeople)

    val businessMan = BusinessMan(40)
    println(businessMan is APeople)

    // 调用java代码 但是需要保证 java代码需要在与kotlin目录同级的java目录下
    val javaPeople = JavaPeople("xiaoqian", 18)
    println(javaPeople)
}
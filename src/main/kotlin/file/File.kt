package file

import interfaces.MyInterface
import java.io.File

/**
@Description:
@Author  : fireinrain
@Site    : https://github.com/fireinrain
@File    : File
@Software: IntelliJ IDEA
@Time    : 2022/8/9 1:51 AM
 */

fun main(args: Array<String>) {
    val file = File("/Users/sunrise/CodeGround/IdeaProjects/learn-kotlin/README.md")
    val readText = file.readText()
    println("file content: $readText")


    val readBytes = file.readBytes()
    println(readBytes)
    readBytes.forEach { println(it.toInt().toChar()) }

    val c: Char = 'c'
    var i: Int = 'c'.code
    println("===============$c")
    file.readText().forEach {
        println(it)
    }

    file.forEachLine {
        println(it)
    }

    val myFile: MyFile = MyFile("xiaoqian", 120)
    println("my file: ${myFile.fileName}, createTime: ${myFile.createTime}")
    myFile.createTime = 300
    println("my file now createTime: ${myFile.createTime}")

}


class MyFile {
    lateinit var fileName: String;
    var createTime: Int = 0
        get() {
            return field
        }
        set(value) {
            if (value > 100) {
                field = value - 100
            }
        }

    constructor(fileName: String, createTime: Int) {
        this.fileName = fileName
        this.createTime = createTime
    }
}
package file

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
}
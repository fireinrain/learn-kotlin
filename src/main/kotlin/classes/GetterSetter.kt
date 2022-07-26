package classes

/**
@Description:
@Author  : fireinrain
@Site    : https://github.com/fireinrain
@File    : GetterSetter
@Software: IntelliJ IDEA
@Time    : 2022/7/26 5:33 PM
 */

class GetterSetter {
    var name = "GG"
        get() = field
        set(value) {
            if(value.startsWith("xiao")){
                field = value.replace("xiao","diao")
            }else{
                field = value.uppercase()
            }
        }

    override fun toString(): String {
        return "GetterSetter(name='$name')"
    }


}

fun main(args: Array<String>) {
    val getterSetter = GetterSetter()
    println(getterSetter.name)

    getterSetter.name = "xiaobai"
    println(getterSetter.name)


}
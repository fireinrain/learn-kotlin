package prepare


fun main(args: Array<String>) {

    if (args.isEmpty()){
        println("there is no args passed to program")
    }else{
        println("args is: ")
        args.forEach { println(it) }
    }

    println("Hello World, I love kotlin!")
}
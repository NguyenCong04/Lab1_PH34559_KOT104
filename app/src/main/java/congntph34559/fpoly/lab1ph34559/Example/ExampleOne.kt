package congntph34559.fpoly.lab1ph34559.Example



fun printMessenger(messenger:String){
    println(messenger);
}

fun sum(a:Int, b:Int):Int {
    return a+b
}

fun  multiply(a:Int, b:Int) = a * b;


fun main() {
    println("Hello Example One")
    println("-------Functions---------")

    //function messenger
    printMessenger("Function messenger")
    println("Sum: ${sum(2,5)}")
    println("Multiply: ${multiply(2,5)}")


}
package congntph34559.fpoly.lab1ph34559.Example

fun main() {
    println("Hello Example Ten Conditional Expression")
    println("--------------------------------------")

    fun checkMax(a:Int,b:Int):Int {
        return if(a > b) a else b
    }
    fun checkMax2(a:Int,b:Int):String = if(a > b) "Số lớn hơn là a: $a" else "Số lớn hơn là b: $b"



    println(checkMax(99,23))
    println(checkMax2(10,30))
    println(checkMax2(20,5))

}
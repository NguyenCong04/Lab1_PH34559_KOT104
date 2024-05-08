package congntph34559.fpoly.lab1ph34559.Example


fun case(obj:Any){
    when(obj){
        1-> println("Hello Example Five")
        is Long -> println("is a Long")
        !is String -> println("is not a number")
        "Hi"-> println("Hi ne ne")
        else -> println("Unknown")
    }
}


fun main() {

    println("Hello Example Five When")
    println("-----------------------")
    case("kk")
    case(1)
    case(0L);
    case("Hi")

}
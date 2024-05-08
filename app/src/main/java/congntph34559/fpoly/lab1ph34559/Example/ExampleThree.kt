package congntph34559.fpoly.lab1ph34559.Example

class Role(val id:Int, val email:String)


class Customer( val id:Int,  val name:String){
    init {
        println("id: $id -- name: $name");
        println("Name customer: $name")
    }

}


fun main() {
    println("Hello Example Three Classes")
    println("---------------------------")

    val role = Role(1,"congntph34559@fpt.edu.vn")
    println("Email role: ${role.email}")

    Customer(1,"Nam")



}
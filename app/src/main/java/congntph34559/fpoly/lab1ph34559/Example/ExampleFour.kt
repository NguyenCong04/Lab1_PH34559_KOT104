package congntph34559.fpoly.lab1ph34559.Example


open class  Dog {
    open fun sayHello() {
        println("Wow woe!!")
    }
}
class Yorkshire: Dog(){
    override fun sayHello() {
        println("No no!!");
    }
}


fun main() {

    val dog2 = Dog();
    dog2.sayHello();

    val dog:Dog = Yorkshire();
    dog.sayHello();



}
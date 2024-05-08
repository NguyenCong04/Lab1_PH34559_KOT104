package congntph34559.fpoly.lab1ph34559.Example


fun case2(obj:Any){
    when(obj){
        1-> println("You choose Fun one")
        2-> println("You choose Fun two")
        3-> println("You choose Fun three")
        4-> println("You choose Fun four")

        else-> println("Unknown")
    }
}


fun main() {
    while (true){
        print("Please choose case is a number 1->4 choose 0 exit: ")
        val number: Int? = readLine()?.toInt();
        if (number == 0){
            println("Exit successfully");
            break
        }else if (number != null) {
            case2(number)
        }else{
            println("Number is empty")
        }
    }



}
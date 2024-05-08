package congntph34559.fpoly.lab1ph34559

fun main() {

    var a = 0.0
    var b = 0.0

//    print("Mời nhập số a: ")
//    var s = readLine();
//    if (s != null) a = s.toDouble()
//
//    print("Mời nhập số b: ")
//    s = readLine();
//    if (s != null) b = s.toDouble();

    while (true){
        print("Mời nhập số a: ");
        val s = readLine();
        if (s != null && s.toDoubleOrNull() != null) {// kiểm tra nếu nhập từ bàn phím nếu là số thì break khỏi vòng lặp
            a = s.toDouble();
            break;
        }else{
            println("Số a không hợp lệ, mời nhập lại !")
        }
    }

    while (true){
        print("Mời nhập số b: ");
        val s = readLine();
        if (s != null && s.toDoubleOrNull() != null) {
            b = s.toDouble();
            break;
        }else{
            println("Số b không hợp lệ, mời nhập lại !")
        }
    }




    println("Tổng: ${a+b}")
    println("Hiệu: ${a-b}")
    println("Tích: ${a*b}")
    println("Thương: ${a/b}")

}
package congntph34559.fpoly.lab1ph34559.Example





fun main() {

    println("Hello Example Eight Ranges")
    println("--------------For, If-------------")

    print("Các số từ 1->5: ")
    for (i in 1..5){//các số từ 1->5 có lấy cả số 5
        print(i);
    }
    println("")
    print("Các số từ 1->5 không lấy 5: ")
    for (i in 1 until 5){//không lấy số 5
        print(i)
    }
    println("")
    print("Các số từ 1->9 với bước nhảy là 2: ")// 13579
    for (i in 1..9 step 2){
        print(i)
    }
    println("")
    print("Các số từ 4 về 1: ")// 4321
    for (i in 4 downTo 1){
        print(i)
    }
    println("")
    print("Ký tự từ a->e: ")
    for (str in 'a'..'e'){
        print(str)
    }
    println("")
    print("Ký tự từ e->a: ")
    for (str in 'e' downTo 'a'){
        print(str)
    }

}
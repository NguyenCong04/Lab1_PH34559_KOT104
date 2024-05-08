package congntph34559.fpoly.lab1ph34559.Example

fun main() {

    //setOf không cho phép trùng lặp phần tử còn
    // listOf cho phép trung lặp phần tử

    var arr1 = setOf("Dev","Test","Design","Dev");
    var arr2 = setOf("Test","Dev","Design","Dev");
    var arr3 = listOf("Test","Dev","Design","Dev");

    println("Array1Set: $arr1");
    println("Array2List: $arr2");
    println("Array3List: $arr3");


    println(arr1 == arr2); // So sánh tương đối
    println(arr1 === arr2);// so sánh tuyệt đối



}
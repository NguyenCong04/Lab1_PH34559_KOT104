package congntph34559.fpoly.lab1ph34559.Example

fun describeString(maybeString: String?):String{
//    if (maybeString != null){
//        return  "String of length ${maybeString.length}"
//    }else{
//        return  "Empty or not null"
//    }

//    return if (maybeString != null){
//        "String of length ${maybeString.length}"
//    }else{
//        "Empty or not null"
//    }

    return if (maybeString != null) "String of length ${maybeString.length}" else "Empty or not null"
}


fun main() {

    println("Hello Example Two Working with Nulls")
    println("------------------------------------")

    println(describeString("Hello word"))
    println(describeString(null))


}
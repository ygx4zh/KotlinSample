package com.example

/**
 函数
 */

fun main(args: Array<String>) {

    var fun_1 = {x:Int, y:Int  -> x + y};
    // var fun_2 = x:Int, y:Int  -> x+y;    // 非法写法
    var fun_2:(Int, Int) -> Int = {x, y -> x + y};

    println("${add(5,9)}\n${add2(5,9)}\n${fun_1(5,9)}\n${fun_2(5,9)}")

    println(fun_2)

}

fun add(x:Int, y:Int):Int{
    return x + y;
}

// fun add2(x:Int, y:Int):Int return x + y; //非法写法
fun add2(x:Int, y:Int):Int = x+y;

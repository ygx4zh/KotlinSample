package com.example

fun test(){
    println("test");
}

fun main(args:Array<String>)
{
    println("hello wtf");
    val name = "YGX";
    val age = 26;
    println("name is :$name, and age is: $age");
    println("------------------------------------------");

    var max_value:Byte = Byte.MAX_VALUE;
    var min_value:Byte = Byte.MIN_VALUE;
    // max is 127, and min is -128
    println("max is $max_value, and min is $min_value");
    println("---------------------------------------------")
    var num = 0xFF;
    num+= 17;
    num += 0b10;
    println(num)
    test();
    test2();
}

fun test2():Unit    // Unit相当于java的void, 无返回值类型
{
    println("this is test2 function")
}

// String? 表示返回值可以为null
fun test2(num:String):String?    // Unit相当于java的void, 无返回值类型
{
    println("this is test2 function")
    return null;
}
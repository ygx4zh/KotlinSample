package com.example

fun main(args:Array<String>)
{
    var b:Boolean = false;
    /*var i = 3;*/
    if(b)
    {
        println("true")
    }else
    {
        println("false")
    }

    //  不支持三元运算表达式
    //  println("2... "+(i % 2 == 0 ? "true" : "false"));
    var abs = Math.abs(-2)
    println("abs: $abs");
}
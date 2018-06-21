package com.example

/*
人机交互
 */

fun main(args:Array<String>)
{
    println("请输入第一个数:");
    var num1 = readLine();
    println("请输入第二个数:");
    var num2 = readLine();
    println("num1:$num1, num2:$num2");

    /*var i1 = num1?.toInt()
    var i2 = num2?.toInt()
    println("i1:$i1, i2:$i2");
    */

    /**
     * num1!!的意思就是保证变量为合法的str num, 其实作用就相当于忽视警告
     */
    var i1 = num1!!.toInt();
    var i2 = num2!!.toInt();
    println("i1:$i1, i2:$i2");
    /**
     * 请输入第一个数:
    1
    请输入第二个数:

    Exception in thread "main" java.lang.NumberFormatException: For input string: ""
    at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
    at java.lang.Integer.parseInt(Integer.java:592)
    at java.lang.Integer.parseInt(Integer.java:615)
    at com.example.Test11Kt.main(Test11.kt:16)
    num1:1, num2:
     */
}
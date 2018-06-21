package com.example

fun main(args:Array<String>)
{
    var num2ChineseNum = num2ChineseNum(6)
    println(num2ChineseNum)

    printGrade(10);
}

fun num2ChineseNum(num:Int):String
{
    var c_num = when(num){
        1 -> "一"
        2 -> "二"
        3 -> "三"
        4 -> "四"
        5 -> "五"
        6 -> "六"
        7 -> "七"
        else -> "未知"
    }
    return c_num;
}

fun printGrade(num:Int)
{
    when(num)
    {
        10 -> println("Prefect!")
        8,9 -> println("Greate!")
        6,7 -> println("Good!")
        else -> println("Bad!")
    }
}
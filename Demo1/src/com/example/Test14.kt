package com.example

/**
 * 面向对象
*/

class Rect(var h:Int, var w:Int)

fun main(args: Array<String>) {
    var rect = Rect(10, 20)
    println("矩形的宽:${rect.h}, 宽:${rect.w}");
}
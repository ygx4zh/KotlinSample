package com.example

val PI = 3.1415F;

// 这里的piFloat = PI是默认参数
fun area(pi:Float = PI, radius:Float) :Float = pi * radius;

fun main(args:Array<String>)
{
    // 这种指定了radius = 12F的方式叫聚名参数

    var area = area(radius = 12F)
    println(area)

    num2str(10)
}

fun num2str(num:Int)
{
    var a = "13";
    var b = 13;

    println("$a, $b")

    a = b.toString();   // 把b数字转换成自负传放入a里面
    println("$a, $b")
    b = a.toInt();      // 把a自负传转换成数字放入b里面
    println("$a, $b")
    var c = "a3";
    b = c.toInt();  // 抛出NumberFormatException异常;

    /*
    * Exception in thread "main" java.lang.NumberFormatException: For input string: "a3"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:580)
	at java.lang.Integer.parseInt(Integer.java:615)
	at com.example.Test10Kt.num2str(Test10.kt:30)
	at com.example.Test10Kt.main(Test10.kt:15)
    * */
}
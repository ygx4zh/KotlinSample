package com.example

fun main(args:Array<String>){

    println(plus(23, 35));  // 58
    sayHello("YGX");
    var checkAge = checkAge(26)
    println("checkAge: ${checkAge}");
    val ERROR = 5;
    saveLog(ERROR)
}

fun plus(a:Int,b:Int):Int{
    return a + b;
}

fun sayHello(name:String){
    println("hello: $name")
}

fun checkAge(age:Int):Boolean{
    return age > 18;
}

fun saveLog(level:Int){
    println("level $level")
}
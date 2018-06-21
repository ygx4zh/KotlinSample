package com.example

/**
 字符串模板
 */

fun main(args:Array<String>)
{
    var format_str = format_str("YGX", "XGY");
    println(format_str)

    println("max value: ${max(10,20)}");
    println(str("FUCK YOU"));
}

fun format_str(args1:String, args2:String):String{
    return "{\"args1\":$args1,\"args2\":$args2}";
}

fun max(args:Int, args2: Int):Int{
    if(args > args2) return args else return args2;
}

fun str(args:String):String{
    return "{\"value\":$args, \"len\":${args.length}}";
}
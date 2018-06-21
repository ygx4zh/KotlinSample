package com.example.extendsdemo

sealed class YinZhangClass(var type:String) {

    open fun say(){
        println(type)
    }

    class Son1:YinZhangClass("son1");
    class Son2:YinZhangClass("son2");
}

fun main(args: Array<String>) {
    YinZhangClass.Son1().say();
    YinZhangClass.Son2().say();

    var map = HashMap<Int, String>();
    map[1] = "haha";
    map[2] = "xixi";
    map[1] = "hehe";

    // action: (Map.Entry<K, V>) -> Unit): Unit
    //  var fun_1 = {x:Int, y:Int  -> x + y};
    //    // var fun_2 = x:Int, y:Int  -> x+y;    // 非法写法
    //    var fun_2:(Int, Int) -> Int = {x, y -> x + y};
    // var fun_2:(Int, String) -> Unit = {x, y -> x + y};

    val action: (Map.Entry<Int, String>) -> Unit = {entry ->
        println("${entry.key}, ${entry.value}")};
    map.forEach(action);
}
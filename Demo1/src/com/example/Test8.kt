package com.example

import java.util.*

fun main(args: Array<String>) {
    // list 集合
    var list = listOf("haha",2.9,"ygx");

    // 规范写法, 参数一是索引, 参数二是元素, 不管参数名
    for ((index2,index) in list.withIndex() ){
        println("$index, $index2");
    }

    var map = TreeMap<String, String>();
    map["好"] = "good";
    map["学习"] = "study";
    map["天"] = "day";
    map["向上"] = "up";
    for (e in map){
        println("${e.key}, ${e.value}")
    }

}
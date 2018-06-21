package com.example.extendsdemo

/**
 * open关键字; open标识的类表示这个Class可以被继承
 */
open class Person{
    var charactor:String = "内向";

    open fun action(){
        println("大声说话没礼貌")
    }
}
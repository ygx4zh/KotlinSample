package com.example

import java.math.BigInteger

/**
 * 异常处理
 */
fun main(args: Array<String>) {

    var s = readLine()
    try{
        var toInt = s!!.toInt()
        println(toInt)
    }catch (e:Exception){
        println("转换出错")
    }

    // loop()
    println(digui(5))
    println(digui( BigInteger("20")))

}

/**
 * while 循环
 */
fun loop(){
    while (true){
        println("请输入数字, 输入非数字数据退出循环!")
        var line = readLine()
        println(line)
        try {
            line!!.toInt();
        }catch (e:Exception){

            break
        }
    }
}

fun digui(num:Int):Int{
    if(num <= 1) return num;
    else return digui(num - 1) * num;
}

fun digui(num:BigInteger):BigInteger{
    if (num == BigInteger.ONE) return BigInteger.ONE;
    else return digui(num- BigInteger.ONE) * num;
}
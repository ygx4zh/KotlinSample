package com.example

/**
 * 静态和行为
 *
 * 背包(太阳水) 属性 静态
 * 技能(灵魂火狐) 行为 动态
 */

class Girl(var name:String, var age:Int){
    fun smile(){
        println("妹子笑了一下, 么么哒")
    }

    fun cry(){
        println("wuwuwu !!!")
    }

    /**
     * 外部调用者调用不了
     */
    private fun xizao(){
        println("洗澡")
    }
}

fun main(args:Array<String>){
    var girl = Girl("who", 20)
//    println()
    girl.smile();
    girl.cry();
}
package com.example.extendsdemo

/**
 * 枚举
 */
enum class Week {
    MONDAY, T_D, W_D, T_D_4, F_D, S_D, SUN_DAY
}

fun main(args: Array<String>) {
    println("${Week.F_D.ordinal}, ${Week.F_D.name}")
}
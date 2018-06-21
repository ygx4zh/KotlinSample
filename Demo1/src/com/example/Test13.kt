package com.example

fun main(aggs:Array<String>){
    var area1 = calc_Area(3.14F, 10F);

    // 具名参数 radius = 10F
    var area2 = calc_Area(radius = 10F);

    var area3 = calcArea(10F);
    println("area:${area1}, area2: ${area2}, area: $area3{");
}

/**
 具名参数和默认参数
 */
// 默认参数PI:fLOAT=3.1415F;
fun calc_Area(PI:Float = 3.1415F, radius:Float):Float{
    return PI * radius;
}

fun calcArea(radius:Float):Float{
    return radius * 3.14F;
}
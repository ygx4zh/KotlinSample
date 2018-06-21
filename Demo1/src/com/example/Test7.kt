package com.example

fun main(args: Array<String>) {
    // 区间
    var nums = 1 .. 100;// 代表区间, 1到100
    var sum:Int = 0;

    // for循环, in关键字
    for (num in nums){
        sum += num;
    }
    println(sum);

    /*
    开区间:(a,b), 不包含两端的点
    闭区间:[a,b], 包含两端的点
     */
    var nums2 = (1 .. 200);
    // var nums3 = [1 .. 200]; 非法写法

    var nums4 = 1 until 100;    // [1, 100);
    var nums5 = 1 .. 16;
    for (a in nums5 step 2){
        // 跳过两个打印一次
        println(a);
    }

    // 倒序翻转
    var nums6 = nums5.reversed();

    // 求区间集合的数量
    var count = nums6.count();

    // 20 课程
}
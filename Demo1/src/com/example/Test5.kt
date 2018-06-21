package com.example

fun main(args: Array<String>) {
    var s1 = "张三";
    var s2 = "张三";
    var s3 = "Andy";
    var s4 = "andy";
    /*
     * kotlin中字符串 == , 相当于equals方法;
     * equals(other:Any, ignoreCase: Boolean), 参数二, 忽视大小写
     */
    println("${s1 == s2} + ${s1.equals(s2)}");
    println("${s3 == s4} + ${s3.equals(s4)}");
    println(s3.equals(s4,true));

    var compare = compare("ygx", "z");
    println("compare: $compare");

    var compare2 = compare2("ygx", null);
    println("compare: $compare2");

}

/**
 * 默认参数为not null, 所以编译器在编译的时候提前做了非空判断
 */
fun compare(args:String, other:String):Int{
    var i = args.length - other.length
    if(i > 0) return 1;
    if(i < 0) return -1;
    return 0;
}

/**
 * 默认参数为not null, 加上String?后, 表示参数可为null, 但是不能直接调用变量的方法或属性
 *
 * 需要先做非空判断
 */
fun compare2(args:String?, other:String?):Int{
    if(args == null && other == null) return 0;
    if(args == null) return -1;
    if(other == null) return 1;
    // Only safe or not null ,,, call
    var i = args.length - other.length
    if(i > 0) return 1;
    if(i < 0) return -1;
    return 0;
}

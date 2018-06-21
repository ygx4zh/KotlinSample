package com.example.extendsdemo

/**
 * 抽象的人类
 *
 * abstract修饰的class和fun不需要用open修饰就能继承和实现了
 */
 abstract class Human(var name:String){

    abstract fun eat();

    abstract fun pee();
}
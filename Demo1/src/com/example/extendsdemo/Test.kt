package com.example.extendsdemo

fun main(args: Array<String>) {
    var man = Man("金三胖")
    var woman = Woman("慈禧太后")
    /*man.eat();
    woman.eat();
    println("---------------------")
    man.pee();
    woman.pee();*/

    var list = listOf<Human>(man, woman);
    for (humen in list){
        if(humen is Human)
        humen.pee();
    }
}
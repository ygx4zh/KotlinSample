package com.example.extendsdemo

class Man(name:String):Human(name), IMan, IPerson{
    override fun sleep() {
        println("忽忽")
    }

    override fun xiaodidi() {
        println("18cm xiaodidi")
    }

    override fun pee() {
        println("$name 站着pee")
    }

    override fun eat() {
        println("$name 哇哇哇大口大口的吃")
    }
}
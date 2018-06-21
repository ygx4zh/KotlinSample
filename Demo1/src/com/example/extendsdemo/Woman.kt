package com.example.extendsdemo

class Woman(name:String): Human(name) {
    override fun pee() {
        println("$name 蹲着 pee")
    }

    override fun eat() {
        println("$name, 小口小口吃")
    }
}
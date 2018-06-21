package com.example.extendsdemo

class Dad2:IWashBowl by BigHeadSon {
    override fun washing() {
        // 委托了的也可以重写
        // 调用单例对象, 直接类名.函数
        BigHeadSon.washing();
    }
}
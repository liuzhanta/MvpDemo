package com.tata.kotlindemochapter.基础语法

class BasicSyntax {

    //---------------------- 定义函数 ----------------------
    /**
     * 带有两个 Int 参数、返回 Int 的函数：
     */
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun sum1(a: Int,miji:String)
    {
    }
    /**
     * 函数返回无意义的值
     */
    fun sumNone(a: Int, b: Int): Unit {
        println("sum of $a and $b is ${a + b}")
    }

    /**
     * 函数返回无意义的值（Unit可以省略）
     */
    fun sumNoneEmpty(a: Int, b: Int) {
        println("sum of $a and $b is ${a + b}")
    }


    //---------------------- 定义变量 ----------------------
    fun test() {
        // 一次赋值（只读）的局部变量:
        val a: Int = 1 //立即赋值
        val b = 2 // 自动推断`Int`类型
        val c: Int // 如果没有初始值类型不能省略
        c = 3

        // 可变变量
        var x = 5
        x += 1

        // 顶层变量
        val PI = 3.14; //不可变量使用 val
        var y = 0; // 变量使用var
        y += 1


    }

    class Address {
        var name: String = ""
        var street: String = ""

        fun copyAddress(address: Address): Address {
            val result = Address()
            result.name = address.name;
            result.street = address.street
            return result;
        }
    }
}
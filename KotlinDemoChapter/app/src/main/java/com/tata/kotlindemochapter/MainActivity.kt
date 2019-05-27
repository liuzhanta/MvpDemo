package com.tata.kotlindemochapter

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        test1()
        test2()
        test3()
        sum(1,2)

    }

    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    /**
     * 三个等号===比较的是对象
     */
    fun test1() {
        val a: Int = 10000
        println(a === a) // 输出“true”
        val boxedA: Int? = a
        val anotherBoxedA: Int? = a
        println(boxedA === anotherBoxedA) // ！！！输出“false”！！！
    }

    /**
     * 二个等号===比较的是值
     */
    fun test2() {
        val a: Int = 10000
        println(a == a) // 输出“true”
        val boxedA: Int? = a
        val anotherBoxedA: Int? = a
        println(boxedA == anotherBoxedA) // 输出“true”
    }

    /**
     * 较小类型不是较大类型的子类型
     * 只能从大转小，反之不能
     */
    fun test3() {

        val bitA: Byte = 13;
        val intA: Int = bitA.toInt()
        print(intA)

    }
}

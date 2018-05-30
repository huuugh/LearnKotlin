package com.hugh.learnkotlin.grammar

    //带有两个int参数，返回一个int类型
    fun sum1(a:Int,b:Int):Int{
        return a+b
    }

    //表达式作为函数体，自动推断返回类型
    fun sum2(a:Int,b:Int) = a+b

    //无返回值得函数,Unit可以不写
    fun printSum(a:Int,b:Int):Unit{
        println("sum of $a and $b is ${a + b}")
    }
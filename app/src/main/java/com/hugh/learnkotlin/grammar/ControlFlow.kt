package com.hugh.learnkotlin.grammar


class ControlFlow {

    fun learnIf():Int{
        val a = 5
        val b = 8
        return (if(b>a) a else b)
    }

    fun learnWhen(cityName:String):String{
        return when(cityName){
            // in 1..10
            // !in 1..10
            // is String    //判断条件
            "EEngland".substring(2) -> "England" //条件可以使用表达式
            "chongqing" -> "CQ"
            "beijing" -> "BJ"
            "shanghai","LaJi" -> "LJ" //对多个条件进行相同操作
            else -> "HeHe"
        }
    }

    fun learnFor(){
        //for 循环可以对任何提供迭代器（iterator）的对象进行遍历，这相当于像 C# 这样的语言中的 foreach 循环。语法如下：

        //for (item in collection) print(item)
        //循环体可以是一个代码块。

        //for (item: Int in ints) {
            // ……
        //}

        for (i in 1..3) {
            println(i)
        }
        for (i in 6 downTo 0 step 2) {
            println(i)
        }

        //通过索引遍历
        //for (i in array.indices) {
            //println(array[i])
        //}

        //既可以拿到索引又可以拿到值
        //for ((index, value) in array.withIndex()) {
            //println("the element at $index is $value")
        //}
    }
}
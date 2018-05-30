package com.hugh.learnkotlin.grammar

class BasicDataTypes {

    fun main(args:Array<String>){
        boxingAndUnboxing()
    }

    private fun boxingAndUnboxing(){
        //注意数字装箱不必保留同一性:
        val a = 10000
        print(a === a) // 输出“true”
        val boxedA: Int? = a
        val anotherBoxedA: Int? = a
        print(boxedA === anotherBoxedA) // ！！！输出“false”！！！

        //另一方面，它保留了相等性:
        val b = 10000
        print(b == b) // 输出“true”
        val boxedB: Int? = b
        val anotherBoxedB: Int? = b
        print(boxedB == anotherBoxedB) // 输出“true”
    }

    private fun explicitTranslation(){
        //显式转换
        //由于不同的表示方式，较小类型并不是较大类型的子类型。 如果它们是的话，就会出现下述问题：
        // 假想的代码，实际上并不能编译：
        //val a: Int? = 1 // 一个装箱的 Int (java.lang.Integer)
        //val b: Long? = a // 隐式转换产生一个装箱的 Long (java.lang.Long)
        //print(b == a) // 惊！这将输出“false”鉴于 Long 的 equals() 会检测另一个是否也为 Long
        //所以相等性会在所有地方悄无声息地失去，更别说同一性了。

        //因此较小的类型不能隐式转换为较大的类型。 这意味着在不进行显式转换的情况下我们不能把 Byte 型值赋给一个 Int 变量。
        //val b: Byte = 1 // OK, 字面值是静态检测的
        //val i: Int = b // 错误

        //我们可以显式转换来拓宽数字
        //val i: Int = b.toInt() // OK: 显式拓宽

        //每个数字类型支持如下的转换:
        //toByte(): Byte
        //toShort(): Short
        //toInt(): Int
        //toLong(): Long
        //toFloat(): Float
        //toDouble(): Double
        //toChar(): Char

        //缺乏隐式类型转换并不显著，因为类型会从上下文推断出来，而算术运算会有重载做适当转换，例如：
        //val l = 1L + 3 // Long + Int => Long
    }

    fun learnArray():String{
        val arrayOf = arrayOf(1, 2, 3, 4)
        arrayOf.set(index = 2,value = 5)
        val get = arrayOf.get(index = 2)
        val size = arrayOf.size
        return get.toString()+"--"+size
    }

    fun learnString():String{
        val str = "comfortable"
        var sr = ""
        for (c in str){
            sr += " $c"
        }
        return sr.trim()
    }
}
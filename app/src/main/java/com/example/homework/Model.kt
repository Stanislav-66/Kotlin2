package com.example.homework

class Model {
    //Task1
    fun getSum(a : Int, b : Int) = a + b
    fun getSumMore(vararg a : Int) = if(a.size >= 2) a.sum() else throw IllegalArgumentException("Неверное количество аргументов")


    //Task2
    fun task2 (char : Char = ' ', vararg str : String) : String
    {
        return str.joinToString(char.toString())
    }

    //task4
    fun task4(f:()->Unit) : Long
    {
        val startTime = System.currentTimeMillis()
        f()
        val endTime = System.currentTimeMillis()
        return endTime - startTime
    }


    fun testFunction() {
        var n = 1000000000
        while (n != 0)
        {
            n--
        }
    }
}
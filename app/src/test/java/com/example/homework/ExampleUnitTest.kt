package com.example.homework

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        //task3
         assertEquals("Hello World", Model().task2( str = arrayOf("Hello", "World")))
         assertEquals("Hello,World", Model().task2(',', "Hello", "World"))
    }
}
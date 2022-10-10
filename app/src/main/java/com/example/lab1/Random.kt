package com.example.lab1

import kotlin.random.Random

class Random {
    var numbers: List<Int> = listOf()
    init {
        randomNumbers()
        sort()
        sort1()
    }
    fun randomNumbers(){
        numbers = List(15){ Random.nextInt(1, 15) }
    }
    fun sort(): List<Int> {
        return numbers.distinct().sorted()

    }
    fun sort1(): List<Int>{
        return listOf(numbers.distinct().count())
    }


}
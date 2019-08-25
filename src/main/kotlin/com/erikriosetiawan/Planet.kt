package com.erikriosetiawan

enum class Planet(var population: Int = 0) {
    EARTH(7 * 100000000),
    MARS();

    override fun toString() = "$name[population=$population]"
}

class Main {
    fun main() {
        println(Planet.MARS)
        Planet.MARS.population = 3
        println(Planet.MARS)
    }
}
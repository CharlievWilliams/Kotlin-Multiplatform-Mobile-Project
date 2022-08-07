package com.cwilliams.kotlinmultiplatformmobileproject

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}
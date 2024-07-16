package com.example.reusableandroidlib

import kotlinx.coroutines.delay

class NetworkManager {

    suspend fun sendRequest() {
        println("Sending request...")
        delay(1000)
        println("Request sent!")
    }

}
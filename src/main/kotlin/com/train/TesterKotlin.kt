package com.train

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Please enter number of tickets:")
    var total = scanner.nextInt()
    println("How many round-trip tickets:")
    var round_trip = scanner.nextInt()
    val ticket = Tickets(total, round_trip)
    println("Total tickets:$total Round-trip:$round_trip Total:${ticket.amount()}")
}

class Tickets(var total: Int, var roundTrip: Int){
    fun amount(): Int{
        return return ((total - roundTrip) * 1000 + (roundTrip * 2000 * 0.9)).toInt();
    }
}
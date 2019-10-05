package com.train

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Please enter number of tickets:")
    var total = scanner.nextInt()
    println("How many round-trip tickets:")
    var round_trip = scanner.nextInt()
    println("Total tickets:$total Round-trip:$round_trip Total:${amount(total, round_trip)}")
}

fun amount(total:Int, roundTrip:Int) : Int {
    return ((total - roundTrip) * 1000 + (roundTrip * 2000 * 0.9)).toInt();


}
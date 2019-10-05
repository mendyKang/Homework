package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        userInput();
    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of tickers:");
        int total = scanner.nextInt();
        System.out.println("How many round-trip tickets:");
        int round_trip = scanner.nextInt();
        System.out.println("Total tickets:"+ total+ " Round-trip:" + round_trip +" Total:"+ amount(total, round_trip));
    }

    public static int amount(int total, int roundTrip){
        return (int) ((total - roundTrip) * 1000 + (roundTrip * 2000 * 0.9));
    }
}

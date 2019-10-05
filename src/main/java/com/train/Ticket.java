package com.train;

public class Ticket {
    int total;
    int roundTrip;

    public Ticket(int total, int roundTrip) {
        this.total = total;
        this.roundTrip = roundTrip;
    }

    public int amount(){
        return (int) ((total - roundTrip) * 1000 + (roundTrip * 2000 * 0.9));
    }
}

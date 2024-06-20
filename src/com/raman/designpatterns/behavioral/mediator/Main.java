package com.raman.designpatterns.behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        AuctionMediator auctionMediator = new Auction();
        Colleague bidder1 = new Bidder("A", auctionMediator);
        Colleague bidder2 = new Bidder("B", auctionMediator);
        bidder1.placeBid(200);
        bidder2.placeBid(201);
        bidder1.placeBid(205);
    }
}

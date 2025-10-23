package com.pluralsight;

public class Player {

   private String name;
   private Hand hand;

   public Player(String name){
       this.name = name;
       this.hand = new Hand();
   }

    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    @Override
    public String toString() {
        return "Player " + name;
    }
}

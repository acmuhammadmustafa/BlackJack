package com.pluralsight;

public class Main {


    public static void main(String[] args) {
        // Deck deck = new Deck();
        // Hand hand1 = new Hand();

        promptForPlayers();


//
//        // deal 5 cards
//        for(int i = 0; i < 5; i++) {
//        // get a card from the deck
//            Card card = deck.deal();
//        // deal that card to the hand
//            hand1.Deal(card);
//        }
//
//        int handValue = hand1.getValue();
//        System.out.println("This hand is worth " + handValue);
    }

    public static void promptForPlayers() {
        Deck deck1 = new Deck();
        deck1.shuffle();
        Hand hand = new Hand();
        //get all the names
        Player Player1 = new Player(ConsoleHelper.promptForString("Enter player 1's name"), new Hand());
        Player Player2 = new Player(ConsoleHelper.promptForString("Enter player 2's name"), new Hand());
//        Player Player3 = new Player(ConsoleHelper.promptForString("Enter player 3's name"), new Hand());
//        Player Player4 = new Player(ConsoleHelper.promptForString("Enter player 4's name"), new Hand());
//        Player Player5 = new Player(ConsoleHelper.promptForString("Enter player 5's name"), new Hand());
//        Player Player6 = new Player(ConsoleHelper.promptForString("Enter player 6's name"), new Hand());
//        Player Player7 = new Player(ConsoleHelper.promptForString("Enter player 7's name"), new Hand());


        for (int i = 0; i < 2; i++) {
            // get a card from the deck
            Card card = deck1.deal();
            // deal that card to the hand
            hand.Deal(card);

                    int handValue = hand.getValue();
            System.out.println(Player1 + " hand is worth " + handValue);
            System.out.println(Player2 + " hand is worth " + handValue);
    }
            Player1.getHand().Deal(deck1.deal());
            Player2.getHand().Deal(deck1.deal());
//        Player3.getHand().Deal(deck1.deal());
//        Player4.getHand().Deal(deck1.deal());
//        Player5.getHand().Deal(deck1.deal());
//        Player6.getHand().Deal(deck1.deal());
//        Player7.getHand().Deal(deck1.deal());

            Player1.getHand().Deal(deck1.deal());
            Player2.getHand().Deal(deck1.deal());
//        Player3.getHand().Deal(deck1.deal());
//        Player4.getHand().Deal(deck1.deal());
//        Player5.getHand().Deal(deck1.deal());
//        Player6.getHand().Deal(deck1.deal());
//        Player7.getHand().Deal(deck1.deal());


        }
    }

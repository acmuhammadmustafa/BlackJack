package com.pluralsight;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        int numberOfPlayers = ConsoleHelper.promptForInt("How many players are there?");
        ArrayList<Player> players = new ArrayList<>();


        Player Player1 = new Player(ConsoleHelper.promptForString("Enter player 1's name").trim());
        Player Player2 = new Player(ConsoleHelper.promptForString("Enter player 2's name").trim());


        for (int i = 1; i < numberOfPlayers+1; i++) {
            // get a card from the deck
            String name = (ConsoleHelper.promptForString("Enter player " + i + "'s name").trim());
            Player p = new Player(name);
            players.add(p);
        }

        Deck deck = new Deck();
        deck.shuffle();

        // deal that card to the hand
        for (Player p : players) {
            p.getHand().Deal(deck.deal());
        }

        for (Player p : players) {
            p.getHand().Deal(deck.deal());
        }



        Player1.getHand().Deal(deck.deal());
        Player2.getHand().Deal(deck.deal());


        int winningScore = 0;

        for(Player currentPlayer: players){
            System.out.println(currentPlayer.getName() + " has " + currentPlayer.getHand().getValue());
            if (currentPlayer.getHand().getValue() > winningScore){
                winningScore = currentPlayer.getHand().getValue();
            }
        }
//            String handShown
        for (Player p : players) {
            p.getHand().Deal(deck.deal());
        }
        int handWorth1 = Player1.getHand().getValue();
        int handWorth2 = Player2.getHand().getValue();

        System.out.println();

        System.out.println(Player1 + " hand is worth " + handWorth1 + " (" + Player1.getHand().getAllCardsAsString() + ")");
//            System.out.printf(Player1.getHand().showHand(),);
        System.out.println(Player2 + " hand is worth " + handWorth2 + " (" + Player2.getHand().getAllCardsAsString() + ")");

        System.out.println(deck.getSize() + " cards left in the deck.");

        System.out.println();

        System.out.println("====== What's Next? ======");
        String nextUp = "What would you like to do?\n \n H) Hit\n S) Stand\n X) Exit\n=======================\n";


        String command;

        do {
            System.out.println(nextUp);
            command = ConsoleHelper.promptForString("Player 1: Enter your command").toLowerCase().trim();
            switch (command) {
                case "h":
                    for (int i = 2; i < 3; i++) {
                        // get a card from the deck
                        Player1.getHand().Deal(deck.deal());

                        deck.shuffle();

                        // deal that card to the hand
                        Player1.getHand().Deal(deck.deal());
                    }
                    int handHitWorth1 = Player1.getHand().getValue();
                    System.out.println(Player1 + " hand is worth " + handHitWorth1 + " (" + Player1.getHand().getAllCardsAsString() + ")");
                    System.out.println(deck.getSize() + " cards left in the deck.");
                    System.out.println("======================");
                    break;

                case "s":
                    System.out.println(Player1 + " hand is worth " + handWorth1 + " (" + Player1.getHand().getAllCardsAsString() + ")");
                    System.out.println("======================");
                    break;

                case "x":
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid input. Please enter a valid option.");
                    System.out.println("======================");
            }
        } while (!command.equalsIgnoreCase("x"));
    }


    private static void standCard() {
    }


}
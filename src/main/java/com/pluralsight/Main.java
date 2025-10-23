package com.pluralsight;

public class Main {


    public static void main(String[] args) {
        Deck deck = new Deck();


        Player Player1 = new Player(ConsoleHelper.promptForString("Enter player 1's name").trim(), new Hand());
        Player Player2 = new Player(ConsoleHelper.promptForString("Enter player 2's name").trim(), new Hand());

        deck.shuffle();

        for (int i = 0; i < 2; i++) {
            // get a card from the deck
            Card card = deck.deal();



            // deal that card to the hand
            Player1.getHand().Deal(deck.deal());
            Player2.getHand().Deal(deck.deal());
        }

//            String handShown

            int handWorth1 = Player1.getHand().getValue();
            int handWorth2 = Player2.getHand().getValue();

            System.out.println();

            System.out.println(Player1 + " hand is worth " + handWorth1 + " (" + Player1.getHand().getAllCardsAsString() + ")");
//            System.out.printf(Player1.getHand().showHand(),);
            System.out.println(Player2 + " hand is worth " + handWorth2+ " (" + Player2.getHand().getAllCardsAsString() + ")");

        System.out.println(deck.getSize() + " cards left in the deck.");

        System.out.println();

        System.out.println("====== What's Next? ======");
        String nextUp = "What would you like to do?\n \n H) Hit\n S) Stand\n X) Exit\n=======================\n";
        System.out.println(nextUp);

        String command;

        do {
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
                System.out.println(Player1 + " hand is worth " + handWorth1 + " (" + Player1.getHand().getAllCardsAsString() + ")");
                System.out.println("======================");
                break;

            case "s":
                System.out.println(Player1 + " hand is worth " + handWorth1+ " (" + Player1.getHand().getAllCardsAsString() + ")");
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




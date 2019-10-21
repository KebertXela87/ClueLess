package edu.jhu.teamundecided.clueless.deck;

import edu.jhu.teamundecided.clueless.player.Player;

public class Main {

    public static void main(String[] args)
    {
        DeckController controller = new DeckController();

        controller.printDecks();

        controller.shuffleAllDecks();

        System.out.println("\nDecks Shuffled:\n");
        controller.printDecks();

        controller.selectCaseFile();
        // Selecting a stacked case file
        String suspect = "Professor Plum";
        String room = "Library";
        String weapon = "Rope";
//        controller.selectStackCaseFile(suspect, room, weapon);

        System.out.println("\n");
        controller.printCaseFile();

        controller.combineDecks();
        System.out.println("\nFull Deck without Case File cards:\n");
        controller.printFullDeck();

        // Player Hands
        controller.setupPlayers();
        if(controller.dealCards())
        {
            for (Player player : controller.getPlayers()) {
                player.printPlayerHand();
            }
        }

        // Demo Accusation
        System.out.println("\n\nMy accusation is: " + suspect + " in the " + room + " with the " + weapon);
        controller.checkAccusation(suspect, room, weapon);
        controller.printCaseFile();

        // Demo Suggestion
        System.out.println("\n\nSuggestion: " + suspect + " in the " + room + " with the " + weapon);
        if (!controller.checkSusgestion(suspect, room, weapon))
        {
            System.out.println("No one has a suggested card");
        }
    }
}

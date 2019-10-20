package edu.jhu.teamundecided.clueless;

public class Main {

    public static void main(String[] args)
    {
        DeckController controller = new DeckController();

        controller.printDecks();

        controller.shuffleAllDecks();

        System.out.println("\nDecks Shuffled:\n");
        controller.printDecks();

        controller.selectCaseFile();

        System.out.println("\n");
        controller.printCaseFile();

        controller.combineDecks();
        System.out.println("\nFull Deck without Case File cards:\n");
        controller.printFullDeck();

        // Player Hands
        controller.setupTempPlayers();
        controller.dealCards();
        for (DeckController.TempPlayer player : controller.getPlayers())
        {
            player.printPlayerHand();
        }
    }
}

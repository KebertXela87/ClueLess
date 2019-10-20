package edu.jhu.teamundecided.clueless;

public class Main {

    public static void main(String[] args)
    {
        DeckControl controller = new DeckControl();

        controller.setupDecks();

        controller.printDecks();

        controller.shuffleAllDecks();

        System.out.println("\nDecks Shuffled:\n");
        controller.printDecks();
    }
}

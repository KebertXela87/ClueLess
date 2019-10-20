package edu.jhu.teamundecided.clueless;

import java.util.*;

public class DeckControl
{
    // Decks
    private Deck _suspectDeck;
    private Deck _roomDeck;
    private Deck _weaponDeck;
    private ArrayList<Deck> _decks;

    // Card Lists
    private ArrayList<String> _Suspects;
    private ArrayList<String> _Rooms;
    private ArrayList<String> _Weapons;

    DeckControl()
    {
        // create the card name lists - used to create the cards
        _Suspects = new ArrayList<>(Arrays.asList("Mr. Green", "Colonel Mustard", "Mrs. Peacock", "Professor Plum", "Miss Scarlett", "Mrs. White"));
        _Rooms = new ArrayList<>(Arrays.asList("Ballroom", "Kitchen", "Dining Room", "Lounge", "Hall", "Study", "Library", "Conservatory", "Billiard Room"));
        _Weapons = new ArrayList<>(Arrays.asList("Candle Stick", "Dagger", "Lead Pipe", "Revolver", "Rope", "Wrench"));

        _decks = new ArrayList<>();
    }

    public void setupDecks()
    {
        _suspectDeck = new Deck(_Suspects, Card.CardType.Suspect);
        _roomDeck = new Deck(_Rooms, Card.CardType.Room);
        _weaponDeck = new Deck(_Weapons, Card.CardType.Weapon);

        _decks.add(_suspectDeck);
        _decks.add(_roomDeck);
        _decks.add(_weaponDeck);
    }

    public void dealCards()
    {
        // This method will deal all the cards to all the players
    }

    public void shuffleCards(Deck deck)
    {
        Collections.shuffle(deck.getCards());
    }

    // DEBUG Method
    public void printDecks()
    {
        System.out.println("Suspects:");
        _suspectDeck.getCards().forEach((n) -> System.out.println(n));
        System.out.println("\nRooms:");
        _roomDeck.getCards().forEach((n) -> System.out.println(n));
        System.out.println("\nWeapons:");
        _weaponDeck.getCards().forEach((n) -> System.out.println(n));
    }

    public void shuffleAllDecks()
    {
        _decks.forEach((deck) -> shuffleCards(deck));
    }

}

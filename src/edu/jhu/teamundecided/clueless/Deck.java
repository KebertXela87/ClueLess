package edu.jhu.teamundecided.clueless;

import java.util.ArrayList;

public class Deck
{
    private ArrayList<Card> _cards;

    // Creates a Deck out of a list of card names and a card type
    Deck(ArrayList<String> cardname, Card.CardType cardtype)
    {
        _cards = new ArrayList<>();
        cardname.forEach((c) -> _cards.add(new Card(c, cardtype)));
    }

    // Creates a Deck out of a list of Cards
    Deck(ArrayList<Card> card)
    {
        _cards = new ArrayList<>();
        card.forEach((c) -> _cards.add(c));
    }

    public ArrayList<Card> getCards()
    {
        return _cards;
    }

    public void setCards(ArrayList<Card> _cards)
    {
        this._cards = _cards;
    }
}

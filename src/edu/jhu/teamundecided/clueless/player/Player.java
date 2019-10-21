package edu.jhu.teamundecided.clueless.player;

import edu.jhu.teamundecided.clueless.deck.Card;

import java.util.ArrayList;

public class Player
{
    private ArrayList<Card> _playerHand;
    private int _id;


    public Player(int id)
    {
        _id = id;
        _playerHand = new ArrayList<>();
    }

    public void addCardToHand(Card card)
    {
        if (!_playerHand.contains(card))
        {
            _playerHand.add(card);
        }
    }

    public ArrayList<Card> getPlayerHand()
    {
        return _playerHand;
    }

    public int getId()
    {
        return _id;
    }

    public void printPlayerHand()
    {
        System.out.println("\nPlayer " + _id + " Hand:\n");
        for (Card card : _playerHand)
        {
            System.out.println(card);
        }
    }

    // demo class
    public class ServerWorker
    {

    }
}

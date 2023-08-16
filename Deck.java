import java.util.*;
import java.util.ArrayList;

public class Deck{
    private int _deckamt;
    private static int _count;
    
    private ArrayList<Card> _cards;
    
    public Deck(){
        _cards = new ArrayList<Card>();
        _deckamt = 0;
    }

    public Deck(boolean b){
        this();
        if (b == true){
            build();
        }
    }
    public void addCard(Card n){
        _cards.add(n);
    }
    //method for shuffling
    public void shuffle(){
        Collections.shuffle(_cards);
    }
    
    //for loop to add value of cards
    public void build(){
    for (int i =1; i <=4; i++){
        for (int p = 1; p <=13; p++){
            //adding the actual cards
            Card newcards = new Card (i, p);
            _cards.add(newcards);
            _count++;
        }
    }   
    }
    //once a card is dealt it should decrease the amount of cards in the given deck
    public Card dealCard(){
        _count--;
        _deckamt++;
        return _cards.get(_deckamt);
    }
    public int getSize(){
        return _count;
    }
    public int getId(){
        return _deckamt;
    }
    public String getAllCards(){
        String outcome = "";
for (Card n: _cards){
    outcome += n.toString() + "\n";
}
return outcome;
    }
    public String toString(){
        return getAllCards();
    }
    
}


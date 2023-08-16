public class Card{
   //self notes: integers are to determine value of the Card
   //use if statements to determine card name
    private int _suit;
    private int _number;
    private int _value;
    
    private String numvalOfSuit;
    private String nOfSuit;
    private static int _count;
    
public Card(int s, int n){
setSuit(s);
setNumber(n);
//suit of the card
    if(_suit == 1){
        nOfSuit = "diamonds";
    }
        else if (_suit == 2){
        nOfSuit = "clubs";
    }
            else if (_suit == 3){
        nOfSuit = "hearts";
    }
                else if (_suit == 4){
        nOfSuit = "spades";
    }
    
    
    //card number 
    if(_number ==1){
        numvalOfSuit ="ace";
    }
        else if(_number ==2){
            numvalOfSuit ="two";
    }
            else if(_number ==3){
            numvalOfSuit ="three";
    }
                else if(_number ==4){
            numvalOfSuit ="four";
    }
                    else if(_number ==5){
            numvalOfSuit ="five";
    }
                    else if(_number ==6){
            numvalOfSuit ="six";
    }
                    else if(_number ==7){
            numvalOfSuit ="seven";
    }
                    else if(_number ==8){
            numvalOfSuit ="eight";
    }
                    else if(_number ==9){
            numvalOfSuit ="nine";
    }
                    else if(_number ==10){
            numvalOfSuit ="ten";
    }
                    else if(_number ==11){
            numvalOfSuit ="jack";
    }
                    else if(_number ==12){
            numvalOfSuit ="queen";
    }
                    else if(_number ==13){
            numvalOfSuit ="king";
    }
}
//overload
public Card(int s, int n, int v){
    this(s, n);
    setValue(v);
}
//mutator
public void setSuit(int sT){
        _suit = sT;
    }
    //accessor
    public int getSuit(){
        return _suit;
    }
public void setNumber(int n){
    _number =n;
}   
    public int getNumber(){
        return _number;
}
public void setValue(int v){
    _value = v;
}
    public int getValue(){
        return _value;
    }
public void setName(String name){
    nOfSuit = name;
}
    public String getName(){
        return nOfSuit;
    }   
public void setName1(String nameone){
    numvalOfSuit = nameone;
}
    public String getName1(){
        return numvalOfSuit;
    }
    
    public String toString(){
        return numvalOfSuit + " of " + nOfSuit;
    }
}
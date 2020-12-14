package sample.model;

import java.util.ArrayList;
import java.util.List;

public class Card {
    private   int PinCode;
    private  String bankName;
    private  int number;
    private String type;

    public List<BankAccount> bankAccountList;

    public Card getCard() {
       return  this;
    }

    public int getPinCode() {
        return 0;
    }

    public void deleteCard(Card card){

    }






}

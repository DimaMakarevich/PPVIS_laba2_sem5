package sample.model;

public class Transaction {
    private int inputPinCode;
    private int valuePinCode;
    private int cardID;
    private String name;

    public BankAccount bankAccount;

    public Check check;


    public  void execute(){

    }

    public boolean finishTransaction(Transaction transaction) {
            return true;
    }

    public boolean checkSolvency(){
        return true;
    }



}

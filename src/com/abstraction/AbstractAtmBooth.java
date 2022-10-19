package com.abstraction;

public abstract class AbstractAtmBooth {
    private int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    protected String getBank(int bankSelection){
        if(bankSelection == 1){
            return "DBBL";
        }
        else if(bankSelection == 2){
            return "Bkash";
        }
        else if(bankSelection == 3){
            return "Rocket";
        }
        else {
            return "None";
        }
    }

    abstract void performPayment();
}

class AtmBooth extends AbstractAtmBooth{

    @Override
    void performPayment() {
        String bankName = getBank(1);
        setAmount(60);
        System.out.println("Selected Bank: "+bankName);
        System.out.println("Amount: "+getAmount());
    }
}

class Runner{
    public static void main(String[] args) {
        AbstractAtmBooth booth = new AtmBooth();
        booth.performPayment();
    }
}

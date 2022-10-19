package com.pattern;

public abstract class AbstructAtmBooth {
    private int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    protected String setBankName(int key){
        if(key ==1){
            return "Bbbl";
        }
        else if(key == 2){
            return "Bkash";
        }
        else if(key == 3){
            return "Nagad";
        }
        else {
            return "it's wrong input";
        }
    }

    abstract void paymentProcessing();

}

//class AtmBooth extends AbstructAtmBooth{
//
//    @Override
//    void paymentProcessing() {
//        String bankName = setBankName(2);
//        setAmount(25000);
//        System.out.println("Selected Bank = "+bankName+"\n"+"Amount = "+getAmount());
//    }
//
//    public static void main(String[] args) {
//        AbstructAtmBooth obj = new AtmBooth();
//        obj.paymentProcessing();
//    }
//}

class AtmBooth{
    public static void main(String[] args) {
        AbstructAtmBooth obj1 = new AbstructAtmBooth() {
            @Override
            void paymentProcessing() {
                String bankName = setBankName(2);
                setAmount(28000);
                System.out.println("Selected Bank = "+bankName+"\n"+"Amount = "+getAmount());
            }
        };
        obj1.paymentProcessing();
    }
}
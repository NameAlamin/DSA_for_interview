package com.abstraction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class AbstractAtmBoothP2 {
    private int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    protected String selectBank(int bankSelection){
        if(bankSelection == 1){
            return "Dbbl";
        }
        if (bankSelection == 2){
            return "Bkash";
        }
        if(bankSelection == 3){
            return "Rocket";
        }
        else {
            return "input is wrong";
        }
    }

    abstract void paymentExecution() throws IOException;

}

//class AtmBooth2 extends AbstractAtmBoothP2{
//
//    @Override
//    void paymentExecution() {
//        String bankName = selectBank(2);
//        setAmount(25000);
//        System.out.println("Bank Name = "+bankName+ "\n"+ "Total Amount = "+getAmount());
//    }
//
//    public static void main(String[] args) {
//        AbstractAtmBoothP2 booth2 = new AtmBooth2();
//        booth2.paymentExecution();
//    }
//
//}



class AtmBooth2{
    public static void main(String[] args) throws IOException {
        AbstractAtmBoothP2 obj1 = new AbstractAtmBoothP2() {
            @Override
            void paymentExecution() throws IOException {
                BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
                System.out.println("1 = Dbbl");
                System.out.println("2 = Bkash");
                System.out.println("3 = Rocket");
                System.out.println();
                System.out.print("Please Enter Bank Code: ");
                String bank = selectBank(Integer.parseInt(reader.readLine()));
                System.out.print("Please Enter Amount: ");
                this.setAmount(Integer.parseInt(reader.readLine()));
                System.out.println("Your Selected Bank = "+bank+"\n"+"Your Amount = "+getAmount());
            }
        };
        obj1.paymentExecution();
    }
}






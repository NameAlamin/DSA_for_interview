package com.abstraction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class AbstractAtmBooth3 {
    private int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    protected String selectBank(int selectId){
        if(selectId == 1){
            return "Dbbl";
        }
        else if(selectId == 2){
            return "Bkash";
        }
        else if(selectId == 3){
            return "Rocket";
        }
        else {
            return "your input is wrong!!!";
        }
    }

    abstract void paymentExecution() throws IOException;
}

class AtmBooth3{
    public static void main(String[] args) throws IOException {
        AbstractAtmBooth3 obj1 = new AbstractAtmBooth3() {
            @Override
            void paymentExecution() throws IOException {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("1 = Dbbl");
                System.out.println("2 = Bkash");
                System.out.println("3 = Rocket");
                System.out.println();
                System.out.print("Enter Bank Code: ");
                String bankCode = selectBank(Integer.parseInt(reader.readLine()));
                System.out.print("Please Enter Amount: ");
                this.setAmount(Integer.parseInt(reader.readLine()));
                System.out.println();
                System.out.println("your Account Name = "+bankCode+"\n"+"Your Amount = "+getAmount());
            }
        };
        obj1.paymentExecution();
    }
}
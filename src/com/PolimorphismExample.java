package com;

public class PolimorphismExample {
    public void productInfo(){
        System.out.println("normal parameter");
    }
    public void productInfo(int i){
        System.out.println("int parameter");
    }
    public void productInfo(String a){
        System.out.println("string parameter");
    }

    public static void main(String[] args) {
//        Parent obj1 = new Parent();
//        obj1.showPhoneInfo();

        Child obj2 = new Child();
        obj2.showPhoneInfo();
    }
}

class Parent{
    public String showPhoneInfo(){
        String var1 = "i have vivo phone, 4gb";
        System.out.println(var1);
        return var1;
    }
}

class Child extends Parent{
    public String showPhoneInfo(){
        String var2 = "i have Walton phone, 8gb";
        System.out.println(var2);
        return var2;
    }
}
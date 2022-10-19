package com.javaPractice;

public class Constructor {
    public static void main(String[] args) {
        B obj1 = new B(5);
    }
}

class A{
    A(){
        System.out.println("in A");
    }
    A(int i){
        System.out.println("in A int");
    }
}

class B extends A{
    B(){
        super();
        System.out.println("in B");
    }
    B(int i){
        super(4);
        System.out.println("int B int");
    }
}

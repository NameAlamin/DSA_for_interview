package com.practice1;

public class Constructor {
    public static void main(String[] args) {
        B obj1 = new B(5);
    }
}
// this = current class er reference
// super = parent class er reference

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
        super(6);
        System.out.println("in B int");
    }
}
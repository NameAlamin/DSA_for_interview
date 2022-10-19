package com.javaPractice;

public class ThisAndSuper {
    public static void main(String[] args) {
        ChildClass obj1 = new ChildClass(15);
    }
}

class ParentClass{
    protected int numberFromSuper;
    ParentClass(int value){
        this.numberFromSuper = value;
        System.out.println(this.numberFromSuper);
    }
}

class ChildClass extends ParentClass{

    ChildClass(int value) {
        super(value);
        System.out.println(super.numberFromSuper);
        this.numberFromSuper = 15 + value;
        System.out.println(this.numberFromSuper);
    }
}
package com.javaPractice;

public class Static {
    int a = 10;
    static int b = 20;

    public static void main(String[] args) {
        System.out.println("============ Obj-1 ===========");
        StaticCheck obj1 = new StaticCheck();
        System.out.println("A = "+obj1.a);
        System.out.println("B = "+obj1.b);
        System.out.println("C = "+obj1.c);
        System.out.println("C = "+StaticCheck.c);

        System.out.println("============ Obj-2 ===========");
        StaticCheck obj2 = new StaticCheck();
        obj2.a = 5;
        obj2.b = 15;
        obj2.c = 555;
        System.out.println("A = "+obj2.a);
        System.out.println("B = "+obj2.b);
        System.out.println("C = "+obj2.c);

        System.out.println("============ Obj-3 ===========");
        StaticCheck obj3 = new StaticCheck();
        System.out.println("A = "+obj3.a);
        System.out.println("B = "+obj3.b);
        System.out.println("C = "+obj3.c);

    }
}

class StaticCheck{
    int a = 10;
    int b = 20;
    static int c = 30;
}

class Count1{
    int count = 0;
    Count1(){
        count++;
        System.out.print(count+" ");
    }

    public static void main(String[] args) {
        Count1 c1 = new Count1();
        Count1 c2 = new Count1();
        Count1 c3 = new Count1();
    }
}

class Count2{
    static int count = 0;
    Count2(){
        count++;
        System.out.print(count+" ");
    }

    public static void main(String[] args) {
        Count2 c1 = new Count2();
        Count2 c2 = new Count2();
        Count2 c3 = new Count2();
    }
}
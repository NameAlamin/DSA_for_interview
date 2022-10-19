package com.practice1;

public class Static {

    public static void main(String[] args) {
        System.out.println("========= obj-1 =========");
        StaticNonStaticTest obj1 = new StaticNonStaticTest();
        System.out.println("A = "+obj1.a);
        System.out.println("B = "+obj1.b);
        System.out.println("C = "+obj1.c);
        System.out.println("C = "+StaticNonStaticTest.c);

        System.out.println("========= obj-2 =========");
        StaticNonStaticTest obj2 = new StaticNonStaticTest();
        obj2.a = 5;
        obj2.b = 15;
        obj2.c = 555;
        System.out.println("A = "+obj2.a);
        System.out.println("B = "+obj2.b);
        System.out.println("C = "+obj2.c);
        System.out.println("C = "+StaticNonStaticTest.c);

        System.out.println("========= obj-3 =========");
        StaticNonStaticTest obj3 = new StaticNonStaticTest();
        System.out.println("A = "+obj3.a);
        System.out.println("B = "+obj3.b);
        System.out.println("C = "+obj3.c);
        System.out.println("C = "+StaticNonStaticTest.c);

    }
}

class StaticNonStaticTest{
    int a = 10;
    int b = 20;
    static int c = 30;
}

class Count1{
    static int count = 0;

    Count1(){
        count++;
        System.out.print(count +" ");
    }

    public static void main(String[] args) {
        Count1 obj1 = new Count1();
        Count1 obj2 = new Count1();
        Count1 obj3 = new Count1();
    }
}
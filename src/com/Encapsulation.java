package com;

public class Encapsulation {
    private String name;
    private int roll;
    private int marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        if(marks>40){
            this.marks = marks;
        }
    }
}

class Run{
    public static void main(String[] args) {
        Encapsulation obj1 = new Encapsulation();
        obj1.setName("Alamin");
        obj1.setRoll(101);
        obj1.setMarks(33);

        System.out.println("Name = "+obj1.getName()+ "\n" + "Role = "+obj1.getRoll() + "\n" + "Marks = "+ obj1.getMarks());
    }
}


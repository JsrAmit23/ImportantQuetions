package com.company;

public class Encapsulation {

    /*
    * Definition: It is the process of binding the data or wrapping the data together into a single unit.
    *
    Que: What is the diff b/w Encapsulation and abstraction?
    Ans: Abstraction is the method of hiding the unwanted information.
    *
    *
        Whereas encapsulation is a method to hide the data in a single entity
        or unit along with a method to protect information from outside.
    */

    /*
    * These are the private variable which are only accessed by the public method*/
    private String name;
    private int age;
    private int pNumber;


    public Encapsulation(String name, int age, int pNumber) {

        // The this keyword refers to the current object in a method or constructor.

        this.name = name;
        this.age = age;
        this.pNumber = pNumber;
    }

        //The get method returns the variable value, and the set method sets the value.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getpNumber() {
        return pNumber;
    }

    public void setpNumber(int pNumber) {
        this.pNumber = pNumber;
    }

    public static void main(String[] args) {

        //Instance of the class is created using new keyword

        Encapsulation encapsulation = new Encapsulation("Ashish",20,12345678);
        System.out.printf("Name: %s \n Age: %d \n PhoneNumber: %d",encapsulation.getName(),
                encapsulation.getAge(),encapsulation.getpNumber());
    }


}

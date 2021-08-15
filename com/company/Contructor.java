package com.company;

/*
1. In Java, a constructor is a block of codes similar to the method.
2. It is called when an instance of the class is created.
3. At the time of calling constructor, memory for the object is allocated in the memory.
4. It is a special type of method which is used to initialize the object.
5. Every time an object is created using the new() keyword, at least one constructor is called.
6. It calls a default constructor if there is no constructor available in the class.
    In such case, Java compiler provides a default constructor by default. */

public class Contructor {

    int id;
    String name;

    //Intialization contructor

    public Contructor(int id1, String name) {
        this.id = id;
        this.name = name;
    }

    //constructor to initialize another object

    public Contructor(Contructor c){ //Copy Contructor
        id = c.id;
        name = c.name;
    }

    void display(){
        System.out.println("Id is: "+id + "\n" +"Name is: "+name);
    }

    public static void main(String[] args) {
        Contructor contructor = new Contructor(4,"Ashish");
        Contructor contructor1 = new Contructor(5,"Ashish");

        Contructor contructor2 = new Contructor(contructor1);
        contructor.display();
        contructor2.display();
    }
}

package com.company;

        /*
    1. Abstract class is the restricted class that can not be used to create the object of the abstract class inside the main class
    2. To access the abstracted class we need inherit the abstracted class and make the object of that inherited class.
    */

abstract class AbstractClass {

    public void sound() {
        System.out.println("Zzzzz");
    }

    public abstract int add(int a, int b);

}

/*
    3.If there is class with abstract method the body of the abstracted method is always declared inside the inherited class.
 */

class InheritedClass extends AbstractClass {

    public int add(int a, int b) {
        return a + b;
    }
}

class Main {
    public static void main(String args[]) {

        InheritedClass inheritedClass = new InheritedClass();
        System.out.println(inheritedClass.add(5, 6));
        inheritedClass.sound();
    }
}

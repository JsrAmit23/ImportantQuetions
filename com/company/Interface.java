package com.company;

/* Interface is the other type of the abtracted class which is 100% abtracted class. Every method inside the interface is abstracted
class
*/
public interface Interface {
    int add(int a, int b);
    int multi(int a, int b);
}

class InheritedClass2 implements Interface{
    public int add(int a, int b) {
        return a+b;
    }
    public int multi(int a, int b) {
        return a*b;
    }
}


class Main2{
    public static void main(String[] args) {
        InheritedClass2 inheritedClass2 = new InheritedClass2();
        System.out.println(inheritedClass2.add(10,6));
        System.out.println(inheritedClass2.multi(10,6));
    }
}


package com.company;

import java.util.Scanner;

public class Area {
    int breath, length;

    public Area(int breath, int length) {
        this.breath = breath;
        this.length = length;
    }

    public int returnArea() {
        return breath * length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the value of length: ");
      //  int l = sc.nextInt();
       // System.out.println("Enter the value of breath: ");
      //  int b = sc.nextInt();
        Area a = new Area(1,1);
       // System.out.println("Area is: " +a.returnArea());


        int t= sc.nextInt();
        while (t-->0){
            int n = Integer.parseInt(sc.next());
            a.fizzBuzz(n);
        }

    }


    public void fizzBuzz(int n){



        for(int i =1;i<=n;i++){
            if(i%15==0){
                System.out.println("FizzBuzz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}

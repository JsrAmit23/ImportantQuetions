package com.company;

public class StarsPatterns {

    public static void main(String[] args) {
   System.out.println("//Pattern One//");
        //Pattern one
        //*
        //**
        //***
        //****

        for(int i = 1;i<=4;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();


        /*
        Pattern Two
        ****
        ***
        **
        *
        */
      System.out.println("//Pattern Two//");
        for(int i = 1;i<=4;i++){
            for(int j = 4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

    /*
     Patter three

     *
     **
     ***
     ****
     ***
     **
     *


    */

        System.out.println("//Pattern Three//");
        for(int i = 1;i<=5;i++){
            for(int j = 1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1;i<=4;i++){
            for(int j = 4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        Pattern Four
          ----*
          ---**
          --***
          -****
          *****

        */
        System.out.println("//Pattern Four//");
        for(int i = 1;i<=5;i++){
            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for(int k = 1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        Pattern Five

        *****
        -****
        --***
        ---**
        ----*

         */

       System.out.println("//Pattern Five//");
        for (int i = 1;i<=5;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(" ");
            }for(int k = 5;k>=i;k--){
                System.out.print("*");

            }
            System.out.println();
        }

        diamondPattern();


    }


    public static void diamondPattern(){
        int rowsCount=5;
        int spacesCount = 0;
        for (int i = rowsCount; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            for (int j = 0; j < spacesCount; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            spacesCount = spacesCount + 2;
            System.out.println("");
        }

        spacesCount = (rowsCount * 2) - 2;
        for (int i = 0; i < rowsCount; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < spacesCount; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            spacesCount = spacesCount - 2;
            System.out.println("");
        }
    }/**/


}

//Printing palindrome by taking users input

 public static void main(String[] args)
    {
        int i, j, k;
        i=1;j=1;
        Scanner JSR= new Scanner(System.in);

        k=0;
        System.out.println(" enter the max number");
        int n=JSR.nextInt();

        System.out.print("1 1 ");


            while (k <= n)
            {
                k = i + j;
            System.out.print(k + " ");
            i = j;
            j = k;
        }
        System.out.println(" ");























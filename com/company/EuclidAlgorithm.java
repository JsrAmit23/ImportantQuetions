package com.company;

import java.util.Scanner;

public class EuclidAlgorithm {

    /*
    Compute the greatest common divisor of
    two non-negative integers p and q as follows:
    If q is 0, the answer is p. If not, divide p by q
    and take the remainder r. The answer is the
    greatest common divisor of q and r */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter p: ");
        int p = sc.nextInt();
        System.out.println("Enter q: ");
        int q = sc.nextInt();
        System.out.println("Greatest Common Divisor: " +gcd(p, q));
    }

    public static int gcd(int p, int q) {
        if (q == 0)
            return p;
        int r = p % q;
        return gcd(q, r);
    }
}

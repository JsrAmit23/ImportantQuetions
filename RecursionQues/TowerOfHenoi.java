package RecursionQues;

import java.util.Scanner;

public class TowerOfHenoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int t3 = sc.nextInt();
        TowerOfHenoi towerOfHenoi = new TowerOfHenoi();
        towerOfHenoi.towerOfHenoi(n,t1,t2,t3);

    }
    public void towerOfHenoi(int n,int t1,int t2,int t3){
        if(n==0)return;
        towerOfHenoi(n-1,t1,t3,t2);//LR
        System.out.println(n+ "[ " + t1+" -> "+ t2 + "]");
        towerOfHenoi(n-1,t3,t2,t1);//RR
    }
}

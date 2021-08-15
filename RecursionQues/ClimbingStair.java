package RecursionQues;

public class ClimbingStair {
    public static void main(String[] args) {
        int n =10;
        System.out.println(climbingStairs(n,new int[n+1]));
    }

    static int climbingStairs(int n,int qb[]){
        if(n==0){
            return 1;
        } else if(n<0){
            return 0;
        }
        if(qb[n]>0){
            return qb[n];
        }
        System.out.println("heellow"+ n);
        int steps1 = climbingStairs(n-1,qb);
        int steps2 = climbingStairs(n-2,qb);
        int steps3 = climbingStairs(n-3,qb);

        qb[n]=steps1+steps2+steps3;
        return steps1+steps2+steps3;
    }
}

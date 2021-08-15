package DynamicProgramming;

public class ClimbingStairs {


        public static void main(String[] args) {
        int n =4;
        System.out.println(climbingStairs(n,new int[n+1]));
        System.out.println(climbingStairsTabulation(n));
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

    static int climbingStairsTabulation(int n){
            int a[] = new int[n+1];
            a[0]=1;
            for(int i =1;i<=n;i++){
                if(i==1){
                    a[i]=a[i-1];
                }else if(i==2){
                    a[i]=a[i-1] + a[i-2];
                }else {
                    a[i]=a[i-1]+a[i-2]+a[i-3];
                }

            }
        return a[n];
    }
    }


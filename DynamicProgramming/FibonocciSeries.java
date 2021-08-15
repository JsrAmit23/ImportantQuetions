package DynamicProgramming;

public class FibonocciSeries {
    final int MAX=100;
    final int NIL=-1;
    int lookup[] = new int[MAX];



    public static void main(String[] args) {
        int n=7;
        //System.out.println(fiboTabulation(7));
        FibonocciSeries f = new FibonocciSeries();
        f._initialize();
        System.out.println(f.fiboMemoization(n));


    }

    //Tabultion Method
    static int fiboTabulation(int n){
        int f[] = new int[n+1];
        f[0]=1;
        f[1]=1;
        for(int i =2;i<n;i++){
            f[i]=f[i-1]+f[i-2];
        }
        return f[n-1];
    }

    /*Memoization (Top Down): The memoized program for a problem is similar to
     the recursive version with a small modification that it looks into a
     lookup table before computing solutions. We initialize a lookup array
     with all initial values as NIL. Whenever we need the solution to a subproblem, we first look into the lookup table.
     If the precomputed value is there then we return that value, otherwise,
    we calculate the value and put the result in the lookup table so that it can be reused later.*/


     int fiboMemoization(int n){
        if(lookup[n]==NIL){
            if(n<=1){
                lookup[n]=n;

            }
            else lookup[n]=fiboMemoization(n-1)+fiboMemoization(n-2);
        }

        return lookup[n];
    }
    void _initialize()
    {
        for (int i = 0; i < MAX; i++)
            lookup[i] = NIL;
    }
}

package ArraysQuestions;

public class MaxSumOfContigousArray {
    public static void main(String[] args) {
        int a[] = {1,2,4,-9,3,8,6};
        System.out.println(maxSum(a));
    }

    static int maxSum(int a[]){

        int result =0,sum=0;

        for(int i=0;i<a.length;i++){
            sum+=a[i];
            result = max(result,sum);
        }
        return result;
    }

    static int max(int a,int b){
        if(a>b)
            return a;
        else
            return b;
    }
}

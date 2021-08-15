package ArraysQuestions;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int a[] = {2,7,11,5,6};
        int target = 7;

        System.out.println(Arrays.toString(twoSum(a,13)));
    }

    public static int[] twoSum(int[] a, int target) {
        int index[]  = new int[2];

        int i=0;
        int j=a.length-1;
        while(i<=j){
            if(i==j){
                i++;
                j=a.length-1;
            }
            if(a[i]+a[j]==target){
                index[0]=i;
                index[1]=j;

            }
            j--;
        }
        return index;
    }
}

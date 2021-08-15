package RecursionQues;

public class MaxOfArray {
    public static void main(String[] args) {
        int a[] = {2,1,3,98,67,78};
        System.out.println(maxOfArray(a,0));
    }
    static int maxOfArray(int a[],int index){
        if(index == a.length-1){
            return a[index];
        }
        int maxInSmallArray = maxOfArray(a,index+1);
        if(maxInSmallArray>a[index]){
            return maxInSmallArray;
        }else return a[index];
    }
}

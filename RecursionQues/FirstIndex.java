package RecursionQues;

public class FirstIndex {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,3,4,6,7,8,9,2};
        System.out.println(firstIndex(a,0,11));
    }

    public static int firstIndex(int a[],int index,int x){
        if(index==a.length){
            return -1;
        }
        if(a[index]==x){
            return index;
        }
        else {
            return firstIndex(a,index+1,x);
        }
    }
}

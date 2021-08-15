package RecursionQues;

public class LastIndex {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,3,4,6,7,8,9,2};
        System.out.println(lastIndex(a,0,10));
    }
    public static int lastIndex(int a[],int index,int x){
        if(index==a.length){
            return -1;
        }
        int lissa = lastIndex(a,index+1,x);
        if(lissa==-1){
            if(a[index]==x){
                return index;
            }else
                return -1;
        }
        else return lissa;
    }
}

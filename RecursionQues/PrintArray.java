package RecursionQues;

public class PrintArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        dipslayArray(a,0);
        System.out.println();
        System.out.println("Reverse of the array");
        dipslayArrayReverse(a,0);

    }
    public static void dipslayArray(int a[],int index){
        if(index==a.length)return;
        System.out.println(a[index]);
        dipslayArray(a,index+1);




    }
    public static void dipslayArrayReverse(int a[],int index){
        if(index==a.length)return;

        dipslayArrayReverse(a,index+1);
        System.out.println(a[index]);


    }
}

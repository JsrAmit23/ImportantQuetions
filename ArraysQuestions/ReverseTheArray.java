package ArraysQuestions;

public class ReverseTheArray {



    public int [] reverseArray(int a[],int start,int end){
        int temp;
        while(start<end){
            temp = a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        return a;
    }

    public void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        ReverseTheArray reverseTheArray = new ReverseTheArray();
        reverseTheArray.reverseArray(a, 0, a.length-1);
        reverseTheArray.printArray(a);

    }
}

package SortAlgorithm;

public class SelectionSort {

    public static void main(String[] args) {
        int a[]={9,14,3,2,43,11,58,22};
        quickSort(a,0,a.length-1);
       // bubbleSort(a);
        for(int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }

    public static int [] selectionSort(int a[]){

        for(int i =0;i<a.length-1;i++){
            int index = i;
            for(int j = i+1;j<a.length;j++){
                if(a[index]>a[j]){
                    index =j;
                }
            }

            int temp = a[index];
            a[index] = a[i];
            a[i] = temp;
        }
        return a;
    }
    public static int [] bubbleSort(int a[]){

        for(int i =0;i<a.length-1;i++){
            for(int j =0 ;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]= a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }


//Quick Sort
   public static void swap(int a[], int i,int j){
        int temp = a[i];
        a[i]= a[j];
        a[j]  = temp;
   }

   public static int partition(int a[], int low, int high){
        int i=(low -1);

        int pivot = a[high];

        for(int j = low;j<=high;j++ ){
            if(a[j]<pivot){
                i++;
                swap(a,i,j);
            }
        }
        swap(a,i+1,high);
        return (i+1);
   }

   static void quickSort(int a[],int low,int high){
        if(low<high){
            int pi = partition(a,low,high);

            quickSort(a,pi+1,high);
            quickSort(a,low,pi-1);
        }
   }
}

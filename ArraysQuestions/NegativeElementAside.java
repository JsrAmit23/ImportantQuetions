package ArraysQuestions;

public class NegativeElementAside {
    public static void main(String[] args) {
        int a[]={1,2,3,-2,3,-1,6,-9};
        negativeElements(a);
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");

    }
    static int [] negativeElements(int a[]){

        int temp,j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                if(i!=j){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
                j++;
            }
        }


        return a;
    }
}

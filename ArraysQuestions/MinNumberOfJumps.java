package ArraysQuestions;

public class MinNumberOfJumps {
    public static void main(String[] args) {
        int a[] = {1, 4, 3, 2, 6, 7,2,3,4,5,67,8,9};

        System.out.println(minNumberOfjumps(a));
    }

    private static int minNumberOfjumps(int[] a) {
        int cout=0;
        int i=0;
        int sum = 0;
        while(i<=a.length){
            if(a[i]==0){
                return 0;
            }else
            {
                i = a[i+1];
                cout++;
                if(i<a.length){
                    sum = sum+a[i];
                }
                else return cout;

            }
            if(sum>a.length){
               cout++;
                break;
            }

        }

        return cout;
    }
}

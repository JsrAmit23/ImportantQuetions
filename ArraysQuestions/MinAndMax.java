package ArraysQuestions;

public class MinAndMax {

    static class Pairs{
        int minValue;
        int maxValue;


        static Pairs getMinMax(int a[]){
            Pairs pairs = new Pairs();
            int n = a.length;
            if(n==1){
                pairs.maxValue=a[0];
                pairs.minValue=a[0];
                return pairs;
            }
            if(a[0]>a[1]){
                pairs.minValue=a[1];
                pairs.maxValue=a[0];

            }else{
                pairs.maxValue=a[1];
                pairs.minValue=a[0];

            }
            for(int i=2;i<a.length;i++){
                if(a[i]> pairs.maxValue){
                    pairs.maxValue=a[i];
                }else if(a[i]< pairs.minValue){
                    pairs.minValue=a[i];
                }
            }

            return pairs;
        }

    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};
        Pairs p = Pairs.getMinMax(a);
        System.out.println(p.maxValue);
        System.out.println(p.minValue);
    }

}

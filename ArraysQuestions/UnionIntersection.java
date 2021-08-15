package ArraysQuestions;

public class UnionIntersection {
    public static void main(String[] args) {
        int b[]={1,2,3,4,5};
        int a []={1,2,6,7,8,3,9,10};
     //   union(a,b);
        intersection(a,b);
    }

    static void union(int a[],int b[])
    {
        int i=0,j=0,m=a.length,n=b.length;
        while(i<m && j<n)
        {
            if(a[i]<b[j]){
                System.out.print(a[i++]+" ");
            }else if(a[i]>b[j]){
                System.out.print(b[j++]+" ");

            }else{
                System.out.print(b[j++]+" ");
                i++;
            }
        }
        while (i<m){
            System.out.print(a[i++]+" ");
        }
        while (j<n){
            System.out.print(b[j++]+" ");
        }

    }

    static void intersection(int a[],int b[]){
        int i=0,j=0,m=a.length,n=b.length;
        while(i<m && j<n){
            if(a[i]<b[j])
                i++;
            else if (b[j] < a[i])
                j++;
            else {
                System.out.print(b[j++]+" ");
                i++;
            }
        }
    }
}

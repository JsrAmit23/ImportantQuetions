package RecursionQues;

import java.util.ArrayList;
import java.util.Scanner;

public class GetStairsPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> paths=getStairsPath(n);
        System.out.println(paths);

    }

    private static ArrayList<String> getStairsPath(int n) {
        if(n==0){
            ArrayList<String> baseCase = new ArrayList<>();
            baseCase.add("");
            return baseCase;
        }else if(n<0){
            ArrayList<String> baseCase = new ArrayList<>();
            return baseCase;
        }

        ArrayList<String> path1 = getStairsPath(n-1);
        ArrayList<String> path2 = getStairsPath(n-2);
        ArrayList<String> path3 = getStairsPath(n-3);

        ArrayList<String> paths = new ArrayList<>();
        for(String path: path1){
            paths.add(path+1);
        }
        for(String path: path2){
            paths.add(path+2);
        }
        for(String path: path3){
            paths.add(path+3);
        }

        return paths;

    }
}

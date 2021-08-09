package RecursionQues;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //sr - Source Row
        //sc - Source Column
        //dr - Destination Row
        //dc - Destination Column

        int sr = scanner.nextInt();
        int sc = scanner.nextInt();
        int dr = scanner.nextInt();
        int dc = scanner.nextInt();

        ArrayList<String> paths = getMazePath(sr, sc, dr, dc);
        System.out.println(paths);
    }

    private static ArrayList<String> getMazePath(int sr, int sc, int dr, int dc) {

        if(sr==dr && sc==dc){
            ArrayList<String> baseCase = new ArrayList<>();
            baseCase.add("");
            return baseCase;
        }

        ArrayList<String> verticalPath = new ArrayList<>();
        ArrayList<String> horizontalPath = new ArrayList<>();

        if (sr < dr) verticalPath = getMazePath(sr + 1, sc, dr, dc);
        if (sc < dc) horizontalPath = getMazePath(sr, sc + 1, dr, dc);
        ArrayList<String> paths = new ArrayList<>();
        for(String path:verticalPath){
            paths.add("v"+path);
        }
        for(String path:horizontalPath){
            paths.add("h"+path);
        }
        return paths;

    }
}

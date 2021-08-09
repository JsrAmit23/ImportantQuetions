package ArraysQuestions;

import java.util.Vector;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 1, 2, 3, 4, 2, 1, 1, 4, 2, 1};
        System.out.println(frequencyOfElement(a, 2));
    }

    static int frequencyOfElement(int a[], int x) {
        int count = 0;
        Vector<Integer> frequencyCounter = new Vector<>();
        for (int i = 0; i < a.length; i++) {
            if (!frequencyCounter.contains(a[i]) && a[i]==x) {
                count++;
                frequencyCounter.add(a[i]);

            } else if (frequencyCounter.contains(a[i]) && a[i]==x )
                count++;
        }
        return count;
    }
}
package Sorts;

import java.util.ArrayList;

/**
 * Created by Michael Sloma on 9/7/2017.
 */
public class InsertionSort {
    // O(n^2)
    public static ArrayList<Double> insertionSort(ArrayList<Double> toBeSorted){
        for(int i = 1; i < toBeSorted.size(); i++){
            if (toBeSorted.get(i) < toBeSorted.get(i - 1)){
                for(int j = i; j > 0; j--) {
                    if (toBeSorted.get(j) < toBeSorted.get(j - 1)) {
                        double temp = toBeSorted.get(j);
                        toBeSorted.set(j, toBeSorted.get(j - 1));
                        toBeSorted.set((j - 1), temp);
                    }
                }
            }
        }
        return toBeSorted;
    }
}

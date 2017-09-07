package Sorts;

import java.util.ArrayList;

/**
 * Created by Michael Sloma on 9/7/2017.
 */
public class MergeSort {
    //O(nglogn) time
    //O(n) extra space
    static void merge(ArrayList<Double> toBeSorted, int startIndex, int half, int endIndex){
        // Find sizes of two subarrays to be merged
        int leftSize = half - startIndex + 1;
        int rightSize = endIndex - half;

        /* Create temp arrays */
        ArrayList<Double> L = new ArrayList<>();
        ArrayList<Double> R = new ArrayList<>();

        /*Copy data to temp arrays*/
        for (int i=0; i < leftSize; ++i)
            L.add(toBeSorted.get(startIndex + i));
        for (int j=0; j<rightSize; ++j)
            R.add(toBeSorted.get((half + 1) + j));

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = startIndex;
        while (i < leftSize && j < rightSize)
        {
            if (L.get(i) <= R.get(j))
            {
                toBeSorted.set(k, L.get(i));
                i++;
            }
            else
            {
                toBeSorted.set(k, R.get(j));
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < leftSize)
        {
            toBeSorted.set(k, L.get(i));
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < rightSize)
        {
            toBeSorted.set(k, R.get(j));
            j++;
            k++;
        }
    }

    static void sort(ArrayList<Double> toBeSorted, int startIndex, int endIndex){
        if (startIndex < endIndex) {
            int half = (endIndex + startIndex) / 2;
            sort(toBeSorted, startIndex, half);
            sort(toBeSorted, half + 1, endIndex);

            merge(toBeSorted, startIndex, half, endIndex);
        }
    }

    public static void mergeSort(ArrayList<Double> toBeSorted){
        sort(toBeSorted, 0, toBeSorted.size() - 1);

        //return toBeSorted;
    }
}

package rvt;

public class BinarySearch {
    public static int binarySearch(int[] array, int searchedId) {
        int begin = 0; 
        int end = array.length - 1;

        while (begin <= end) {
            int middle = (end + begin) / 2; 

            if (array[middle] == searchedId) {
                return middle;

            } else if (array[middle] < searchedId) {
                begin = middle + 1;
                
            } else {
                end = middle - 1;
            }
        }
        
        return -1; 
    }
}

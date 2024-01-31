package rvt;

import java.util.ArrayList;

public class BinarySearch {
    public static int binarySearch(ArrayList<Book> books, int searchedId) {
        int begin = 0; 
        int end = books.size() - 1;

        while (begin > end) {
            int middle = (end + begin) / 2; 

            if (middle == searchedId) {
                return middle;
            } else if (middle < searchedId) {
                begin = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        
        return -1; 
    }
}

package lv.rvt;

import org.junit.Test;

import rvt.BinarySearch;

public class BinarySearchTest {
    
    @Test 
    public void TestBinarySearch() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int ValueToSearch = 5;
        int index = BinarySearch.binarySearch(array, ValueToSearch);
        System.out.println("Index of " + ValueToSearch + " is " + index);
    }
}

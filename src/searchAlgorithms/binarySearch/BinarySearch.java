package searchAlgorithms.binarySearch;

import searchAlgorithms.linearSearch.DataSet;

public class BinarySearch {

    public static void main(String[] args) {
        DataSet dataSet = new DataSet(1000000);
        int searchNumber = 999999;
        boolean isFound = false;
        int low = 0;
        int high = dataSet.getSize() - 1;
        int mid = 0;
        while (low < high) {
            dataSet.numberTry++;
            mid = low + (high - low)/2;
            if (dataSet.data[mid] == searchNumber) {
                System.out.println("Number is found after " + dataSet.numberTry + " try");
                isFound = true;
                break;
            }
            if (dataSet.data[mid] < searchNumber) {
                low = mid + 1;
            }
            if (dataSet.data[mid] > searchNumber) {
                high = mid - 1;
            }
        }
        if (!isFound) {
            System.out.println("Number is not found");
        }
    }
}

package sort;

public class QuickSort {

    static void quickSort(int[] arr, int low, int high) {
        int mid = low + (high - low)/2;
        int i = low;
        int j = high;
        int pivot = arr[mid];
        while(i <= j) {
            while(arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if ( i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) {
            quickSort(arr, low, j);
        }
        if (high > i) {
            quickSort(arr, i, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,4,1,1,1,2};
        System.out.println("Before Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\nAfter Sort");
        quickSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}

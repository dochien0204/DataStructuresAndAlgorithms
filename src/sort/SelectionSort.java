package sort;

public class SelectionSort {

    static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for(int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            if (index != i) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,5,2,4,67,8,34,2};
        System.out.println("Before Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\nAfter Sort");
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}

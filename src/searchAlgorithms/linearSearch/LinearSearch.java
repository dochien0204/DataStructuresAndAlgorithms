package searchAlgorithms.linearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        DataSet dataSet = new DataSet(10000);
        int searchNumber = 100;
        boolean isFound = false;
        for (int i = 0; i < dataSet.getSize(); i++) {
            dataSet.numberTry++;
            if (dataSet.data[i] == searchNumber) {
                System.out.println("Element is found after " + dataSet.numberTry + " try");
                isFound = true;
                break;
            }
        }
        if (isFound == false) {
            System.out.println("Element not found");
        }
    }
}

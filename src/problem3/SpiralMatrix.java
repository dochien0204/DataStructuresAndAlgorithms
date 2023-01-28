package problem3;

public class SpiralMatrix {

    public SpiralMatrix() {

    }

    public static void main(String[] args) {
        int[][] array = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        new SpiralMatrix().printSpiralMatrix(array);
    }

    void printSpiralMatrix(int[][] array) {
        int firstColumn = 0;
        int lastColumn = array[0].length - 1;
        int firstRow = 0;
        int lastRow = array.length - 1;

        while(firstRow < lastRow && firstColumn < lastColumn) {

            //up
            for(int i = firstColumn; i <= lastColumn; i++) {
                System.out.println(array[firstRow][i]);
            }

            //right
            for(int i = firstRow + 1; i <= lastRow; i++) {
                System.out.println(array[i][lastColumn]);
            }

            //bottom
            for(int i  = lastColumn - 1; i >= firstColumn; i--) {
                System.out.println(array[lastRow][i]);
            }

            //left
            for(int i = lastRow - 1; i >= firstColumn + 1; i--) {
                System.out.println(array[i][firstColumn]);
            }

            firstRow++;
            lastRow--;
            firstColumn++;
            lastColumn--;
        }
    }
}

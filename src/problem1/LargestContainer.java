package problem1;

public class LargestContainer {

    int largestContainer(int[] array) {
        int maxArea = Integer.MIN_VALUE;
        int begin = 0;
        int end = array.length - 1;
        while(begin < end) {
            int width = end - begin;
            int height = Math.min(array[end], array[begin]);
            int area = width * height;
            maxArea = Math.max(area, maxArea);
            if(array[begin] < array[end]) {
                begin++;
            } else {
                end--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int area = new LargestContainer().largestContainer(new int[]{1,8,6,2,5,4,8,3,7});
        System.out.println("Area: " + area);
    }
}

package recursion;

import java.util.HashSet;
import java.util.Set;

public class Problem2 {

    Set<Integer> visited = new HashSet<>();
    int length(int[] a ,int index) {
        if (visited.contains(index)) {
            return 0;
        }
        if(a[index] == -1 || a[index] >= a.length) {
            return 1;
        }
        return length(a, a[index]) + 1;
    }
    public int solution(int[] a) {
        int len = length(a, 0);
        return len;
    }
    public static void main(String[] args) {
        int len = new Problem2().solution(new int[]{2,-1,3,1,5});
        System.out.println("len = " + len);
    }
}

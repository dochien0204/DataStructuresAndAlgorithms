package problem2;

import java.util.ArrayList;
import java.util.List;

public class LongSubsequenceOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,0,1,1,0,1,1};
        List<Integer> list = new ArrayList<>();
        int sequenceOnesTotal = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                sequenceOnesTotal++;
                if(i == arr.length - 1) {
                    list.add(sequenceOnesTotal);
                }
            } else {
                if(sequenceOnesTotal > 0) {
                    list.add(sequenceOnesTotal);
                }
                list.add(arr[i]);
                sequenceOnesTotal = 0;
            }
        }
        System.out.println(list);
        int maxSequence = 0;
        for(int i = 0; i < list.size(); i++) {
            int len = list.get(i);
            if((i + 1) < list.size()) {
                len += 1;
            }
            if((i+2) < list.size()) {
                len += list.get(i + 2);
            }
            if( len > maxSequence) {
                maxSequence = len;
            }
        }
        System.out.println(maxSequence);
    }
}

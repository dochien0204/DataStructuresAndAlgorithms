package problem8;

import java.util.ArrayList;
import java.util.Stack;

public class ClimbingStair {

    public static void main(String[] args) {
        //example step = 4;
        int step = 2;
        Stack<Stair> stairStack = new Stack<>();
        stairStack.add(new Stair(0, new ArrayList<Integer>()));
        while (!stairStack.isEmpty()) {
            Stair currentStair = stairStack.pop();
            if(currentStair.number == step) {
                System.out.println(currentStair.visited);
                continue;
            }

            int oneStair = currentStair.number + 1;
            if(oneStair <= step) {
                stairStack.add(new Stair(oneStair, currentStair.visited));
            }

            int twoStair = currentStair.number + 2;
            if (twoStair <= step) {
                stairStack.add(new Stair(twoStair, currentStair.visited));
            }
        }
    }
}

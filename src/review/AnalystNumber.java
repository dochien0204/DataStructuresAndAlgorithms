package review;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnalystNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(AnalystNumber.analystNumber(n));
    }

    public static List<Integer> analystNumber(int n ) {
        List<Integer> list = new ArrayList<>();
        int i = 2;
        while (n != 0 && i <= n) {
            if (n % i == 0) {
                list.add(i);
                n = n / i;
            } else {
                i++;
            }
        }
        return list;
    }


}

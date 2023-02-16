package review;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        boolean isPrime = A.isPrime(n);
//        if (isPrime) {
//            System.out.println(n + " la so nguyen to");
//        } else {
//            System.out.println(n + " ko la so nguyen to");
//        }
        List<Integer> list = A.printPrimeNumber(n);
        System.out.println(list);
    }

    public static boolean isPrime( int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> printPrimeNumber(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            if (i < 2) {
                continue;
            }
            if (i == 2 || i == 3) {
                list.add(i);
                continue;
            }
            if (i % 2 == 0) {
                continue;
            }
            for (int j = 3; j <= i; j+=2) {
                if (j == i) {
                    list.add(i);
                    break;
                }
                if (i % j == 0) {
                    break;
                }
            }
        }
        return list;
    }
}

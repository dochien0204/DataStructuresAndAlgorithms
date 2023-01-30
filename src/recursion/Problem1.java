package recursion;

public class Problem1 {
    public void solution(int n) {
        if (n == 0 ) {
            return;
        }
        solution(n - 1);
        StringBuilder sb = new StringBuilder();
        if (n % 2 == 0) {
            sb.append("Codility");
        }
        if (n % 3 == 0) {
            sb.append("Test");
        }
        if (n % 5 == 0) {
            sb.append("Coders");
        }
        if (sb.length() == 0) {
            System.out.println(n);
        } else {
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        new Problem1().solution(9);
    }
}

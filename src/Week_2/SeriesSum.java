package Week_2;
import java.util.*;

public class SeriesSum {
    public static void main(String[] args) {
        System.out.println("Enter a number : 2");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0, s1 = 0, i;

        for (i = 1; i <= n; i++) {
            s1 += i * i;
            sum += s1;
        }

        System.out.println(sum);

        sc.close();
    }
}

//Calculation of Simple Interest for 3 sets of p, n, and r

package siusingwhileloop;
import java.util.*;

public class SiUsingWhileLoop {
    public static void main(String[] args) {
        float p, r, si;
        int n, count;
        Scanner sc;
        count = 1;

        sc = new Scanner (System.in);
        while (count <= 3)
        {
            System.out.println("Enter value of p, n, r");
            p = sc.nextFloat();
            n = sc.nextInt();
            r = sc.nextFloat();
            si = p * n * r / 100;
            System.out.println("Simple Interest = Rs."+si);
            count = count + 1;
        }
    }
}
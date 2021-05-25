package summation;
import java.util.Scanner;
import factorial.findfactorial;

public class findsummation {
    public static double sum(int n) {
        findfactorial ob = new findfactorial();
        double sum = 0;
        for(int i=1;i<=n;i++) {
            sum+=i/ob.fact(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range");
        int x = sc.nextInt();
        double summ = sum(x);
        System.out.println("Summation is :" + summ);
    }
}

import java.util.*;

public class q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = sc.nextLine();
        System.out.println(
            "Enter 1 for changing to lowercase" +
            " Enter 2 for changing to uppercase" +
            " Enter 3 for reversing the string" +
            " Enter 4 for comparing two strings" +
            " Enter 5 to concat two strings"
        );
        int c = sc.nextInt();
        switch (c) {
            case 1:
                str = str.toLowerCase();
                System.out.println(str);
                break;
            case 2:
                str = str.toUpperCase();
                System.out.println(str);
                break;
            case 3:
                StringBuilder sb = new StringBuilder(str);
                sb.reverse();
                System.out.println(sb.toString());
                break;
            case 4:
                System.out.println("Enter Second string");
                String str2 = sc.nextLine();
                boolean x = str.equals(str2);
                String result = x ? "Equal" : "Not Equal";
                System.out.println(result);
                break;
            case 5:
                System.out.println("Enter second string");
                String str3 = sc.nextLine();
                str = str.concat(str3);
                System.out.println(str);
                break;
            default:
                System.out.println("Wrong Choice! Try Again");
                break;
        }
    }
}
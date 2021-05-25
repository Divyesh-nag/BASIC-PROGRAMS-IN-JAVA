
import java.util.*;

public class q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = sc.nextLine();
        System.out.println(" Enter 1 to concat two strings\n"+
            "Enter 2 for changing to lowercase\n"+
            "Enter 3 for changing to uppercase\n"+
            "Enter 4 for comparing two strings\n"+
	    "Enter 5 for indexof for the string\n"+
            "Enter 6 for charat for the string\n");
        int c = sc.nextInt();
        switch (c) {
            case 1:
                System.out.println("Enter second string");
                String str1 = sc.nextLine();
                str = str.concat(str1);
                System.out.println(str);
                break;
            case 2:
                str = str.toLowerCase();
                System.out.println(str);
                break;
            case 3:
                str = str.toUpperCase();
                System.out.println(str);
                break;
            case 4:
                System.out.println("Enter Second string");
                String str2 = sc.nextLine();
                boolean x = str.equals(str2);
                String result = x ? "Equal" : "Not Equal";
                System.out.println(result);
                break;
            case 5:
                System.out.println("string index of from the above string");
                System.out.println(str.indexOf("h"));
                break;
            case 6:
		char s=str.charAt(4);
                System.out.println(s);
                break;

            default:
                System.out.println("Wrong Choice! Try Again");
                break;
        }
    }
}
import java.util.Scanner;
public class name{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
String first,last;
System.out.println("enter the first name: ");
first=in.nextLine();
System.out.println("enter the last name: ");
last=in.nextLine();
System.out.println("NAME IS: ");
System.out.println(last+ " " +first);
}
}
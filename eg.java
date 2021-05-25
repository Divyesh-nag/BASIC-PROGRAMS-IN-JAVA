import java.util.*;

class eg{
public static void main(String[] args)
{

Scanner n=new Scanner(System.in);
System.out.println("enter the string");
String s1= n.nextLine();
String s2=s1+args[0];
System.out.println(s2);
}
}
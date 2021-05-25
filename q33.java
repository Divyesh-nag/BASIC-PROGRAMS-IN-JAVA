import java.io.*;
import java.util.*;

public class q3{
    public static void main(String[] args)throws Exception {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter a number:");
	int c=Integer.parseInt(br.readLine());
	first(c);
}
	private static void first(int a)throws Exception{
	second(a);
}
	private static void second(int b)throws Exception{
	Exception propagate=new Exception("value is small");
	if(b<4)
	throw propagate;
	System.out.println("not an exception");
}
}
	

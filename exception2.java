import java.util.*;

class exception2{
public static void main(String[] args)
{
try{
int y=0;
int x=20/y;
}
catch(ArithmeticException x){
System.out.println("Caught an Exception in Arithmetic logic");
}
catch(Exception x){
System.out.println("Caught an Exception");
}
}
}


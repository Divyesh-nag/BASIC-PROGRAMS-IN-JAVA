import java.util.*;

class exception3{
public static void main(String[] args)
{
try{
int y=0;
int x=20/y;
}
catch(ArithmeticException e){
System.out.println("Caught an Exception");
}
finally{
System.out.println("This is a default Statement");
}
}
}


import java.util.*;

class biggest_3{
public static void main(String[] args)
{

int x = Integer.parseInt(args[0]);
int y = Integer.parseInt(args[1]);
int z = Integer.parseInt(args[2]);

if(x>y && x>z)
{
System.out.println("Largest number is:"+x);
}
else if(y>x && y>z)
{
System.out.println("Largest number is:"+y);
}
else

{
System.out.println("Largest number is:"+z);
}
}
}
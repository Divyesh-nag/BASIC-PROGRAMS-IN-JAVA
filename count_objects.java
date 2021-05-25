public class count_objects

{
static int count=0;
count_objects()
{
count++;
}
public static void main(String[] args)
{
count_objects obj1=new count_objects();
count_objects obj2=new count_objects();
count_objects obj3=new count_objects();
System.out.println("Number of objects created:"+count);
}
}
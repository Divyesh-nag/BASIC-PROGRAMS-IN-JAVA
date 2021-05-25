import java.util.*;
class shape
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("enter radius,length and breadth");
int r,l,b;
r=in.nextInt();
l=in.nextInt();
b=in.nextInt();
circle ca=new circle();
ca.r1=r;
ca.showarea();
rectangle ra=new rectangle();
ra.l1=l;
ra.b1=b;
ra.showarea();

}
}

class circle extends shape
{
int r1;

void showarea()
{

System.out.println("circle area="+(3.142*r1*r1));

}
}
class rectangle extends shape
{
int l1,b1;
void showarea()
{




System.out.println("rectangle area="+(l1*b1));
}
}
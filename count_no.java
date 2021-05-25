import java.util.Scanner;
public class count_no
{
public static void main(String[] args)
{
int n,x,count=0,i;
Scanner s=new Scanner(System.in);
System.out.println("Enter no. of elements you want in array:");
n=s.nextInt();
int num[]=new int[n];
System.out.println("Enter all the elements:");
for(i=0;i<n;i++)
{
num[i] = s.nextInt();
}
System.out.println("Enter the element of which you want to count number of occurrences:");
x=s.nextInt();
for(i=0;i<n;i++)
{
if(num[i]==x)
{
count++;
}
}
System.out.println("Number of cccurrence of the element:"+count);
}
}
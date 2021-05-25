import java.util.Scanner;
public class arrange
{
public static void main(String[] args)
{
int temp;
Scanner sc = new Scanner(System.in);
int num[] = new int[15];
System.out.println("Enter array elements:");
for (int i=0;i<15;i++)
{
num[i]=sc.nextInt();
}
for(int i=0;i<14;i++)
{
for(int j=0;j<(15-i-1);j++) {
if(num[j]>num[j+1])
{
temp=num[j];
num[j]=num[j+1];
num[j+1]=temp;
}
}
}
System.out.print("Array Elements in Ascending Order: ");
for (int i=0;i<15;i++)
{
System.out.print(num[i]+ " ");
}
}
}
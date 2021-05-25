import java.util.Scanner;
class palindrome {
public static void main(String args[])
{
int num;
Scanner in = new Scanner(System.in);
System.out.println("enter a number= ");
num = in.nextInt();
int temp = num,r = 0,sum = 0;
while(temp!=0)
{
r = temp%10;
sum = (sum*10)+r;
temp = temp/10;
}
if(num == sum)
System.out.println("palindrome number");
else
System.out.println("not a palindrome number");
}
}
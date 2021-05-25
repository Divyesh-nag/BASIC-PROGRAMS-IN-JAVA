import java.util.Scanner;
class even_odd{
public static void main(String[] args)
{
Scanner n=new Scanner(System.in);
int ctr1=0,ctr2=0;
System.out.println("Enter any 10 number's");
int num[]=new int[10];
for(int i=0;i<10;i++) {
num[i]= n.nextInt();
if(num[i]%2==0)
ctr1++;
else{
ctr2++;
}
System.out.println("\nNumber of even elements in the array: ", +ctr1);
System.out.println("\nNumber of odd elements in the array: ", +ctr2);
}
}
}
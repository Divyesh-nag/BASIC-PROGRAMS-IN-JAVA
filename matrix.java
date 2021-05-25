import java.util.Scanner;

public class matrix
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the Size of square matrix");
int n=sc.nextInt();
int mat[][]=new int[n][n];
System.out.println("Enter The Numbers in The matrix : ");
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
mat[i][j]=sc.nextInt();
}
System.out.println("The Matrix :");
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
System.out.print(mat[i][j]+ " ");
System.out.println();
}
int  d_left=0,d_right=0;
for (int i=0;i<n;i++)
{
for (int j=0;j<n;j++){
if(i==j)
d_left=d_left+mat[i][j];
if((i+j)==2)
d_right=d_right+mat[i][j];
}
}
System.out.println("Left Diagonal:"+d_left);
System.out.println("Right Diagonal:"+d_right);
}
}
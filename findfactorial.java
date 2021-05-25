package factorial;
public class findfactorial{
public double fact(int n){

if(n==1||n==0)
return 1;
else
return (n * fact(n-1));

}
}

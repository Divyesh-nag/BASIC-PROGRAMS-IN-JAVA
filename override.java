import java.util.*;

class account{
	int acc_no;
	double balance;
account(int a, double b){
	acc_no=a;
	balance=b;
}
void disp(){
System.out.println("Account No: "+acc_no);
System.out.println("Balance is: "+balance);
}
}

class person extends account{
    String name;
 	int aadhar;
     person(int a,double b,String c,int d){
        super(a,b);
	name=c;
	aadhar=d;
    }
    void disp(){
        super.disp();
	System.out.println("Name: "+name);
	System.out.println("Aadhar no: "+aadhar);    
}
}
class override{
    public static void main(String args[]){
        person p= new person(2893810,18921.23,"David",1920035029);
	p.disp();
    }
}
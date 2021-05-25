import java.util.*;
abstract class student{
	int roll,reg_no;
student(int x,int y){
roll=x;
reg_no=y;
}
abstract void course();
}

class kiitian extends student{
kiitian(int x,int y){
super(x,y);
}
void course(){
	System.out.println("roll no is: "+roll);
	System.out.println("registraion no is: "+reg_no);
	System.out.println("the course of study is Enginnering");
}
}

public class details{
public static void main(String[] args){
kiitian k = new kiitian(1929013,1900215876);
k.course();
}
}



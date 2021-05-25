class q3 {

public void area(int x){
double area=3.14*x*x;
System.out.println("area of circle is"+area);
}


public void area(int x,int y){
double area=x*y;
System.out.println("area of rectangle is"+area);
}

public void area(int x,int y,int z){
double area=x*y*z;
System.out.println("area of cube is"+area);
}
public static void main(String[] args){
q3 ob=new q3();
ob.area(4);
ob.area(3,5);
ob.area(2,1,6);
}
}
import java.util.*;

class exception1{
public static void main(String[] args){

try{
int c[]={1,3,14};
c[10]=42;
}
catch(ArrayIndexOutOfBoundsException c){
System.out.println("Caught an Exception");
}
}
}


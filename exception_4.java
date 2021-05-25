import java.util.*;

public class exception_4 {

    static void processInput(int num){ 
        if(num<0){  
	throw new NegativeNumberException(e);
	System.out.println("Negative Number");
}
        else{
        System.out.println("The Number "+(double)num+" is Positive");
    }
}
    
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
                    int num = sc.nextInt();
	try{

            processInput(num);
        } 
        catch(NegativeNumberException e){
            System.out.println("Exception Occured : The Number is Negative");
        }
    }
    
}
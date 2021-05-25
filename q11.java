
import java.util.*;

class InvalidAgeException extends Exception {
    InvalidAgeException(String n) {
        super(n);
    }
}

public class q1{

   static void display(int num)throws InvalidAgeException{
        if (num<18){
            throw new InvalidAgeException("Age value is less than 18");
        }
	else
            System.out.println(" Eligible to vote ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int num=sc.nextInt();
        try{
            display(num);
        } 
        catch(Exception e){
            System.out.println(e);
        }
    }
}
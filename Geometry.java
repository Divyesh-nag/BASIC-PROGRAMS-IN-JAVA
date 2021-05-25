import java.util.Scanner;


public class Geometry


{


   public static void main(String args[])


    {


      Scanner s=new Scanner(System.in);


      System.out.println("MENU:");


      System.out.println("Enter c for Area of a Circle");


      System.out.println("Enter s for Area of a Square");


      System.out.println("Enter r for Area of a Rectangle");


      char op=s.next(). charAt(0);


      switch(op)


      {


        case 'c': System.out.println("Enter radius:");


                  float r=s.nextFloat();


                  float ac=3.14f*r*r;


                  System.out.println("Area:"+ac);


                  break;


        case 's': System.out.println("Enter side:");


                  int x=s.nextInt();


                  int as=x*x;


                  System.out.println("Area:"+as);


                  break;


        case 'r': System.out.println("Enter height and base:");


                  float h=s.nextFloat();


                  float bs=s.nextFloat();


                  float art=0.5f*h*bs;


                  System.out.println("Area:"+art);


                  break;


        default: System.out.println("Wrong choice");


       }


  }


}
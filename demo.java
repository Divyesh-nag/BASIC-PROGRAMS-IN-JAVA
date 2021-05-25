class CheckArgumentException extends Exception{
    CheckArgumentException(String s) {
        super(s);
    }
}
public class demo{
    public static int Sum(int args,int[] argumentsArray) throws CheckArgumentException{
        int sum=0;
        if(args<4)
            throw new CheckArgumentException("The Number of Arguments passed in the CLI is less than 4");
        else{
            for(int i=0;i<args;i++){
                sum=sum+(argumentsArray[i]*argumentsArray[i]);
            }
        }
        return sum;
    } 
    public static void main(String[] args) {

        int[] argumentsArray=new int[args.length];
        for(int i=0;i<args.length;i++){argumentsArray[i]= Integer.parseInt(args[i]);}

        try{
            int result=Sum(args.length,argumentsArray);
            System.out.println("The Sum of the Sqaures of the numbres is: "+result);
        }
        catch(CheckArgumentException e){
            System.out.println(e);
        }
        
    }
}
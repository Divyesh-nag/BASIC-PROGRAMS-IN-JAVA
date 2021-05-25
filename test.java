import java.io.*;

class test{

    public static void main(String[] args)throws IOException{
int i=0;
FileInputStream fin;
try{
fin=new FileInputStream("abc.txt");
}
catch(FileNotFoundException e){      
System.out.println("file not found");
return;
}
do{
i=fin.read();
if(i!=-1)
System.out.print((char)i);
}while(i!=-1);
fin.close();
}
}
import java.io.*;

class q7{

    public static void main(String[] args)throws IOException{
int i=0;
FileInputStream fin;
FileOutputStream fout;
try{
fin = new FileInputStream("abc.txt");
}
catch(FileNotFoundException e){
System.out.println("file not found");
return;
}

try{
fout=new FileOutputStream("xyz.txt");
}
catch(FileNotFoundException e){
System.out.println("error opening file");
return;
}

try{
do{
i=fin.read();
if(i!=-1)
fout.write(i);
}while(i!=-1);
}
catch(IOException e){
System.out.println("file error");
}
fin.close();
fout.close();
}
}
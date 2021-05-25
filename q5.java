import java.io.*;

class q5{

    public static void main(String[] args)throws IOException{
int i=0;
String str=("hello my name is divyesh nag");
FileWriter fw = new FileWriter("newtext.txt");
for(i=0;i<str.length();i++)
fw.write(str.charAt(i));
fw.close();

FileInputStream fin;
try{
fin=new FileInputStream("newtext.txt");
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
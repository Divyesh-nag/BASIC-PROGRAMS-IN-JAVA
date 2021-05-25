import java.io.*;

class test1{

    public static void main(String[] args)throws IOException{
int i=0;
String str="NAME - DIVYESH NAG");
FileWriter fw = new FileWriter("xyz.txt");
for(i=0;i<str.length();i++)
fw.write(str.charAt(i));
fw.close();
}
}

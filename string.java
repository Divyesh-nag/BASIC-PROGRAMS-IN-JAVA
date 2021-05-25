
import java.util.*;
class string
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        
        String s1,s2="",s3="";
        int i,j,k,len,n1,n2,c=0,c1=0,c2=0;
        char ch;
        System.out.println("Enter a paragraph with 2 sentences terminated with ? or . or !");
        s1=in.nextLine().toUpperCase();
        len=s1.length();
        j=0;
        for(i=0;i<len;i++)
        {
            ch=s1.charAt(i);
            if(ch=='.'|| ch=='?'||ch=='!')
            {
                c++;
                if(c==1)
                {
                    s2=s1.substring(j,i+1);
                    j=i+1;
                }
                else if(c==2)
                {
                    s3=s1.substring(j,i+1).trim();
                }
                else
                {
                    break;
                }
                    
            }
        }
        if(c!=2)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            System.out.println(s2);
            System.out.println(s3);
            //removing punctuation mark
            s2=s2.substring(0,s2.length()-1);
            s3=s3.substring(0,s3.length()-1);
            StringTokenizer st1=new StringTokenizer(s2);
            StringTokenizer st2=new StringTokenizer(s3);
            n1=st1.countTokens();
            n2=st2.countTokens();
            String arr1[]=new String[n1];
            String arr2[]=new String[n2];
            for(i=0;i<n1;i++)
            {
                arr1[i]=st1.nextToken();
            }
            for(i=0;i<n2;i++)
            {
                arr2[i]=st2.nextToken();
            }
            //Searching for Common Word
            c=0;
            for(i=0;i<n1;i++)
            {
                c1=0;
                for(j=0;j<i;j++)
                {
                    if(arr1[i].equals(arr1[j]))
                    {
                        c1++;
                    }
                }
                    
                if(c1==0)
                {
                    for(j=0;j<n2;j++)
                    {
                        if(arr1[i].equals(arr2[j]))
                        {
                            c1++;
                            c++;
                        }
                    }
                    if(c1!=0)
                    {
                        c2=0;
                        for(k=0;k<n1;k++)
                        {
                            if(arr1[i].equals(arr1[k]))
                            {
                                c2++;
                            }
                        }
                        for(k=0;k<n2;k++)
                        {
                            if(arr1[i].equals(arr2[k]))
                            {
                                c2++;
                            }
                        }
                        System.out.println(arr1[i]+"\t"+c2);
                    }
                }
            }
            if(c==0)
            {
                System.out.println("No Common word Found");
            }
            
        }
        
    }
}

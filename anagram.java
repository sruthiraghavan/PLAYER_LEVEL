import java.util.*;
import java.io.*;
class anagram
{
    public static void main(String args[])
    {
        String s=args[0].toLowerCase();
        String s1=args[0].toLowerCase();
        char[] a=s.toCharArray();
        char[] b=s1.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        int x=0;
        if(a.length==b.length)
        {
            for(int i=0;i<a.length;i++)
            {
                if(a[i]==b[i])
                {
                    x++;
                }
            }
            if(x==a.length)
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }
        }
        else
        {
            System.out.println("no");
        }
    }
}

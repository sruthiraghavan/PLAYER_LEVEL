import java.util.*;
class swapoe
{
public static void main(String args[])
{
char[] c=args[0].toCharArray();
if(args[0].length()%2==0)
{
for(int i=0;i<args[0].length();i=i+2)
{
System.out.print(c[i+2]);
System.out.print(c[i]);
}
}
else
{
for(int i=0;i<args[0].length()-1;i=i+2)
{
System.out.print(c[i+1]);
System.out.print(c[i]);
}
}
System.out.print(c[args[0].length()-1]);
}
}

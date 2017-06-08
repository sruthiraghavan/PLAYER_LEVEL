import java.util.*;
class lowup
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in); 
String s=sc.nextLine();
char[] ch=s.toCharArray();
for(int i=0;i<s.length();i++)
{
if(Character.isLowerCase(ch[i]))
{
System.out.print(Character.toUpperCase(ch[i]));
}
else
{
System.out.print(Character.toLowerCase(ch[i]));
}
}
}
}

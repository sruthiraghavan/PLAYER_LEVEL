import java.util.*;
class intsort
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
String str=scan.nextLine();
char[] ch=str.toCharArray();
Arrays.sort(ch);
String s=new String(ch);
System.out.println(s);
}
}

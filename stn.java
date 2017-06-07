class stn
{
  public static void main(String args[])
  {
StringBuffer sb=new StringBuffer(args[0]);
System.out.println(sb.reverse());
String s=new String(sb);
char[] ch=s.toCharArray();
for(int i=0;i<s.length();i++)
{
int flag=0;
if(ch[i]=='a' || ch[i]=='A' || ch[i]=='e' || ch[i]=='E' || ch[i]=='i' || ch[i]=='I' || ch[i]=='o' || ch[i]=='O' || ch[i]=='u' || ch[i]=='U')
{
flag++;
}
if(flag==0)
System.out.print(ch[i]);
}
}
}


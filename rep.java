import java.util.*;

public class rep {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int n=in.nextInt();
		int m=0,v=0,k=0;
		String s1=String.valueOf(n);
		int[] a=new int[s1.length()];
		for(String s2:s1.split(""))
		{
			a[k++]=Integer.valueOf(s2);
		}
		for(int i=0;i<s1.length();i++)
		{
			for(int j=i+1;j<s1.length();j++)
			{
				if(a[i]==a[j]&&m==0)
				{
					System.out.println("1st Repeat --->"+a[i]); 
					m++;
				}
			}
			
		}
	}

}

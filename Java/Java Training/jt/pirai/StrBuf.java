package jt.pirai;
import java.util.*;
public class StrBuf {

	public static void main(String[] args) {
		StringBuffer buffer =new StringBuffer("");
		Scanner scanner=new Scanner(System.in);
		buffer.append(scanner.next());
		int n=scanner.nextInt();
		String x = "";
		int l=buffer .length();
		for (int i = 0; i < l; i++)
		{
			if (buffer.length() < n) {
				char c = 'z';
				for(int j=0;j<buffer.length();j++)
				{
					if(buffer.charAt(j)<=c)
					{
						c=buffer.charAt(j);
					}
				}
				x = x + c;
				for(int z=0;z<buffer.length();z++) {
					if(buffer.charAt(z)==c)
					{
						buffer.deleteCharAt(z);
						break;
					}
				}
			}
			else
			{
				String s=buffer.substring(0,n);
				char c='z';
				for(int j=0;j<s.length();j++)
				{
					if(s.charAt(j)<=c)
					{
						c=s.charAt(j);
					}
				}
				x=x+c;
				
				for(int z=0;z<buffer.length();z++) {
					if(buffer.charAt(z)==c)
					{
						buffer.deleteCharAt(z);
						break;
					}
				}
			}
		}
		System.out.println(x);

	}

}

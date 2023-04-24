package March_14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Common_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String para =s.nextLine().toLowerCase();
		String ban = s.next();
		Pattern p=Pattern.compile("[\\s,]+");
		String[] s1=p.split(para); 
		List<String>arr = new ArrayList<>();

		for(String s2:s1)
		{
			if(!s2.equals(ban)) {
			arr.add(s2);
			}
		}
		 
		System.out.println(arr);
		
	}
}


	
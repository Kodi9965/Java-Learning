package training;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFunction {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList();
		name.add("Kodi");
		name.add("Senthil");
		name.add("Sabarees");
		name.add("Akash");
		name.add("Ramji");
		String s="KODI";
		System.out.println(name);
		
//		List<String> name1=name.stream().map(i->i.toUpperCase()).collect(Collectors.toList());
//		System.out.println(name1);
		List<String> name1=name.stream().map(i->i.toUpperCase()).collect(Collectors.toList());
		System.out.println(name1);
		long a = name.stream().filter(n->n.length()==5).count();
		System.out.println(a);
		List<String> b = name.stream().sorted().collect(Collectors.toList());
		System.out.println(b);
		List<String> c = name.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println(c);
	}

}

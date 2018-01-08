package Examples;

import java.util.HashSet;

public class Set {

	public static void main(String[] args)
	{
		HashSet<String> hset=new HashSet<>();
		hset.add("hi");
		hset.add("Good");
		hset.add("morning");
		hset.add("hi");
		System.out.println(hset);
	}
}

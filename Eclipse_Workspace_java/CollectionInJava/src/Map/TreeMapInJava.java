package Map;

import java.util.TreeMap;

public class TreeMapInJava {

	public static void main(String[] args) {
		TreeMap<Integer , String> treemap = new TreeMap<Integer, String>((a,b)->b-a);
		treemap.put(2, "one");
		treemap.put(1, "two");
		treemap.put(3, "three");
		System.out.println(treemap);

	}

}

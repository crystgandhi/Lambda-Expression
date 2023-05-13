package Streams;
import java.util.*;
import java.util.stream.Collectors;
public class Evennumbers {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrL=new ArrayList<Integer>();
		arrL.add(9568);
		arrL.add(7128);
		arrL.add(5645);
		arrL.add(45321);
		arrL.add(254386);
		arrL.forEach(n -> {if (n % 2 == 0)System.out.println(n);
        });
		ArrayList<String> arrL2=new ArrayList<String>();
		arrL2.add("John");
		arrL2.add("Katie");
		arrL2.add("Bob");
		System.out.println(arrL2.contains("katie"));
		arrL2.forEach(n->System.out.println(n));
		List<String> ls=arrL2.stream().sorted().map((l)->l.toUpperCase()).collect(Collectors.toList());
		System.out.println(arrL2);
		System.out.println(ls);
		
	}

}

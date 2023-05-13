package Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples2 {

	public static void main(String[] args) {
		Stream<String> c1=	Stream.of("Java", "Python", "C#", "Ruby", "Javascript", ".net");
	Stream<String> c2 = Stream.of("Selenium", "Cucumber", "Testng", "Maven", "Javascript", "SQL");
	Stream<String> c3= Stream.concat(c1, c2);
	c3.sorted().distinct().forEach((c)->System.out.println(c));
	
	List<String> ls= Stream.of("Java", "Python", "C#", "Ruby", "Javascript", ".net")
	.filter((l) -> l.startsWith("J")).sorted().map((l)->l.toUpperCase()).collect(Collectors.toList());
	System.out.println(ls);
	System.out.println((ls).get(0));
	
	Stream.of(7,8,5,4,9,1,6,4,5,6).distinct().forEach((n)->System.out.println(n));
	List<Integer>li=Stream.of(7,8,5,4,9,1,6,4,5,6).distinct().sorted().collect(Collectors.toList());
	System.out.println(li.get(6));
	}
	
}

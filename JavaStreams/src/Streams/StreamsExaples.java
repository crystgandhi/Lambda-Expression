package Streams;

import java.util.stream.Stream;

public class StreamsExaples {

	public static void main(String[] args) {

		Stream.of("Java", "Python", "C#", "Ruby", "Javascript", ".net").filter((l) -> l.startsWith("J")).sorted()
				.forEach((l) -> System.out.println(l));
		System.out.println();
		Stream.of("Java", "Python", "C#", "Ruby", "Javascript", ".net").filter((l) -> l.length()>3).sorted().forEach((l)->System.out.println(l));
		System.out.println();
		Stream.of("Java", "Python", "C#", "Ruby", "Javascript", ".net")
		.filter((l) -> l.startsWith("R")).sorted().map((l)->l.toUpperCase())
		.forEach((l)->System.out.println(l));
		System.out.println();
		Stream.of("Java", "Python", "C#", "Ruby", "Javascript", ".net")
		.filter((l) -> l.length()>3).sorted().map((l)->l.toUpperCase())
		.forEach((l)->System.out.println(l));
		System.out.println();
		Stream.of("Java", "Python", "C#", "Ruby", "Javascript", ".net")
		.filter((l) -> l.length()>3).sorted().map((l)->l.toUpperCase()).limit(3)
		.forEach((l)->System.out.println(l));
	}
}

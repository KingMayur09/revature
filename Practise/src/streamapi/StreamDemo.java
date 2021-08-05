package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> num=new ArrayList<>();
		num.add(8);
		num.add(9);
		num.add(6);
		num.add(2);
		num.add(3);
		
		num.stream().limit(2).forEach(System.out::println);
		
		System.out.println("\n creating stream of squares");
		num.stream().map(e->e*e).forEach(System.out::println);
		
		System.out.println("\n creating stream of squares and creating new list");
		List<Integer>sqaureNum= num.stream().map(e->e*e).collect(Collectors.toList());
		sqaureNum.stream().forEach(e->System.out.println(e));
		
		System.out.println("\n filtering the list");
		num.stream().filter(e->e>5).forEach(System.out::println);
		
		System.out.println("\n sorting the list");
		num.stream().sorted().forEach(System.out::println);


	}

}

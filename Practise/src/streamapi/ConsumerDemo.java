package streamapi;

import  java.util.ArrayList;
import java.util.List;

public class ConsumerDemo {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		List<Integer> num=new ArrayList<>();
		num.add(8);
		num.add(9);
		num.add(6);
		num.add(2);
		num.add(3);
		
		num.forEach(a->	System.out.println(a));
		
		System.out.println("\n printing using mthod refernce");
		num.stream().forEach(System.out::println);
		
	}

}

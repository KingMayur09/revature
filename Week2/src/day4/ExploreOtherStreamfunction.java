package day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.*;

public class ExploreOtherStreamfunction {

	public static void main(String[] args) {
		List<Integer> list=  Arrays.asList(12,18,36,48,60,96,102);
		boolean check=list.stream().allMatch(e->e%3==0);
		System.out.println(check);
		
		List<Integer> list1=  Arrays.asList(1,2,3,4,5,6,7);
		boolean check1=list1.stream().anyMatch(e->e>6);
		System.out.println(check1);
		 
		List<Integer> list2=  Arrays.asList(1,1,2,2,3,2,3,4,4,5,6,7);
		list2.stream().distinct().forEach(e->System.out.print(e+" "));
	}

}

/*allMatch(Predicate predicate)
 * function returns true if either all elements
of the stream match the provided predicate or 
the stream is empty, otherwise false.
 */
//distinct()
//returns a stream consisting of the distinct 
//elements.
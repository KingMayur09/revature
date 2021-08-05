package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class StreamObjectDemo {

	public static void main(String[] args) {
		List<Bus> busList = new ArrayList<>();
		busList.add(new Bus(100, "Abc Travels", 1200.22, 2.3f));
		busList.add(new Bus(101, "Abc Travels", 1100.22, 2.4f));
		busList.add(new Bus(190, "Xyz Travels", 1100.22, 2.3f));
		busList.add(new Bus(200, "Jee Travels", 1000.22, 4.3f));
		busList.add(new Bus(104, "Java Travels", 900.22, 4.3f));
		busList.add(new Bus(111, "Xyz Travels", 1400.22, 4.3f));
		
//		List<Bus> busWithHighrating=new ArrayList<>();
//		for(Bus bus:busList) {
//			if(bus.getRating()>4) {
//				busWithHighrating.add(bus);
//			}
//		}
//		System.out.println("with aurthodox methods");
//		for(Bus bus:busWithHighrating) {
//			System.out.println(bus);
//		}
		System.out.println("\n using stream and lambda functions  ");
		
		busList.stream().filter(e->e.getRating()>4).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("\n using stream and lambda functions firt saving it into list and then print it ");
		
		List<Bus> highratngbuses=busList.stream().filter(e->e.getRating()>4).collect(Collectors.toList());
		highratngbuses.stream().forEach(System.out::println);
		
		float total=busList.stream()
				.filter(e->e.getProviderName().equals("Abc Travels"))
				.map(e->e.getRating())
				.reduce(0.0f,(sum,element)->sum+element);
		float totalAbcTravelscount=busList.stream().filter(e->e.getProviderName().equals("Abc Travels")).count();
		
		System.out.println("\n Average rating"+total/totalAbcTravelscount);

	}

}

//task1
//find the minimum price in "xyz travels";
//
//calculate total and print bill.
//item,price ,Qty,line total(price*qty)
//bill total=total of linetotal+ 5%tax
//iteams needs to be sortd based on item name

//task3:explore
//task4: convert List to map vice versa using stream api;









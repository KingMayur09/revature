package day4;

import java.util.ArrayList;
import java.util.List;
public class Print_Bill {

	public static void main(String[] args) {
		List<bill> newBill = new ArrayList<>();
		newBill.add(new bill("Chicken Rada",650,1));
		newBill.add(new bill("Tava Roti",10,10));
		newBill.add(new bill("Tandoori Roti",15,8));
		newBill.add(new bill("Jeera Rice",100,2));
		newBill.add(new bill("Water Bottle",20,3));
		
		//newBill.stream().forEach(System.out::println);
		double total = newBill.stream()
				.map(e->e.getLine_total())
				.reduce(0.0f, (sum,ele)->sum+ele);
		System.out.println("Item Name         Price    Qty     Totol");
		System.out.println("------------------------------------------");
		newBill.stream().sorted().forEach(e->System.out.printf("%15s %8.2f %4d %10.2f\n",e.getItem_name(),e.getPrice(),e.getQty(),e.getLine_total()));
		System.out.println("-------------------------------------------");
		System.out.println("(%5tax inclusive)   Final Total    "+(total*5/100+total));
	}

}

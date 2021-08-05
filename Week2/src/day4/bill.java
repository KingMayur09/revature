package day4;

public class bill implements Comparable<bill> {
	private String item_name;
	private float price;
	private int qty;
	private float line_total;
	
	
	public bill() {}


	public bill(String item_name, float price, int qty) {
		super();
		this.item_name = item_name;
		this.price = price;
		this.qty = qty;
		line_total = price*qty;
	}


	public String getItem_name() {
		return item_name;
	}


	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}


	public float getLine_total() {
		return line_total;
	}


	public void setLine_total(float line_total) {
		this.line_total = line_total;
	}
	
	
	@Override
	public String toString() {
		return  item_name  + price +  qty +  line_total ;
	}

	@Override
	public int compareTo(bill o) {
		String i1=this.item_name;
		String i2=o.item_name;
		return i1.compareTo(i2);
	}
	

}

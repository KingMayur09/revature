package day2;

public class toLastUppercase {

	public static void main(String[] args) {
		String str="hi hello what are you doing";
		String[] s=str.split(" "); 
		StringBuffer sb=new StringBuffer();
		for(String x:s) {
			
			sb.append(x.substring(0,x.length()-1)).append(x.substring(x.length()-1).toUpperCase()).append(" ");
		}
		System.out.println(sb.toString().trim());
			

	}

}

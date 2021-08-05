package day2;

public class OddMidUpper {
	public static void main(String[] args) {
		String str="hii hello my name is mayur ";
		String[] s=str.split(" ");
		StringBuffer sb=new StringBuffer();
		for(String x:s) {
			int mid=x.length()/2;
			if(x.length()%2==1) {
				sb.append(x.substring(0,mid)).append(x.substring(mid,mid+1).toUpperCase()).append(x.substring(mid+1)).append(" ");		
			}
			else {
				sb.append(x.substring(0,1).toUpperCase()).append(x.substring(1)).append(" ");
			}
		}
		System.out.println(sb.toString().trim());
	}
}

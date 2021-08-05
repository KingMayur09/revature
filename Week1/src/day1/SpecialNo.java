package day1;

public class SpecialNo {

	public static void main(String[] args) {
		int arr[]= {121,2,654,345,111,123,212,11,786};
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<arr.length;i++) {
			String str=arr[i]+"";
			if(str.charAt(0)!=str.charAt(str.length()-1)) {
				sb.append(str).append(" ");
			}
		}
		System.out.println(sb.toString().trim());
	}

}

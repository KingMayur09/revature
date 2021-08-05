package day2;

public class checkPalindromAndReverseIfNot {

	public static void main(String[] args) {
		String str="madam you are in radar of police";
		String st[]=str.split(" ");
		StringBuffer sb=new StringBuffer();
		for(String s:st) {
			if(isPalindrome(s)) {
				sb.append(s).append(" ");
			}
			else {
				StringBuffer temp=new StringBuffer();
				temp.append(s).reverse();
				sb.append(temp).append(" ");
			}
		}
		System.out.println(sb.toString().trim());

	}
	public static boolean isPalindrome(String s1) {
		StringBuffer temp=new StringBuffer();
		if(s1.equals(temp.append(s1).reverse().toString())) {
			return true;
		}
		else {
			return false;
		}
	}

}

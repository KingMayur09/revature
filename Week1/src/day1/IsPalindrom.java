package day1;

import java.util.Arrays;

public class IsPalindrom {

	public static void main(String[] args) {
		int[] arr= {1231,212,234,34543,123,876};
		StringBuffer palindromNos=new StringBuffer();
		//String str = palindromNos.append(arr[0]+"").toString();
		//System.out.println(str);
		System.out.println(palindromNos.reverse().toString());
		for (int i = 0; i < arr.length; i++) {
			StringBuffer sb=new StringBuffer();
			String str = sb.append(arr[i]+"").toString();
			//System.out.println(str+"=="+sb.reverse().toString());
			if(str.equals(sb.reverse().toString())) {
				System.out.println(str+" ");
			}
			
		}
		
		//System.out.println(palindromNos.toString());
			
		}

	}

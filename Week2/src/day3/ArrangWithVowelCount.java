package day3;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class ArrangWithVowelCount {
	
/*Tasks : 
         Arrange the sentence by words with the word which is having highest vowel count first and followed by rest, 
	     if two or more words have same vowel count then arrange it reverse alphabetical order*/

	public static void main(String[] args) {
		String str= "hey hello everyone its getting complicated right that's why we should wrap up the tasks given on same day but we rarely stick to it sad";
		System.out.println(arrangeWithVowelCount(str));
	
	}
	public static String arrangeWithVowelCount(String s) {
		 
		Map<Integer, String> map1 = new TreeMap<>();
		String st[]=s.split(" ");
		Arrays.sort(st);
		for(String x:st) {
			int vowelCount=vowelCount(x);
			if(map1.containsKey(vowelCount)) {
				String temp=map1.get(vowelCount);
				temp=temp+" "+x;
				map1.put(vowelCount, temp);
			}
			else {
				map1.put(vowelCount, x);
				
			}
		}
		System.out.println("map : "+map1);
		StringBuilder sb =new StringBuilder();
		for(Entry<Integer,String> e:map1.entrySet()) {
			sb.append(e.getValue()).append(" ");
		}
		return sb.toString().trim();
	}
	
	public static int vowelCount(String s) {
		int count=0;
		char[] ch = s.toCharArray();
		for(char c:ch) {
			if(c=='a' || c=='e'||c=='i'||c=='o'||c=='u') {
				count++;
			}
		}
		return count;
	}
	
}


/*Tasks - 1)Arrange the sentence by words with the word which is having highest vowel count first and followed by rest, 
if two or more words have same vowel count then arrange it reverse alphabetical order*/
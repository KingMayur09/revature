package day3;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Arrays;

public class ArrangewordsNonRepeatingVowel {
/*Tasks : 
    Arrange the sentence by words with the word which is having highest vowel count first and followed by rest, 
     if two or more words have same vowel count then arrange it reverse alphabetical order,you should only count unique vowel count 
     i.e if a word is having aeeeeee like that so that count of vowel is 2 not 8
*/

	public static void main(String[] args) {
		String str="hey hello everyone its getting complicated right that's why we should wrap up the tasks given on same day but we rarely stick to it sad";
		System.out.println(arrangeWordsNonRepeatingVowel(str));
	}
	public static String arrangeWordsNonRepeatingVowel(String s) {
		Map<Integer,String> map=new TreeMap<>();
		String st[]=s.split(" ");
		Arrays.sort(st);
		for(String x:st) {
			int non_repeating_vowel_count=vowelCount(x);
			if(map.containsKey(non_repeating_vowel_count)) {
				String temp=map.get(non_repeating_vowel_count);
				temp=temp+" "+x;
				map.put(non_repeating_vowel_count, temp);
			}
			else {
				map.put(non_repeating_vowel_count, x);
			}
		}
		StringBuffer sb=new StringBuffer();
		for(Entry<Integer,String> e:map.entrySet()) {
			sb.append(e.getKey()).append("==").append(e.getValue()).append(" ");
		}
		return sb.toString().trim();
	}
	public static int vowelCount(String s) {
		int count=0;
		Map<Character,Boolean> m=new TreeMap<>();
//		Boolean present=false;
		m.put('a',false);
		m.put('e', false);
		m.put('i', false);
		m.put('o', false);
		m.put('u', false);
		char chr[]=s.toCharArray();
		for(Character ch:chr) {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' && m.get(ch)==false) {
				count++;
				//present=true;
				m.replace(ch, false, true);
			}
		}
		return count;
		
	}

}


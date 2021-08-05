package day1;
import java.util.Arrays;
import java.util.Scanner;

public class Nth_Max_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr= {11,12,12,34,32,45,11,22,55,43,98};
		int[] arrR=new int[arr.length];
		Arrays.sort(arr);
		int j=1;
		arrR[0]=arr[0];
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]!=arr[i+1]) {
				arrR[j]=arr[i+1];
				j++;
			}
		}
	
		System.out.println(n+"th max in Array is: "+arrR[j-n]);//will give the Nth max from array.
		
		

	}

}

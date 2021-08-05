package day1;

public class isPrime {

	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,7,8,9};
		for(int x:arr) {
			if(isPrime(x)) {
				System.out.print(x+" ");
			}
		}
		

	}
	public static boolean isPrime(int y) {
		if(y==2) {
			return true;
		}
		for(int i=2;i<=Math.sqrt(y);i++) {
			if(y%i==0) {
				return false;
			}
		}
		return true;
		
	}

}

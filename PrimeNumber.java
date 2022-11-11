package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = 7;
		boolean num = false;
		for(int i= 2; i<=n/2;i++) {
			if(n%i==0) {
				num =true;
				break;
				
			}
		}
   if (!num) {
	   System.out.println("this prime number");
   }
   else {
	   System.out.println("this is not prime number");
   }
	}
   

}

package week1.day2;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = {1,3,5,6,7,8};
		for(int i=0;i<=arr. length-1;i++) {
			if(arr[i]!=(i+1)) {
				System.out.println("missing number" +(i+1));
				 break;
			}
		}
			
			

	}

}

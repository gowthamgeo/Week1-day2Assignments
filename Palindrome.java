package week1.day2;

public class Palindrome 
{
	public static void main(String[] args)
{
		int num=89898;
	    int pal;
	    int sum =0;
	   
	   	int temp=num;
	 while(num>0) 
 {
		 pal=num%10;
		 sum=(sum*10)+pal;
		 num=num/0;
	 }
	 if(temp==sum)
 {
		 System.out.println(temp +"the numbe");
	 }
	 else
 {
		 System.out.println(temp +"the numbe");
		 
	 }
	}
}

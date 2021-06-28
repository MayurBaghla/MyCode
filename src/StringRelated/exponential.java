package StringRelated;

public class exponential {

	public static void main(String[] args) {

		reverse();
		int base=9;
		int exponential=8;
		
		
		long result=1;
		
		while (exponential!=0)
		{
			
			result *= base; //reverse=reverse*base
			--exponential;
						
		}
		System.out.println(result);
	}
	
	//reverse
	
	public static void reverse()
	{
		int num=12345;
		int rev=0;
		while(num!=0)
		{
			int n=num%10;
			rev  =rev*10+ n;
			
			num=num/10;
					
					
		}
		
		System.out.println(rev);
	}

}

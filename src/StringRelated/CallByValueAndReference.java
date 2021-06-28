package StringRelated;

public class CallByValueAndReference {

	public static void main(String[] args) {
		CallByValueAndReference obj = new CallByValueAndReference();
		int x=40;
		int y=50;
		int result= obj.testsum(x, y);
		
		System.out.println(result);
		
		
	}

	public int testsum(int a,int b)
	{
		a=10;
		b=20;
		int c=a+b;
		return c;
		
	}
}

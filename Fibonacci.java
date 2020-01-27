class Fibonacci
{
public static void main(String[] args)
{
	int n = Integer.parseInt(args[0]);
	System.out.println("No. ofitems: " + n);
	int a,b,c,i;
	
	a=0;
	b=1;
	System.out.println(a);
	System.out.println(b);
	for(i=1;i<n;i++)
	{
		c = a+b;
		a = b;
		b = c;
		System.out.println(c);
	}
}
}
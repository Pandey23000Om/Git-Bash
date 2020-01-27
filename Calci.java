class Calci
{
public static void main(String args[])
{
	int n = Integer.parseInt(args[0]);
	char c = args[2].charAt(0);
	int m = Integer.parseInt(args[1]);
	
	
	switch(c)
	{
		case '+': System.out.println( n+m ); 
				break;
		case '-': System.out.println( n-m ); 
				break;
		case '/': System.out.println( n/m ); 
				break;
		case '%': System.out.println( n%m ); 
				break;
		case 'x': 	n*=m;
				System.out.println( n ); 
				break;
		default: System.out.println("NULL");
	}
}
}
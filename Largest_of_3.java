class Largest_of_3
{
public static void main(String[] args) 
{

	int c = ( Integer.parseInt(args[0]) > Integer.parseInt(args[1]) )?( ( Integer.parseInt(args[0]) > Integer.parseInt(args[2]) )?Integer.parseInt(args[0]):Integer.parseInt(args[2]) ): 	(Integer.parseInt(args[1])>Integer.parseInt(args[2])?Integer.parseInt(args[1]): Integer.parseInt(args[2]));
		
	System.out.println( "Greatest : " + c );	
}
}
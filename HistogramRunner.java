public class HistogramRunner
{
	public static void main(String args[])
	{
		Histogram hist = new Histogram("1 5 3 4 5 5 5 4 3 2 5 5 5 3", 8);
		System.out.println( hist );
		hist.changeCount( 3, 1 );   	
		hist.changeCount( 13, 5 );		
		hist.changeCount( 5, -2 );		
		hist.changeCount( 2 , 3 ); 
		System.out.println( hist ); 	
		System.out.println( hist.getMax() );
		
		System.out.println("");
		
		hist.reset("1 1 1 -91 1 1 1 5 3 3 3 99 5 5 3", 6);
		System.out.println( hist );
		hist.changeCount( 5, 10 );   	
		hist.changeCount( 1, -3 );	
		hist.changeCount( 4, 10203 );	
		hist.changeCount( 0, 7 );		
		hist.changeCount( 2 , 3 );  	
		System.out.println( hist ); 	
		System.out.println( hist.getMax() );		
	}
}
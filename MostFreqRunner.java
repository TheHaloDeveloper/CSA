public class MostFreqRunner
{
	public static void main( String args[] )
	{		
        RayMostFreq rmf = new RayMostFreq();
		
		System.out.println( rmf.go( new int[]{-99,1,2,3,4,5,6,6,6,6,6,7,8,9,10,12345,5,5,5,5} ) );
		System.out.println( rmf.go( new int[]{10,9,8,7,6,5,4,3,2,1,-99} ) );
		System.out.println( rmf.go( new int[]{10,20,30,40,50,10,10,40,30,20,10} ) );
		System.out.println( rmf.go( new int[]{32767} ) );
		System.out.println( rmf.go( new int[]{255,255} ) );
		System.out.println( rmf.go( new int[]{9,10,-88,100,-555,1000} ) );
		System.out.println( rmf.go( new int[]{10,10,10,11,456,10,10,2,2,2,2,2,2,2} ) );
		System.out.println( rmf.go( new int[]{-111,1,2,3,9,11,20,30} ) );
		System.out.println( rmf.go( new int[]{9,8,7,6,5,4,3,2,0,-2,-989} ) );
		System.out.println( rmf.go( new int[]{12,12,15,18,21,23,1000} ) );
		System.out.println( rmf.go( new int[]{250,19,17,15,13,13,13,13,11,10,9,6,3,2,1,1} ) );	
		System.out.println( rmf.go( new int[]{9,10,-8,10000,-5000,1000} ) );										
	}
}
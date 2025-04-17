public class BiggestRunner
{
	public static void main( String args[] ) throws Exception
	{
		int[][] a = {{1,2,3},{5,5,5,5}};
        int[][] b = {{1,2,3},{-5},{11},{21,2}};
        int[][] c = {{1,2},{-5,5},{5,5},{4,5,6,7},{123124,12312}};
        int[][] d = {{-20, -40},{-234,-234234 } };

		System.out.println( "The biggest number is :: " + Biggest.getBig(a) );
        System.out.println( "The biggest number is :: " + Biggest.getBig(b) );
		System.out.println( "The biggest number is :: " + Biggest.getBig(c) );
        System.out.println( "The biggest number is :: " + Biggest.getBig(d) );
	}
}

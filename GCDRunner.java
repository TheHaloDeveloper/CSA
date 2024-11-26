public class GCDRunner
{
	public static void main ( String[] args ) {
        GCD gcd = new GCD();

        System.out.println(gcd.toString(5, 25));
        System.out.println(gcd.toString(4, 400));
        System.out.println(gcd.toString(8, 80));
        System.out.println(gcd.toString(15, 45));
        System.out.println(gcd.toString(6, 66));
        System.out.println(gcd.toString(9, 9));
        System.out.println(gcd.toString(9, 543));
        System.out.println(gcd.toString(15, 40));
        System.out.println(gcd.toString(6, 51));
	}
}
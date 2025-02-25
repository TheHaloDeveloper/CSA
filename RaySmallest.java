public class RaySmallest
{
	public static int go(int[] ray)
	{
        int smallest = ray[0];
		for (int x : ray) {
            if (x < smallest) {
                smallest = x;
            }
        }
        return smallest;
	}
}
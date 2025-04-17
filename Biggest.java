public class Biggest
{
    public static int getBig(int[][] m)
    {
		int biggest = m[0][0];
        for (int[] x : m) {
            for (int y : x) {
                if (y > biggest) {
                    biggest = y;
                }
            }
        }
        return biggest;
    }
}
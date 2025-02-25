public class RayMostFreq
{
	public static int go(int[] ray)
	{
        int maxCount = 0;
        int maxNum = 0;

        for (int num : ray) {
            int count = 0;
            for (int i : ray) {
                if (num == i) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxNum = num;
            }
        }

        return maxNum;
	}
}
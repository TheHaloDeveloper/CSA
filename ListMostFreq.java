import java.util.ArrayList;

public class ListMostFreq
{
	public static int go(ArrayList<Integer> ray)
	{
		int maxCount = 0;
		int mostFreq = ray.get(0);

		for (int i = 0; i < ray.size(); i++) {
			int count = 0;
			for (int j = 0; j < ray.size(); j++) {
				if (ray.get(i).equals(ray.get(j))) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				mostFreq = ray.get(i);
			}
		}
		return mostFreq;
	}
}
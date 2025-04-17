import java.util.List;
import java.util.ArrayList;

public class ArrayListFunHouse
{
	public static ArrayList<Integer> getListOfFactors(int number)
	{
		ArrayList<Integer> factors = new ArrayList<>();
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				factors.add(i);
			}
		}
		return factors;
	}

	public static void keepOnlyCompositeNumbers(List<Integer> nums) {
		for (int i = nums.size() - 1; i >= 0; i--) {
			int n = nums.get(i);
			if (n <= 3) {
				nums.remove(i);
				continue;
			}

			boolean c = false;
			for (int j = 2; j <= Math.sqrt(n); j++) {
				if (n % j == 0) {
					c = true;
					break;
				}
			}
			if (!c) nums.remove(i);
		}
	}
}
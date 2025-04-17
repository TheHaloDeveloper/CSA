import java.util.List;
import java.util.ArrayList;

public class ListTotal
{
	public static int go( List<Integer> ray )
	{
		int total = 0;
        for (int x : ray) {
            total += x;
        }
        return total;
	}
}
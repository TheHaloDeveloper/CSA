public class ForLoopDemo
{
	public static void runForLoop(int start, int stop, int increment )
	{
        System.out.println("start " + start + " : stop " + stop + " : increment " + increment);
        
        for (int i = start; i <= stop; i += increment) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
	}
}
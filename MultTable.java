public class MultTable {
    private int number;
    private int stop;

    public MultTable(int n, int s) {
        this.number = n;
        this.stop = s;
    }

    public void printTable() {
        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= stop; i++) {
            System.out.println(i + "     " + i * number);
        }
        System.out.println();
    }
}
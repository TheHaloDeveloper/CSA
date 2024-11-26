public class MultTableRunner {
    public static void main(String[] args) {
        MultTable table1 = new MultTable(5, 5);
        MultTable table2 = new MultTable(3, 7);
        MultTable table3 = new MultTable(1, 6);
        MultTable table4 = new MultTable(9, 9);
        MultTable table5 = new MultTable(7, 8);

        table1.printTable();
        table2.printTable();
        table3.printTable();
        table4.printTable();
        table5.printTable();
    }
}
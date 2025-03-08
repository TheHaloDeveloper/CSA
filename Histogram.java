public class Histogram {
    private int[] numCount;

    public Histogram(String line, int size) {
        reset(line, size);
    }

    public void reset(String line, int size) {
        numCount = new int[size];
        String[] nums = line.split(" ");
        for (String num : nums) {
            int val = Integer.parseInt(num);
            if (val >= 0 && val < size) {
                numCount[val]++;
            }
        }
    }

    public void changeCount(int v, int a) {
        if (v >= 0 && v < numCount.length) {
            numCount[v] += a;
        }
    }

    public int getMax() {
        int maxIndex = 0;
        for (int i = 1; i < numCount.length; i++) {
            if (numCount[i] > numCount[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < numCount.length; i++) {
            output += i + " - " + numCount[i] + " | ";
        }
        return output;
    }
}
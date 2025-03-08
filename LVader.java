import java.util.Arrays;

public class LVader {
    private int[] stops;

    public LVader(int floors) {
        this.stops = new int[floors];
    }

    public boolean inRange(int num) {
        return num < stops.length;
    }

    public boolean incNumStops(int floor) {
        if (!inRange(floor)) {
            return false;
        }
        stops[floor]++;
        return true;
    }

    public int numStops(int floor) {
        if (!inRange(floor)) {
            return -1;
        }
        return stops[floor];
    }

    public int floorWithMostStops() {
        int maxStops = stops[0];
        
        for (int i = 1; i < stops.length; i++) {
            if (stops[i] > maxStops) {
                maxStops = i;
            }
        }
        return maxStops;
    }

    public String toString() {
        return Arrays.toString(stops);
    }
}